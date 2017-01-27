# ProductApi

All URIs are relative to *http://shoppers.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProduct**](ProductApi.md#addProduct) | **POST** /v1/products | Add a new product to the store
[**deleteProduct**](ProductApi.md#deleteProduct) | **DELETE** /v1/products/{productId} | Deletes a product
[**findProductsByCategories**](ProductApi.md#findProductsByCategories) | **GET** /v1/products/findByCategory | Finds Products by category
[**getProductById**](ProductApi.md#getProductById) | **GET** /v1/products/{productId} | Find product by ID
[**updateProductWithForm**](ProductApi.md#updateProductWithForm) | **POST** /v1/products/{productId} | Updates a product in the store with form data


<a name="addProduct"></a>
# **addProduct**
> Product addProduct(body)

Add a new product to the store



### Example
```java
// Import classes:
//import io.swagger.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
Body body = new Body(); // Body | 
try {
    Product result = apiInstance.addProduct(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#addProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body**](Body.md)|  | [optional]

### Return type

[**Product**](Product.md)

### Authorization

[shoppers_auth](../README.md#shoppers_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="deleteProduct"></a>
# **deleteProduct**
> deleteProduct(apiKey, productId)

Deletes a product



### Example
```java
// Import classes:
//import io.swagger.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String apiKey = "apiKey_example"; // String | 
Long productId = 789L; // Long | Product id to delete
try {
    apiInstance.deleteProduct(apiKey, productId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#deleteProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **productId** | **Long**| Product id to delete |

### Return type

null (empty response body)

### Authorization

[shoppers_auth](../README.md#shoppers_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="findProductsByCategories"></a>
# **findProductsByCategories**
> List&lt;CatalogDataProductSearchResultsInterface&gt; findProductsByCategories(category)

Finds Products by category

Use category1 for testing.

### Example
```java
// Import classes:
//import io.swagger.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String category = "category_example"; // String | Category to filter by
try {
    List<CatalogDataProductSearchResultsInterface> result = apiInstance.findProductsByCategories(category);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#findProductsByCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category** | **String**| Category to filter by | [optional]

### Return type

[**List&lt;CatalogDataProductSearchResultsInterface&gt;**](CatalogDataProductSearchResultsInterface.md)

### Authorization

[shoppers_auth](../README.md#shoppers_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getProductById"></a>
# **getProductById**
> Product getProductById(productId)

Find product by ID

Returns a product when ID &lt; 10.  ID &gt; 10 or nonintegers will simulate API error conditions

### Example
```java
// Import classes:
//import io.swagger.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
Long productId = 789L; // Long | ID of product that needs to be fetched
try {
    Product result = apiInstance.getProductById(productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#getProductById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**| ID of product that needs to be fetched |

### Return type

[**Product**](Product.md)

### Authorization

[api_key](../README.md#api_key), [shoppers_auth](../README.md#shoppers_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="updateProductWithForm"></a>
# **updateProductWithForm**
> updateProductWithForm(productId, name, status)

Updates a product in the store with form data



### Example
```java
// Import classes:
//import io.swagger.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String productId = "productId_example"; // String | ID of product that needs to be updated
String name = "name_example"; // String | Updated name of the product
String status = "status_example"; // String | Updated status of the product
try {
    apiInstance.updateProductWithForm(productId, name, status);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#updateProductWithForm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| ID of product that needs to be updated |
 **name** | **String**| Updated name of the product |
 **status** | **String**| Updated status of the product |

### Return type

null (empty response body)

### Authorization

[shoppers_auth](../README.md#shoppers_auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

