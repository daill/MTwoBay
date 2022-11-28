# org.openapitools.client - Kotlin client library for Account API

## Requires

* Kotlin 1.3.61
* Gradle 4.9

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.ebay.com/sell/account/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdvertisingEligibilityApi* | [**getAdvertisingEligibility**](docs/AdvertisingEligibilityApi.md#getadvertisingeligibility) | **GET** /advertising_eligibility | 
*CountryApi* | [**getSalesTaxJurisdictions**](docs/CountryApi.md#getsalestaxjurisdictions) | **GET** /country/{countryCode}/sales_tax_jurisdiction | 
*CustomPolicyApi* | [**createCustomPolicy**](docs/CustomPolicyApi.md#createcustompolicy) | **POST** /custom_policy/ | 
*CustomPolicyApi* | [**getCustomPolicies**](docs/CustomPolicyApi.md#getcustompolicies) | **GET** /custom_policy/ | 
*CustomPolicyApi* | [**getCustomPolicy**](docs/CustomPolicyApi.md#getcustompolicy) | **GET** /custom_policy/{custom_policy_id} | 
*CustomPolicyApi* | [**updateCustomPolicy**](docs/CustomPolicyApi.md#updatecustompolicy) | **PUT** /custom_policy/{custom_policy_id} | 
*FulfillmentPolicyApi* | [**createFulfillmentPolicy**](docs/FulfillmentPolicyApi.md#createfulfillmentpolicy) | **POST** /fulfillment_policy/ | 
*FulfillmentPolicyApi* | [**deleteFulfillmentPolicy**](docs/FulfillmentPolicyApi.md#deletefulfillmentpolicy) | **DELETE** /fulfillment_policy/{fulfillmentPolicyId} | 
*FulfillmentPolicyApi* | [**getFulfillmentPolicies**](docs/FulfillmentPolicyApi.md#getfulfillmentpolicies) | **GET** /fulfillment_policy | 
*FulfillmentPolicyApi* | [**getFulfillmentPolicy**](docs/FulfillmentPolicyApi.md#getfulfillmentpolicy) | **GET** /fulfillment_policy/{fulfillmentPolicyId} | 
*FulfillmentPolicyApi* | [**getFulfillmentPolicyByName**](docs/FulfillmentPolicyApi.md#getfulfillmentpolicybyname) | **GET** /fulfillment_policy/get_by_policy_name | 
*FulfillmentPolicyApi* | [**updateFulfillmentPolicy**](docs/FulfillmentPolicyApi.md#updatefulfillmentpolicy) | **PUT** /fulfillment_policy/{fulfillmentPolicyId} | 
*KycApi* | [**getKYC**](docs/KycApi.md#getkyc) | **GET** /kyc | 
*LocationApi* | [**createInventoryLocation**](docs/LocationApi.md#createinventorylocation) | **POST** /location/{merchantLocationKey} | 
*LocationApi* | [**deleteInventoryLocation**](docs/LocationApi.md#deleteinventorylocation) | **DELETE** /location/{merchantLocationKey} | 
*LocationApi* | [**disableInventoryLocation**](docs/LocationApi.md#disableinventorylocation) | **POST** /location/{merchantLocationKey}/disable | 
*LocationApi* | [**enableInventoryLocation**](docs/LocationApi.md#enableinventorylocation) | **POST** /location/{merchantLocationKey}/enable | 
*LocationApi* | [**getInventoryLocation**](docs/LocationApi.md#getinventorylocation) | **GET** /location/{merchantLocationKey} | 
*LocationApi* | [**getInventoryLocations**](docs/LocationApi.md#getinventorylocations) | **GET** /location | 
*LocationApi* | [**updateInventoryLocation**](docs/LocationApi.md#updateinventorylocation) | **POST** /location/{merchantLocationKey}/update_location_details | 
*OnboardingApi* | [**getPaymentsProgramOnboarding**](docs/OnboardingApi.md#getpaymentsprogramonboarding) | **GET** /payments_program/{marketplace_id}/{payments_program_type}/onboarding | 
*PaymentPolicyApi* | [**createPaymentPolicy**](docs/PaymentPolicyApi.md#createpaymentpolicy) | **POST** /payment_policy | 
*PaymentPolicyApi* | [**deletePaymentPolicy**](docs/PaymentPolicyApi.md#deletepaymentpolicy) | **DELETE** /payment_policy/{payment_policy_id} | 
*PaymentPolicyApi* | [**getPaymentPolicies**](docs/PaymentPolicyApi.md#getpaymentpolicies) | **GET** /payment_policy | 
*PaymentPolicyApi* | [**getPaymentPolicy**](docs/PaymentPolicyApi.md#getpaymentpolicy) | **GET** /payment_policy/{payment_policy_id} | 
*PaymentPolicyApi* | [**getPaymentPolicyByName**](docs/PaymentPolicyApi.md#getpaymentpolicybyname) | **GET** /payment_policy/get_by_policy_name | 
*PaymentPolicyApi* | [**updatePaymentPolicy**](docs/PaymentPolicyApi.md#updatepaymentpolicy) | **PUT** /payment_policy/{payment_policy_id} | 
*PaymentsProgramApi* | [**getPaymentsProgram**](docs/PaymentsProgramApi.md#getpaymentsprogram) | **GET** /payments_program/{marketplace_id}/{payments_program_type} | 
*PrivilegeApi* | [**getPrivileges**](docs/PrivilegeApi.md#getprivileges) | **GET** /privilege | 
*ProgramApi* | [**getOptedInPrograms**](docs/ProgramApi.md#getoptedinprograms) | **GET** /program/get_opted_in_programs | 
*ProgramApi* | [**optInToProgram**](docs/ProgramApi.md#optintoprogram) | **POST** /program/opt_in | 
*ProgramApi* | [**optOutOfProgram**](docs/ProgramApi.md#optoutofprogram) | **POST** /program/opt_out | 
*RateTableApi* | [**getRateTables**](docs/RateTableApi.md#getratetables) | **GET** /rate_table | 
*ReturnPolicyApi* | [**createReturnPolicy**](docs/ReturnPolicyApi.md#createreturnpolicy) | **POST** /return_policy | 
*ReturnPolicyApi* | [**deleteReturnPolicy**](docs/ReturnPolicyApi.md#deletereturnpolicy) | **DELETE** /return_policy/{return_policy_id} | 
*ReturnPolicyApi* | [**getReturnPolicies**](docs/ReturnPolicyApi.md#getreturnpolicies) | **GET** /return_policy | 
*ReturnPolicyApi* | [**getReturnPolicy**](docs/ReturnPolicyApi.md#getreturnpolicy) | **GET** /return_policy/{return_policy_id} | 
*ReturnPolicyApi* | [**getReturnPolicyByName**](docs/ReturnPolicyApi.md#getreturnpolicybyname) | **GET** /return_policy/get_by_policy_name | 
*ReturnPolicyApi* | [**updateReturnPolicy**](docs/ReturnPolicyApi.md#updatereturnpolicy) | **PUT** /return_policy/{return_policy_id} | 
*SalesTaxApi* | [**createOrReplaceSalesTax**](docs/SalesTaxApi.md#createorreplacesalestax) | **PUT** /sales_tax/{countryCode}/{jurisdictionId} | 
*SalesTaxApi* | [**deleteSalesTax**](docs/SalesTaxApi.md#deletesalestax) | **DELETE** /sales_tax/{countryCode}/{jurisdictionId} | 
*SalesTaxApi* | [**getSalesTax**](docs/SalesTaxApi.md#getsalestax) | **GET** /sales_tax/{countryCode}/{jurisdictionId} | 
*SalesTaxApi* | [**getSalesTaxes**](docs/SalesTaxApi.md#getsalestaxes) | **GET** /sales_tax | 
*SubscriptionApi* | [**getSubscription**](docs/SubscriptionApi.md#getsubscription) | **GET** /subscription | 


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.Address](docs/Address.md)
 - [org.openapitools.client.models.Amount](docs/Amount.md)
 - [org.openapitools.client.models.CategoryType](docs/CategoryType.md)
 - [org.openapitools.client.models.CompactCustomPolicyResponse](docs/CompactCustomPolicyResponse.md)
 - [org.openapitools.client.models.CustomPolicy](docs/CustomPolicy.md)
 - [org.openapitools.client.models.CustomPolicyCreateRequest](docs/CustomPolicyCreateRequest.md)
 - [org.openapitools.client.models.CustomPolicyRequest](docs/CustomPolicyRequest.md)
 - [org.openapitools.client.models.CustomPolicyResponse](docs/CustomPolicyResponse.md)
 - [org.openapitools.client.models.Deposit](docs/Deposit.md)
 - [org.openapitools.client.models.Error](docs/Error.md)
 - [org.openapitools.client.models.ErrorParameter](docs/ErrorParameter.md)
 - [org.openapitools.client.models.FulfillmentPolicy](docs/FulfillmentPolicy.md)
 - [org.openapitools.client.models.FulfillmentPolicyRequest](docs/FulfillmentPolicyRequest.md)
 - [org.openapitools.client.models.FulfillmentPolicyResponse](docs/FulfillmentPolicyResponse.md)
 - [org.openapitools.client.models.GeoCoordinates](docs/GeoCoordinates.md)
 - [org.openapitools.client.models.InternationalReturnOverrideType](docs/InternationalReturnOverrideType.md)
 - [org.openapitools.client.models.Interval](docs/Interval.md)
 - [org.openapitools.client.models.InventoryLocation](docs/InventoryLocation.md)
 - [org.openapitools.client.models.InventoryLocationFull](docs/InventoryLocationFull.md)
 - [org.openapitools.client.models.InventoryLocationResponse](docs/InventoryLocationResponse.md)
 - [org.openapitools.client.models.KycCheck](docs/KycCheck.md)
 - [org.openapitools.client.models.KycResponse](docs/KycResponse.md)
 - [org.openapitools.client.models.Location](docs/Location.md)
 - [org.openapitools.client.models.LocationDetails](docs/LocationDetails.md)
 - [org.openapitools.client.models.LocationResponse](docs/LocationResponse.md)
 - [org.openapitools.client.models.OperatingHours](docs/OperatingHours.md)
 - [org.openapitools.client.models.PaymentMethod](docs/PaymentMethod.md)
 - [org.openapitools.client.models.PaymentPolicy](docs/PaymentPolicy.md)
 - [org.openapitools.client.models.PaymentPolicyRequest](docs/PaymentPolicyRequest.md)
 - [org.openapitools.client.models.PaymentPolicyResponse](docs/PaymentPolicyResponse.md)
 - [org.openapitools.client.models.PaymentsProgramOnboardingResponse](docs/PaymentsProgramOnboardingResponse.md)
 - [org.openapitools.client.models.PaymentsProgramOnboardingSteps](docs/PaymentsProgramOnboardingSteps.md)
 - [org.openapitools.client.models.PaymentsProgramResponse](docs/PaymentsProgramResponse.md)
 - [org.openapitools.client.models.Program](docs/Program.md)
 - [org.openapitools.client.models.Programs](docs/Programs.md)
 - [org.openapitools.client.models.RateTable](docs/RateTable.md)
 - [org.openapitools.client.models.RateTableResponse](docs/RateTableResponse.md)
 - [org.openapitools.client.models.RecipientAccountReference](docs/RecipientAccountReference.md)
 - [org.openapitools.client.models.Region](docs/Region.md)
 - [org.openapitools.client.models.RegionSet](docs/RegionSet.md)
 - [org.openapitools.client.models.ReturnPolicy](docs/ReturnPolicy.md)
 - [org.openapitools.client.models.ReturnPolicyRequest](docs/ReturnPolicyRequest.md)
 - [org.openapitools.client.models.ReturnPolicyResponse](docs/ReturnPolicyResponse.md)
 - [org.openapitools.client.models.SalesTax](docs/SalesTax.md)
 - [org.openapitools.client.models.SalesTaxBase](docs/SalesTaxBase.md)
 - [org.openapitools.client.models.SalesTaxJurisdiction](docs/SalesTaxJurisdiction.md)
 - [org.openapitools.client.models.SalesTaxJurisdictions](docs/SalesTaxJurisdictions.md)
 - [org.openapitools.client.models.SalesTaxes](docs/SalesTaxes.md)
 - [org.openapitools.client.models.SellerEligibilityMultiProgramResponse](docs/SellerEligibilityMultiProgramResponse.md)
 - [org.openapitools.client.models.SellerEligibilityResponse](docs/SellerEligibilityResponse.md)
 - [org.openapitools.client.models.SellingLimit](docs/SellingLimit.md)
 - [org.openapitools.client.models.SellingPrivileges](docs/SellingPrivileges.md)
 - [org.openapitools.client.models.SetFulfillmentPolicyResponse](docs/SetFulfillmentPolicyResponse.md)
 - [org.openapitools.client.models.SetPaymentPolicyResponse](docs/SetPaymentPolicyResponse.md)
 - [org.openapitools.client.models.SetReturnPolicyResponse](docs/SetReturnPolicyResponse.md)
 - [org.openapitools.client.models.ShippingOption](docs/ShippingOption.md)
 - [org.openapitools.client.models.ShippingService](docs/ShippingService.md)
 - [org.openapitools.client.models.SpecialHours](docs/SpecialHours.md)
 - [org.openapitools.client.models.Subscription](docs/Subscription.md)
 - [org.openapitools.client.models.SubscriptionResponse](docs/SubscriptionResponse.md)
 - [org.openapitools.client.models.TimeDuration](docs/TimeDuration.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="api_auth"></a>
### api_auth

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: 
  - https://api.ebay.com/oauth/api_scope: View public data from eBay

<a name="api_auth"></a>
### api_auth

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://auth.ebay.com/oauth2/authorize
- **Scopes**: 
  - https://api.ebay.com/oauth/api_scope/sell.inventory: View and manage your inventory and offers
  - https://api.ebay.com/oauth/api_scope/sell.account.readonly: View your account settings
  - https://api.ebay.com/oauth/api_scope/sell.inventory.readonly: View your inventory and offers
  - https://api.ebay.com/oauth/api_scope/sell.account: View and manage your account settings

