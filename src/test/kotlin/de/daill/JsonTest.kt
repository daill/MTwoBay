/*
 * Copyright 2021 Christian Kramer
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files
 *  (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge,
 *  publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do
 *  so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO
 * EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package de.daill

import de.daill.protocol.*
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromJsonElement
import org.junit.jupiter.api.Test

class JsonTest {
    @Test
    fun testGatewayIdentifyJson() {
        val prop = IdentifyProperties("linux", "browser", "browser")
        val payload = IdentifyPayload(token = "somestring", intents = 4, properties = prop)
        val identify = Identify(1, payload, 2)
        val s = Json.encodeToString(identify)
        println(s)
    }

    @Test
    fun testHeartbeatJson() {
        val testJson = "{\"t\":null,\"s\":null,\"op\":10,\"d\":{\"heartbeat_interval\":41250,\"_trace\":[\"[\\\"gateway-prd-main-3ljd\\\",{\\\"micros\\\":0.0}]\"]}}"
        val base = Json.decodeFromString<Base>(testJson)
        assert(true) { base.s == null }
        val heartbeat = Json.decodeFromJsonElement<Heartbeat>(base.d)
        assert(true) { heartbeat.heartbeat_interval == 41250 }
    }

    @Test
    fun testIdentifyJson() {
        val identifyProperties = IdentifyProperties("linux","weserbot", "weserbot")
        val identifyPayload = IdentifyPayload("hh", false, null,null, 7, identifyProperties, null)
        val identify = Identify(2, identifyPayload, 10)
        val identifyJson = Json.encodeToString(identify)
        print(identifyJson)
    }
 }