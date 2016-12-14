# DefaultApi

All URIs are relative to *https://develop.nana.sa:2020*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllMainCategoriesPost**](DefaultApi.md#getAllMainCategoriesPost) | **POST** /get_all_main_categories | get all categories


<a name="getAllMainCategoriesPost"></a>
# **getAllMainCategoriesPost**
> InlineResponse200 getAllMainCategoriesPost(authorization)

get all categories

return list of categories

### Example
```java
// Import classes:
//import io.swagger.client.api.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
String authorization = "authorization_example"; // String | access token for user
try {
    InlineResponse200 result = apiInstance.getAllMainCategoriesPost(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAllMainCategoriesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| access token for user |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

