# swagger_client.ProductApi

All URIs are relative to *http://shoppers.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_product**](ProductApi.md#add_product) | **POST** /v1/products | Add a new product to the store
[**delete_product**](ProductApi.md#delete_product) | **DELETE** /v1/products/{productId} | Deletes a product
[**find_products_by_categories**](ProductApi.md#find_products_by_categories) | **GET** /v1/products/findByCategory | Finds Products by category
[**get_product_by_id**](ProductApi.md#get_product_by_id) | **GET** /v1/products/{productId} | Find product by ID
[**update_product_with_form**](ProductApi.md#update_product_with_form) | **POST** /v1/products/{productId} | Updates a product in the store with form data


# **add_product**
> Product add_product(body=body)

Add a new product to the store



### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: shoppers_auth
swagger_client.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = swagger_client.ProductApi()
body = swagger_client.Body() # Body |  (optional)

try: 
    # Add a new product to the store
    api_response = api_instance.add_product(body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProductApi->add_product: %s\n" % e)
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_product**
> delete_product(api_key, product_id)

Deletes a product



### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: shoppers_auth
swagger_client.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = swagger_client.ProductApi()
api_key = 'api_key_example' # str | 
product_id = 789 # int | Product id to delete

try: 
    # Deletes a product
    api_instance.delete_product(api_key, product_id)
except ApiException as e:
    print("Exception when calling ProductApi->delete_product: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_key** | **str**|  | 
 **product_id** | **int**| Product id to delete | 

### Return type

void (empty response body)

### Authorization

[shoppers_auth](../README.md#shoppers_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **find_products_by_categories**
> list[CatalogDataProductSearchResultsInterface] find_products_by_categories(category=category)

Finds Products by category

Use category1 for testing.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: shoppers_auth
swagger_client.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = swagger_client.ProductApi()
category = 'category_example' # str | Category to filter by (optional)

try: 
    # Finds Products by category
    api_response = api_instance.find_products_by_categories(category=category)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProductApi->find_products_by_categories: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category** | **str**| Category to filter by | [optional] 

### Return type

[**list[CatalogDataProductSearchResultsInterface]**](CatalogDataProductSearchResultsInterface.md)

### Authorization

[shoppers_auth](../README.md#shoppers_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_product_by_id**
> Product get_product_by_id(product_id)

Find product by ID

Returns a product when ID < 10.  ID > 10 or nonintegers will simulate API error conditions

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: api_key
swagger_client.configuration.api_key['api_key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# swagger_client.configuration.api_key_prefix['api_key'] = 'Bearer'
# Configure OAuth2 access token for authorization: shoppers_auth
swagger_client.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = swagger_client.ProductApi()
product_id = 789 # int | ID of product that needs to be fetched

try: 
    # Find product by ID
    api_response = api_instance.get_product_by_id(product_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProductApi->get_product_by_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **int**| ID of product that needs to be fetched | 

### Return type

[**Product**](Product.md)

### Authorization

[api_key](../README.md#api_key), [shoppers_auth](../README.md#shoppers_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_product_with_form**
> update_product_with_form(product_id, name, status)

Updates a product in the store with form data



### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: shoppers_auth
swagger_client.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = swagger_client.ProductApi()
product_id = 'product_id_example' # str | ID of product that needs to be updated
name = 'name_example' # str | Updated name of the product
status = 'status_example' # str | Updated status of the product

try: 
    # Updates a product in the store with form data
    api_instance.update_product_with_form(product_id, name, status)
except ApiException as e:
    print("Exception when calling ProductApi->update_product_with_form: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **str**| ID of product that needs to be updated | 
 **name** | **str**| Updated name of the product | 
 **status** | **str**| Updated status of the product | 

### Return type

void (empty response body)

### Authorization

[shoppers_auth](../README.md#shoppers_auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

