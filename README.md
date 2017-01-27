# shoppers
A Case Study in microservice APIs

## Architecture

**Logical Diagram for the Microservices**
![Logical Diagram for the Microservices](https://rawgit.com/jethar/shoppers/master/design/Shoppers_Microservices.png)

There are two approaches to building scalable technical stack:
- Microservices
- Serverless Architecture

***Serverless Architecture*** provides certain advantages in simplifying the deployment as well as it is inherently built on event-driven stack while it needs to be architected as part of solution for microservices architecture.

Serverless can be implemented on top of *AWS Lambda*, *API Gateway* and *[AWS Step Functions](https://aws.amazon.com/step-functions)* on AWS Cloud or using *Azure Functions* on Azure Cloud


## Available code

[Swagger Editor](http://editor.swagger.io/#/) was used to generate the API. The code boilerplate is provided for following languages -

* Python / Flask, using Connexion
* Ruby / Sinatra
* Go
* Erlang
* ASPNetCore (so that can be used on Ubuntu)


## API Documentation

The API follows the OpenAPI 2.0 standard. The documentation can be viewed in two ways:

### Using online Swagger UI tool

1. Go to the [Swagger UI](http://petstore.swagger.io/#/) tool.
2. Enter the following urls -
   - for catalog API - https://rawgit.com/jethar/shoppers/master/product-catalogue/shoppers-catalog-openapi-v1.json
   - for pricing API - https://rawgit.com/jethar/shoppers/master/pricing/shoppers-pricing-openapi-v1.json


### See static API Docs

- for catalog API - https://rawgit.com/jethar/shoppers/api-docs/api-docs/catalog/index.html
- for pricing API - https://rawgit.com/jethar/shoppers/api-docs/api-docs/pricing/index.html
