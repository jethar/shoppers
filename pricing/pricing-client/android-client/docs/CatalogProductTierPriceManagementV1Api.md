# CatalogProductTierPriceManagementV1Api

All URIs are relative to *http://shoppers.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogProductTierPriceManagementV1AddPost**](CatalogProductTierPriceManagementV1Api.md#catalogProductTierPriceManagementV1AddPost) | **POST** /v1/products/{sku}/group-prices/{customerGroupId}/tiers/{qty}/price/{price} | 
[**catalogProductTierPriceManagementV1GetListGet**](CatalogProductTierPriceManagementV1Api.md#catalogProductTierPriceManagementV1GetListGet) | **GET** /v1/products/{sku}/group-prices/{customerGroupId}/tiers | 
[**catalogProductTierPriceManagementV1RemoveDelete**](CatalogProductTierPriceManagementV1Api.md#catalogProductTierPriceManagementV1RemoveDelete) | **DELETE** /v1/products/{sku}/group-prices/{customerGroupId}/tiers/{qty} | 


<a name="catalogProductTierPriceManagementV1AddPost"></a>
# **catalogProductTierPriceManagementV1AddPost**
> Boolean catalogProductTierPriceManagementV1AddPost(sku, customerGroupId, price, qty)



Create tier price for product

### Example
```java
// Import classes:
//import io.swagger.client.api.CatalogProductTierPriceManagementV1Api;

CatalogProductTierPriceManagementV1Api apiInstance = new CatalogProductTierPriceManagementV1Api();
String sku = "sku_example"; // String | 
String customerGroupId = "customerGroupId_example"; // String | 'all' can be used to specify 'ALL GROUPS'
BigDecimal price = new BigDecimal(); // BigDecimal | 
BigDecimal qty = new BigDecimal(); // BigDecimal | 
try {
    Boolean result = apiInstance.catalogProductTierPriceManagementV1AddPost(sku, customerGroupId, price, qty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogProductTierPriceManagementV1Api#catalogProductTierPriceManagementV1AddPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sku** | **String**|  |
 **customerGroupId** | **String**| &#39;all&#39; can be used to specify &#39;ALL GROUPS&#39; |
 **price** | **BigDecimal**|  |
 **qty** | **BigDecimal**|  |

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="catalogProductTierPriceManagementV1GetListGet"></a>
# **catalogProductTierPriceManagementV1GetListGet**
> List&lt;ProductTierPriceInterface&gt; catalogProductTierPriceManagementV1GetListGet(sku, customerGroupId)



Get tier price of product

### Example
```java
// Import classes:
//import io.swagger.client.api.CatalogProductTierPriceManagementV1Api;

CatalogProductTierPriceManagementV1Api apiInstance = new CatalogProductTierPriceManagementV1Api();
String sku = "sku_example"; // String | 
String customerGroupId = "customerGroupId_example"; // String | 'all' can be used to specify 'ALL GROUPS'
try {
    List<ProductTierPriceInterface> result = apiInstance.catalogProductTierPriceManagementV1GetListGet(sku, customerGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogProductTierPriceManagementV1Api#catalogProductTierPriceManagementV1GetListGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sku** | **String**|  |
 **customerGroupId** | **String**| &#39;all&#39; can be used to specify &#39;ALL GROUPS&#39; |

### Return type

[**List&lt;ProductTierPriceInterface&gt;**](ProductTierPriceInterface.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="catalogProductTierPriceManagementV1RemoveDelete"></a>
# **catalogProductTierPriceManagementV1RemoveDelete**
> Boolean catalogProductTierPriceManagementV1RemoveDelete(sku, customerGroupId, qty)



Remove tier price from product

### Example
```java
// Import classes:
//import io.swagger.client.api.CatalogProductTierPriceManagementV1Api;

CatalogProductTierPriceManagementV1Api apiInstance = new CatalogProductTierPriceManagementV1Api();
String sku = "sku_example"; // String | 
String customerGroupId = "customerGroupId_example"; // String | 'all' can be used to specify 'ALL GROUPS'
BigDecimal qty = new BigDecimal(); // BigDecimal | 
try {
    Boolean result = apiInstance.catalogProductTierPriceManagementV1RemoveDelete(sku, customerGroupId, qty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogProductTierPriceManagementV1Api#catalogProductTierPriceManagementV1RemoveDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sku** | **String**|  |
 **customerGroupId** | **String**| &#39;all&#39; can be used to specify &#39;ALL GROUPS&#39; |
 **qty** | **BigDecimal**|  |

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

