package de.daill.services.ebay

import de.daill.model.ebay.EbayEnvironments
import de.daill.model.ebay.EbayProperties
import okhttp3.*
import okhttp3.HttpUrl.Companion.toHttpUrlOrNull
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody.Companion.asRequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.io.File
import java.net.URLConnection
import java.time.*
import java.util.*

@Service
open class EbayApiClient() {
    val LOG = LoggerFactory.getLogger(this::class.java)
    val apiKey: MutableMap<String, String> = mutableMapOf()
    val apiKeyPrefix: MutableMap<String, String> = mutableMapOf()
    var username: String? = null
    var password: String? = null
    val baseUrl: String? = null
    var accessToken: String? = null
    var client = OkHttpClient()

    @Autowired
    lateinit var properties: EbayProperties
    var environment: EbayEnvironments = EbayEnvironments.SANDBOX

    val ContentType = "Content-Type"
    val Accept = "Accept"
    val Authorization = "Authorization"
    val JsonMediaType = "application/json"
    val FormDataMediaType = "multipart/form-data"
    val FormUrlEncMediaType = "application/x-www-form-urlencoded"

    val XmlMediaType = "application/xml"



    /**
     * Guess Content-Type header from the given file (defaults to "application/octet-stream").
     *
     * @param file The given file
     * @return The guessed Content-Type
     */
    fun guessContentTypeFromFile(file: File): String {
        val contentType = URLConnection.guessContentTypeFromName(file.name)
        return contentType ?: "application/octet-stream"
    }

    final inline fun <reified T> requestBody(content: T, mediaType: String = JsonMediaType): RequestBody =
        when {
            content is File -> content.asRequestBody(
                mediaType.toMediaTypeOrNull()
            )
            mediaType == FormDataMediaType -> {
                MultipartBody.Builder()
                    .setType(MultipartBody.FORM)
                    .apply {
                        // content's type *must* be Map<String, Any?>
                        @Suppress("UNCHECKED_CAST")
                        (content as Map<String, Any?>).forEach { (key, value) ->
                            if (value is File) {
                                val partHeaders = Headers.headersOf(
                                    "Content-Disposition",
                                    "form-data; name=\"$key\"; filename=\"${value.name}\""
                                )
                                val fileMediaType = guessContentTypeFromFile(value).toMediaTypeOrNull()
                                addPart(partHeaders, value.asRequestBody(fileMediaType))
                            } else {
                                val partHeaders = Headers.headersOf(
                                    "Content-Disposition",
                                    "form-data; name=\"$key\""
                                )
                                addPart(
                                    partHeaders,
                                    parameterToString(value).toRequestBody(null)
                                )
                            }
                        }
                    }.build()
            }
            mediaType == FormUrlEncMediaType -> {
                FormBody.Builder().apply {
                    // content's type *must* be Map<String, Any?>
                    @Suppress("UNCHECKED_CAST")
                    (content as Map<String, Any?>).forEach { (key, value) ->
                        add(key, parameterToString(value))
                    }
                }.build()
            }
            mediaType == JsonMediaType -> Serializer.moshi.adapter(T::class.java).toJson(content).toRequestBody(
                mediaType.toMediaTypeOrNull()
            )
            mediaType == XmlMediaType -> throw UnsupportedOperationException("xml not currently supported.")
            // TODO: this should be extended with other serializers
            else -> throw UnsupportedOperationException("requestBody currently only supports JSON body and File body.")
        }

    final inline fun <reified T> responseBody(body: ResponseBody?, mediaType: String? = JsonMediaType): T? {
        if(body == null) {
            return null
        }
        val bodyContent = body.string()
        if (bodyContent.isEmpty()) {
            return null
        }
        return when(mediaType) {
            JsonMediaType -> Serializer.moshi.adapter(T::class.java).fromJson(bodyContent)
            else ->  throw UnsupportedOperationException("responseBody currently only supports JSON body.")
        }
    }

    fun updateAuthParams(requestConfig: RequestConfig) {
        if (requestConfig.headers[Authorization].isNullOrEmpty()) {
            accessToken?.let { accessToken ->
                requestConfig.headers[Authorization] = "Bearer $accessToken "
            }
        }
    }

    final inline fun <reified T> request(requestConfig: RequestConfig, body : Any? = null): ApiInfrastructureResponse<T?> {
        val httpUrl = baseUrl?.toHttpUrlOrNull() ?: throw IllegalStateException("baseUrl is invalid.")

        // take authMethod from operation
        updateAuthParams(requestConfig)

        val url = httpUrl.newBuilder()
            .addPathSegments(requestConfig.path.trimStart('/'))
            .apply {
                requestConfig.query.forEach { query ->
                    query.value.forEach { queryValue ->
                        addQueryParameter(query.key, queryValue)
                    }
                }
            }.build()

        // take content-type/accept from spec or set to default (application/json) if not defined
        if (requestConfig.headers[ContentType].isNullOrEmpty()) {
            requestConfig.headers[ContentType] = JsonMediaType
        }
        if (requestConfig.headers[Accept].isNullOrEmpty()) {
            requestConfig.headers[Accept] = JsonMediaType
        }
        val headers = requestConfig.headers

        if(headers[ContentType] ?: "" == "") {
            throw kotlin.IllegalStateException("Missing Content-Type header. This is required.")
        }

        if(headers[Accept] ?: "" == "") {
            throw kotlin.IllegalStateException("Missing Accept header. This is required.")
        }

        // TODO: support multiple contentType options here.
        val contentType = (headers[ContentType] as String).substringBefore(";").toLowerCase()

        val request = when (requestConfig.method) {
            RequestMethod.DELETE -> Request.Builder().url(url).delete(requestBody(body, contentType))
            RequestMethod.GET -> Request.Builder().url(url)
            RequestMethod.HEAD -> Request.Builder().url(url).head()
            RequestMethod.PATCH -> Request.Builder().url(url).patch(requestBody(body, contentType))
            RequestMethod.PUT -> Request.Builder().url(url).put(requestBody(body, contentType))
            RequestMethod.POST -> Request.Builder().url(url).post(requestBody(body, contentType))
            RequestMethod.OPTIONS -> Request.Builder().url(url).method("OPTIONS", null)
        }.apply {
            headers.forEach { header -> addHeader(header.key, header.value) }
        }.build()

        val response = client.newCall(request).execute()
        val accept = response.header(ContentType)?.substringBefore(";")?.toLowerCase()

        // TODO: handle specific mapping types. e.g. Map<int, Class<?>>
        when {
            response.isRedirect -> return Redirection(
                    response.code,
                    response.headers.toMultimap()
            )
            response.isInformational -> return Informational(
                    response.message,
                    response.code,
                    response.headers.toMultimap()
            )
            response.isSuccessful -> return Success(
                    responseBody(response.body, accept),
                    response.code,
                    response.headers.toMultimap()
            )
            response.isClientError -> return ClientError(
                    response.message,
                    response.body?.string(),
                    response.code,
                    response.headers.toMultimap()
            )
            else -> return ServerError(
                    response.message,
                    response.body?.string(),
                    response.code,
                    response.headers.toMultimap()
            )
        }
    }


    fun parameterToString(value: Any?): String {
        when (value) {
            null -> {
                return ""
            }
            is Array<*> -> {
                return toMultiValue(value, "csv").toString()
            }
            is Iterable<*> -> {
                return toMultiValue(value, "csv").toString()
            }
            is OffsetDateTime, is OffsetTime, is LocalDateTime, is LocalDate, is LocalTime, is Date -> {
                return parseDateToQueryString(value)
            }
            else -> {
                return value.toString()
            }
        }
    }

    private final inline fun <reified T: Any> parseDateToQueryString(value : T): String {
        /*
        .replace("\"", "") converts the json object string to an actual string for the query parameter.
        The moshi or gson adapter allows a more generic solution instead of trying to use a native
        formatter. It also easily allows to provide a simple way to define a custom date format pattern
        inside a gson/moshi adapter.
        */
        return Serializer.moshi.adapter(T::class.java).toJson(value).replace("\"", "")
    }

    fun exchangeAccessToken(code: String) {
        val client = OkHttpClient()
        var environmentalCreds = properties!!.sandbox

        if (environment == EbayEnvironments.PRODUCTION) {
            environmentalCreds = properties!!.production
        }

        val requestData = StringBuilder()
        requestData.append("grant_type=authorization_code").append("&")
        requestData.append(String.format("redirect_uri=%s", environmentalCreds.redirectUri)).append("&")
        requestData.append(String.format("code=%s", code))
        val requestBody = requestData.toString().toRequestBody("application/x-www-form-urlencoded".toMediaTypeOrNull())
        var authHeader = String(Base64.getEncoder().encode("${environmentalCreds.appId}:${environmentalCreds.certId}".toByteArray()))

        val request: Request = Request.Builder().url(environment!!.apiEndpoint)
            .header("Authorization", "Basic $authHeader")
            .header("Content-Type", "application/x-www-form-urlencoded")
            .post(requestBody)
            .build()

        val response = client.newCall(request).execute()
        LOG.debug(response.body?.string())
        response.close()
    }

}
