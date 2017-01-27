# swagger-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.api.CatalogProductWebsiteLinkRepositoryV1Api;

public class CatalogProductWebsiteLinkRepositoryV1ApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://shoppers.io/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CatalogProductWebsiteLinkRepositoryV1Api* | [**catalogProductWebsiteLinkRepositoryV1DeleteByIdDelete**](docs/CatalogProductWebsiteLinkRepositoryV1Api.md#catalogProductWebsiteLinkRepositoryV1DeleteByIdDelete) | **DELETE** /v1/products/{sku}/websites/{websiteId} | 
*CatalogProductWebsiteLinkRepositoryV1Api* | [**catalogProductWebsiteLinkRepositoryV1SavePost**](docs/CatalogProductWebsiteLinkRepositoryV1Api.md#catalogProductWebsiteLinkRepositoryV1SavePost) | **POST** /v1/products/{sku}/websites | 
*CatalogProductWebsiteLinkRepositoryV1Api* | [**catalogProductWebsiteLinkRepositoryV1SavePut**](docs/CatalogProductWebsiteLinkRepositoryV1Api.md#catalogProductWebsiteLinkRepositoryV1SavePut) | **PUT** /v1/products/{sku}/websites | 
*ProductApi* | [**addProduct**](docs/ProductApi.md#addProduct) | **POST** /v1/products | Add a new product to the store
*ProductApi* | [**deleteProduct**](docs/ProductApi.md#deleteProduct) | **DELETE** /v1/products/{productId} | Deletes a product
*ProductApi* | [**findProductsByCategories**](docs/ProductApi.md#findProductsByCategories) | **GET** /v1/products/findByCategory | Finds Products by category
*ProductApi* | [**getProductById**](docs/ProductApi.md#getProductById) | **GET** /v1/products/{productId} | Find product by ID
*ProductApi* | [**updateProductWithForm**](docs/ProductApi.md#updateProductWithForm) | **POST** /v1/products/{productId} | Updates a product in the store with form data


## Documentation for Models

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


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: api_key
- **Location**: HTTP header

### shoppers_auth

- **Type**: OAuth
- **Flow**: implicit
- **Authorizatoin URL**: http://shoppers.io/api/oauth/dialog
- **Scopes**: 
  - write_products: modify products in your account
  - read_products: read your products


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



