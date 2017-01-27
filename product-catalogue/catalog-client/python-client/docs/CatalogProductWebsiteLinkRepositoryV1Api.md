# swagger_client.CatalogProductWebsiteLinkRepositoryV1Api

All URIs are relative to *http://shoppers.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalog_product_website_link_repository_v1_delete_by_id_delete**](CatalogProductWebsiteLinkRepositoryV1Api.md#catalog_product_website_link_repository_v1_delete_by_id_delete) | **DELETE** /v1/products/{sku}/websites/{websiteId} | 
[**catalog_product_website_link_repository_v1_save_post**](CatalogProductWebsiteLinkRepositoryV1Api.md#catalog_product_website_link_repository_v1_save_post) | **POST** /v1/products/{sku}/websites | 
[**catalog_product_website_link_repository_v1_save_put**](CatalogProductWebsiteLinkRepositoryV1Api.md#catalog_product_website_link_repository_v1_save_put) | **PUT** /v1/products/{sku}/websites | 


# **catalog_product_website_link_repository_v1_delete_by_id_delete**
> bool catalog_product_website_link_repository_v1_delete_by_id_delete(sku, website_id)



Remove the website assignment from the product by product sku

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CatalogProductWebsiteLinkRepositoryV1Api()
sku = 'sku_example' # str | 
website_id = 56 # int | 

try: 
    api_response = api_instance.catalog_product_website_link_repository_v1_delete_by_id_delete(sku, website_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CatalogProductWebsiteLinkRepositoryV1Api->catalog_product_website_link_repository_v1_delete_by_id_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sku** | **str**|  | 
 **website_id** | **int**|  | 

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalog_product_website_link_repository_v1_save_post**
> bool catalog_product_website_link_repository_v1_save_post(sku, body=body)



Assign a product to the website

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CatalogProductWebsiteLinkRepositoryV1Api()
sku = 'sku_example' # str | 
body = swagger_client.Body2() # Body2 |  (optional)

try: 
    api_response = api_instance.catalog_product_website_link_repository_v1_save_post(sku, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CatalogProductWebsiteLinkRepositoryV1Api->catalog_product_website_link_repository_v1_save_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sku** | **str**|  | 
 **body** | [**Body2**](Body2.md)|  | [optional] 

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalog_product_website_link_repository_v1_save_put**
> bool catalog_product_website_link_repository_v1_save_put(sku, body=body)



Assign a product to the website

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CatalogProductWebsiteLinkRepositoryV1Api()
sku = 'sku_example' # str | 
body = swagger_client.Body1() # Body1 |  (optional)

try: 
    api_response = api_instance.catalog_product_website_link_repository_v1_save_put(sku, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CatalogProductWebsiteLinkRepositoryV1Api->catalog_product_website_link_repository_v1_save_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sku** | **str**|  | 
 **body** | [**Body1**](Body1.md)|  | [optional] 

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

