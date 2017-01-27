# swagger_client.CatalogProductTierPriceManagementV1Api

All URIs are relative to *http://shoppers.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalog_product_tier_price_management_v1_add_post**](CatalogProductTierPriceManagementV1Api.md#catalog_product_tier_price_management_v1_add_post) | **POST** /v1/products/{sku}/group-prices/{customerGroupId}/tiers/{qty}/price/{price} | 
[**catalog_product_tier_price_management_v1_get_list_get**](CatalogProductTierPriceManagementV1Api.md#catalog_product_tier_price_management_v1_get_list_get) | **GET** /v1/products/{sku}/group-prices/{customerGroupId}/tiers | 
[**catalog_product_tier_price_management_v1_remove_delete**](CatalogProductTierPriceManagementV1Api.md#catalog_product_tier_price_management_v1_remove_delete) | **DELETE** /v1/products/{sku}/group-prices/{customerGroupId}/tiers/{qty} | 


# **catalog_product_tier_price_management_v1_add_post**
> bool catalog_product_tier_price_management_v1_add_post(sku, customer_group_id, price, qty)



Create tier price for product

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CatalogProductTierPriceManagementV1Api()
sku = 'sku_example' # str | 
customer_group_id = 'customer_group_id_example' # str | 'all' can be used to specify 'ALL GROUPS'
price = 3.4 # float | 
qty = 3.4 # float | 

try: 
    api_response = api_instance.catalog_product_tier_price_management_v1_add_post(sku, customer_group_id, price, qty)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CatalogProductTierPriceManagementV1Api->catalog_product_tier_price_management_v1_add_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sku** | **str**|  | 
 **customer_group_id** | **str**| &#39;all&#39; can be used to specify &#39;ALL GROUPS&#39; | 
 **price** | **float**|  | 
 **qty** | **float**|  | 

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalog_product_tier_price_management_v1_get_list_get**
> list[ProductTierPriceInterface] catalog_product_tier_price_management_v1_get_list_get(sku, customer_group_id)



Get tier price of product

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CatalogProductTierPriceManagementV1Api()
sku = 'sku_example' # str | 
customer_group_id = 'customer_group_id_example' # str | 'all' can be used to specify 'ALL GROUPS'

try: 
    api_response = api_instance.catalog_product_tier_price_management_v1_get_list_get(sku, customer_group_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CatalogProductTierPriceManagementV1Api->catalog_product_tier_price_management_v1_get_list_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sku** | **str**|  | 
 **customer_group_id** | **str**| &#39;all&#39; can be used to specify &#39;ALL GROUPS&#39; | 

### Return type

[**list[ProductTierPriceInterface]**](ProductTierPriceInterface.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalog_product_tier_price_management_v1_remove_delete**
> bool catalog_product_tier_price_management_v1_remove_delete(sku, customer_group_id, qty)



Remove tier price from product

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CatalogProductTierPriceManagementV1Api()
sku = 'sku_example' # str | 
customer_group_id = 'customer_group_id_example' # str | 'all' can be used to specify 'ALL GROUPS'
qty = 3.4 # float | 

try: 
    api_response = api_instance.catalog_product_tier_price_management_v1_remove_delete(sku, customer_group_id, qty)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CatalogProductTierPriceManagementV1Api->catalog_product_tier_price_management_v1_remove_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sku** | **str**|  | 
 **customer_group_id** | **str**| &#39;all&#39; can be used to specify &#39;ALL GROUPS&#39; | 
 **qty** | **float**|  | 

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

