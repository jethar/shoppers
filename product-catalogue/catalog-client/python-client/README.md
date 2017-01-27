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
api_instance = swagger_client.CatalogProductWebsiteLinkRepositoryV1Api()
sku = 'sku_example' # str | 
website_id = 56 # int | 

try:
    api_response = api_instance.catalog_product_website_link_repository_v1_delete_by_id_delete(sku, website_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CatalogProductWebsiteLinkRepositoryV1Api->catalog_product_website_link_repository_v1_delete_by_id_delete: %s\n" % e)

```

## Documentation for API Endpoints

All URIs are relative to *http://shoppers.io/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CatalogProductWebsiteLinkRepositoryV1Api* | [**catalog_product_website_link_repository_v1_delete_by_id_delete**](docs/CatalogProductWebsiteLinkRepositoryV1Api.md#catalog_product_website_link_repository_v1_delete_by_id_delete) | **DELETE** /v1/products/{sku}/websites/{websiteId} | 
*CatalogProductWebsiteLinkRepositoryV1Api* | [**catalog_product_website_link_repository_v1_save_post**](docs/CatalogProductWebsiteLinkRepositoryV1Api.md#catalog_product_website_link_repository_v1_save_post) | **POST** /v1/products/{sku}/websites | 
*CatalogProductWebsiteLinkRepositoryV1Api* | [**catalog_product_website_link_repository_v1_save_put**](docs/CatalogProductWebsiteLinkRepositoryV1Api.md#catalog_product_website_link_repository_v1_save_put) | **PUT** /v1/products/{sku}/websites | 
*ProductApi* | [**add_product**](docs/ProductApi.md#add_product) | **POST** /v1/products | Add a new product to the store
*ProductApi* | [**delete_product**](docs/ProductApi.md#delete_product) | **DELETE** /v1/products/{productId} | Deletes a product
*ProductApi* | [**find_products_by_categories**](docs/ProductApi.md#find_products_by_categories) | **GET** /v1/products/findByCategory | Finds Products by category
*ProductApi* | [**get_product_by_id**](docs/ProductApi.md#get_product_by_id) | **GET** /v1/products/{productId} | Find product by ID
*ProductApi* | [**update_product_with_form**](docs/ProductApi.md#update_product_with_form) | **POST** /v1/products/{productId} | Updates a product in the store with form data


## Documentation For Models

 - [Body](docs/Body.md)
 - [Body1](docs/Body1.md)
 - [Body2](docs/Body2.md)
 - [BundleDataLinkInterface](docs/BundleDataLinkInterface.md)
 - [BundleDataOptionInterface](docs/BundleDataOptionInterface.md)
 - [CatalogDataCategoryAttributeInterface](docs/CatalogDataCategoryAttributeInterface.md)
 - [CatalogDataCategoryTreeInterface](docs/CatalogDataCategoryTreeInterface.md)
 - [CatalogDataProductAttributeInterface](docs/CatalogDataProductAttributeInterface.md)
 - [CatalogDataProductAttributeMediaGalleryEntryInterface](docs/CatalogDataProductAttributeMediaGalleryEntryInterface.md)
 - [CatalogDataProductAttributeSearchResultsInterface](docs/CatalogDataProductAttributeSearchResultsInterface.md)
 - [CatalogDataProductCustomOptionInterface](docs/CatalogDataProductCustomOptionInterface.md)
 - [CatalogDataProductCustomOptionValuesInterface](docs/CatalogDataProductCustomOptionValuesInterface.md)
 - [CatalogDataProductLinkInterface](docs/CatalogDataProductLinkInterface.md)
 - [CatalogDataProductSearchResultsInterface](docs/CatalogDataProductSearchResultsInterface.md)
 - [CatalogDataProductTierPriceInterface](docs/CatalogDataProductTierPriceInterface.md)
 - [CatalogInventoryDataStockItemInterface](docs/CatalogInventoryDataStockItemInterface.md)
 - [CatalogInventoryDataStockStatusCollectionInterface](docs/CatalogInventoryDataStockStatusCollectionInterface.md)
 - [CatalogInventoryDataStockStatusInterface](docs/CatalogInventoryDataStockStatusInterface.md)
 - [CatalogInventoryStockStatusCriteriaInterface](docs/CatalogInventoryStockStatusCriteriaInterface.md)
 - [CatalogProductWebsiteLinkInterface](docs/CatalogProductWebsiteLinkInterface.md)
 - [Category](docs/Category.md)
 - [ConfigurableProductDataOptionInterface](docs/ConfigurableProductDataOptionInterface.md)
 - [ConfigurableProductDataOptionValueInterface](docs/ConfigurableProductDataOptionValueInterface.md)
 - [DownloadableDataFileContentInterface](docs/DownloadableDataFileContentInterface.md)
 - [DownloadableDataLinkInterface](docs/DownloadableDataLinkInterface.md)
 - [DownloadableDataSampleInterface](docs/DownloadableDataSampleInterface.md)
 - [EavDataAttributeFrontendLabelInterface](docs/EavDataAttributeFrontendLabelInterface.md)
 - [EavDataAttributeOptionInterface](docs/EavDataAttributeOptionInterface.md)
 - [EavDataAttributeOptionLabelInterface](docs/EavDataAttributeOptionLabelInterface.md)
 - [EavDataAttributeValidationRuleInterface](docs/EavDataAttributeValidationRuleInterface.md)
 - [ErrorErrors](docs/ErrorErrors.md)
 - [ErrorErrorsItem](docs/ErrorErrorsItem.md)
 - [ErrorParameters](docs/ErrorParameters.md)
 - [ErrorParametersItem](docs/ErrorParametersItem.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [FrameworkAttributeInterface](docs/FrameworkAttributeInterface.md)
 - [FrameworkCriteriaInterface](docs/FrameworkCriteriaInterface.md)
 - [FrameworkDataImageContentInterface](docs/FrameworkDataImageContentInterface.md)
 - [FrameworkFilter](docs/FrameworkFilter.md)
 - [FrameworkSearchAggregationInterface](docs/FrameworkSearchAggregationInterface.md)
 - [FrameworkSearchAggregationValueInterface](docs/FrameworkSearchAggregationValueInterface.md)
 - [FrameworkSearchBucketInterface](docs/FrameworkSearchBucketInterface.md)
 - [FrameworkSearchCriteriaInterface](docs/FrameworkSearchCriteriaInterface.md)
 - [FrameworkSearchDocumentInterface](docs/FrameworkSearchDocumentInterface.md)
 - [FrameworkSearchFilterGroup](docs/FrameworkSearchFilterGroup.md)
 - [FrameworkSearchSearchCriteriaInterface](docs/FrameworkSearchSearchCriteriaInterface.md)
 - [FrameworkSearchSearchResultInterface](docs/FrameworkSearchSearchResultInterface.md)
 - [FrameworkSortOrder](docs/FrameworkSortOrder.md)
 - [Product](docs/Product.md)
 - [ProductExtensionInterface](docs/ProductExtensionInterface.md)


## Documentation For Authorization


## api_key

- **Type**: API key
- **API key parameter name**: api_key
- **Location**: HTTP header

## shoppers_auth

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: http://shoppers.io/api/oauth/dialog
- **Scopes**: 
 - **write_products**: modify products in your account
 - **read_products**: read your products


## Author


