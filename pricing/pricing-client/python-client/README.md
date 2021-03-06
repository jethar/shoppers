# swagger_client
This is a Shoppers Catalogue server.  [Learn about Swagger](http://swagger.io) or join the IRC channel `#swagger` on irc.freenode.net.  For this sample, you can use the api key `special-key` to test the authorization filters 

This Python package is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 1.0.0
- Package version: 1.0.0
- Build package: io.swagger.codegen.languages.PythonClientCodegen

## Requirements.

Python 2.7 and 3.4+

## Installation & Usage
### pip install

If the python package is hosted on Github, you can install directly from Github

```sh
pip install git+https://github.com//.git
```
(you may need to run `pip` with root permission: `sudo pip install git+https://github.com//.git`)

Then import the package:
```python
import swagger_client 
```

### Setuptools

Install via [Setuptools](http://pypi.python.org/pypi/setuptools).

```sh
python setup.py install --user
```
(or `sudo python setup.py install` to install the package for all users)

Then import the package:
```python
import swagger_client
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```python
from __future__ import print_function
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

## Documentation for API Endpoints

All URIs are relative to *http://shoppers.io/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CatalogProductTierPriceManagementV1Api* | [**catalog_product_tier_price_management_v1_add_post**](docs/CatalogProductTierPriceManagementV1Api.md#catalog_product_tier_price_management_v1_add_post) | **POST** /v1/products/{sku}/group-prices/{customerGroupId}/tiers/{qty}/price/{price} | 
*CatalogProductTierPriceManagementV1Api* | [**catalog_product_tier_price_management_v1_get_list_get**](docs/CatalogProductTierPriceManagementV1Api.md#catalog_product_tier_price_management_v1_get_list_get) | **GET** /v1/products/{sku}/group-prices/{customerGroupId}/tiers | 
*CatalogProductTierPriceManagementV1Api* | [**catalog_product_tier_price_management_v1_remove_delete**](docs/CatalogProductTierPriceManagementV1Api.md#catalog_product_tier_price_management_v1_remove_delete) | **DELETE** /v1/products/{sku}/group-prices/{customerGroupId}/tiers/{qty} | 


## Documentation For Models

 - [BundleDataLinkInterface](docs/BundleDataLinkInterface.md)
 - [BundleDataOptionInterface](docs/BundleDataOptionInterface.md)
 - [Category](docs/Category.md)
 - [ConfigurableProductDataOptionInterface](docs/ConfigurableProductDataOptionInterface.md)
 - [ConfigurableProductDataOptionValueInterface](docs/ConfigurableProductDataOptionValueInterface.md)
 - [ErrorErrors](docs/ErrorErrors.md)
 - [ErrorErrorsItem](docs/ErrorErrorsItem.md)
 - [ErrorParameters](docs/ErrorParameters.md)
 - [ErrorParametersItem](docs/ErrorParametersItem.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [FrameworkAttributeInterface](docs/FrameworkAttributeInterface.md)
 - [InventoryDataStockItemInterface](docs/InventoryDataStockItemInterface.md)
 - [Product](docs/Product.md)
 - [ProductCustomOptionInterface](docs/ProductCustomOptionInterface.md)
 - [ProductCustomOptionValuesInterface](docs/ProductCustomOptionValuesInterface.md)
 - [ProductExtensionInterface](docs/ProductExtensionInterface.md)
 - [ProductLinkInterface](docs/ProductLinkInterface.md)
 - [ProductTierPriceInterface](docs/ProductTierPriceInterface.md)


## Documentation For Authorization

 All endpoints do not require authorization.


## Author



