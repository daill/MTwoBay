
# PaymentsProgramOnboardingResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**onboardingStatus** | **kotlin.String** | This enumeration value indicates the eligibility of payment onboarding for the registered site. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/account/types/api:PaymentsProgramOnboardingStatus&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]
**steps** | [**kotlin.collections.List&lt;PaymentsProgramOnboardingSteps&gt;**](PaymentsProgramOnboardingSteps.md) | An array of the active process steps for payment onboarding and the status of each step. This array includes the step &lt;strong&gt;name&lt;/strong&gt;, step &lt;strong&gt;status&lt;/strong&gt;, and a &lt;strong&gt;webUrl&lt;/strong&gt; to the &lt;code&gt;IN_PROGRESS&lt;/code&gt; step. The step names are returned in sequential order.  |  [optional]



