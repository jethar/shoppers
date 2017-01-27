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

import io.swagger.client.api.CatalogProductTierPriceManagementV1Api;

public class CatalogProductTierPriceManagementV1ApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://shoppers.io/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CatalogProductTierPriceManagementV1Api* | [**catalogProductTierPriceManagementV1AddPost**](docs/CatalogProductTierPriceManagementV1Api.md#catalogProductTierPriceManagementV1AddPost) | **POST** /v1/products/{sku}/group-prices/{customerGroupId}/tiers/{qty}/price/{price} | 
*CatalogProductTierPriceManagementV1Api* | [**catalogProductTierPriceManagementV1GetListGet**](docs/CatalogProductTierPriceManagementV1Api.md#catalogProductTierPriceManagementV1GetListGet) | **GET** /v1/products/{sku}/group-prices/{customerGroupId}/tiers | 
*CatalogProductTierPriceManagementV1Api* | [**catalogProductTierPriceManagementV1RemoveDelete**](docs/CatalogProductTierPriceManagementV1Api.md#catalogProductTierPriceManagementV1RemoveDelete) | **DELETE** /v1/products/{sku}/group-prices/{customerGroupId}/tiers/{qty} | 


## Documentation for Models

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


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



