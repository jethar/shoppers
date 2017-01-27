# CatalogProductWebsiteLinkRepositoryV1Api

All URIs are relative to *http://shoppers.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogProductWebsiteLinkRepositoryV1DeleteByIdDelete**](CatalogProductWebsiteLinkRepositoryV1Api.md#catalogProductWebsiteLinkRepositoryV1DeleteByIdDelete) | **DELETE** /v1/products/{sku}/websites/{websiteId} | 
[**catalogProductWebsiteLinkRepositoryV1SavePost**](CatalogProductWebsiteLinkRepositoryV1Api.md#catalogProductWebsiteLinkRepositoryV1SavePost) | **POST** /v1/products/{sku}/websites | 
[**catalogProductWebsiteLinkRepositoryV1SavePut**](CatalogProductWebsiteLinkRepositoryV1Api.md#catalogProductWebsiteLinkRepositoryV1SavePut) | **PUT** /v1/products/{sku}/websites | 


<a name="catalogProductWebsiteLinkRepositoryV1DeleteByIdDelete"></a>
# **catalogProductWebsiteLinkRepositoryV1DeleteByIdDelete**
> Boolean catalogProductWebsiteLinkRepositoryV1DeleteByIdDelete(sku, websiteId)



Remove the website assignment from the product by product sku

### Example
```java
// Import classes:
//import io.swagger.client.api.CatalogProductWebsiteLinkRepositoryV1Api;

CatalogProductWebsiteLinkRepositoryV1Api apiInstance = new CatalogProductWebsiteLinkRepositoryV1Api();
String sku = "sku_example"; // String | 
Integer websiteId = 56; // Integer | 
try {
    Boolean result = apiInstance.catalogProductWebsiteLinkRepositoryV1DeleteByIdDelete(sku, websiteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogProductWebsiteLinkRepositoryV1Api#catalogProductWebsiteLinkRepositoryV1DeleteByIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sku** | **String**|  |
 **websiteId** | **Integer**|  |

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="catalogProductWebsiteLinkRepositoryV1SavePost"></a>
# **catalogProductWebsiteLinkRepositoryV1SavePost**
> Boolean catalogProductWebsiteLinkRepositoryV1SavePost(sku, body)



Assign a product to the website

### Example
```java
// Import classes:
//import io.swagger.client.api.CatalogProductWebsiteLinkRepositoryV1Api;

CatalogProductWebsiteLinkRepositoryV1Api apiInstance = new CatalogProductWebsiteLinkRepositoryV1Api();
String sku = "sku_example"; // String | 
Body2 body = new Body2(); // Body2 | 
try {
    Boolean result = apiInstance.catalogProductWebsiteLinkRepositoryV1SavePost(sku, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogProductWebsiteLinkRepositoryV1Api#catalogProductWebsiteLinkRepositoryV1SavePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sku** | **String**|  |
 **body** | [**Body2**](Body2.md)|  | [optional]

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="catalogProductWebsiteLinkRepositoryV1SavePut"></a>
# **catalogProductWebsiteLinkRepositoryV1SavePut**
> Boolean catalogProductWebsiteLinkRepositoryV1SavePut(sku, body)



Assign a product to the website

### Example
```java
// Import classes:
//import io.swagger.client.api.CatalogProductWebsiteLinkRepositoryV1Api;

CatalogProductWebsiteLinkRepositoryV1Api apiInstance = new CatalogProductWebsiteLinkRepositoryV1Api();
String sku = "sku_example"; // String | 
Body1 body = new Body1(); // Body1 | 
try {
    Boolean result = apiInstance.catalogProductWebsiteLinkRepositoryV1SavePut(sku, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogProductWebsiteLinkRepositoryV1Api#catalogProductWebsiteLinkRepositoryV1SavePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sku** | **String**|  |
 **body** | [**Body1**](Body1.md)|  | [optional]

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

