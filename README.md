# shoppers
A Case Study in microservice APIs

## Architecture

**Logical Diagram for the Microservices**
![Logical Diagram for the Microservices](https://rawgit.com/jethar/shoppers/master/design/Shoppers_Microservices.png)

There are two approaches to building scalable technical stack:
- Microservices
- Serverless Architecture

***Serverless Architecture*** provides certain advantages in simplifying the deployment as well as it is inherently built on event-driven stack while it needs to be architected as part of solution for microservices architecture.

The **technology stack** is as follows:
* Frontend built as *[progressive web app](https://developers.google.com/web/progressive-web-apps/)* using [vue.js](https://vuejs.org/) / vuex
* Microservices built on [Phoenix](http://www.phoenixframework.org/) or [Connexion](https://connexion.readthedocs.io/en/latest/_)
* ElasticSearch for search
* EventStore implemnetation on top of Kafka with PostgreSQL and Cassandra supported by Redis for fast cache.
* Bi Analytics stack built on Flink.
* Supporting libraries and services like [zipkin](http://zipkin.io/).

Serverless can be implemented on top of *AWS Lambda*, *API Gateway* and *[AWS Step Functions](https://aws.amazon.com/step-functions)* on AWS Cloud or using *Azure Functions* on Azure Cloud

### Approach and Assumptions / Constraints

1. Due to limited time, the first point was to prioritize and set what can be achieved in given time.
2. The logical services for Microservices architeture has been provided. 
3. For generating the APIs, [swagger](http://swagger.io/) was used. The project gave an opportunity to gain more learning about what the framework had to offer. It provides API framework providing specification and tools across *Design, Build and Document*. IT leverages the [OpenAPI](https://www.openapis.org/) initiative.
4. As outlined incase study requirement, the focus was given on a couple of microservices around catalog and pricing and separate API sepcification were created for these in json format.
5. Boilerplate code has been provided to compare implementation across various languages, which wre contenders.
6. Some of the implicit requirements like presence across geographies were designed across in API, like provide linking a product to different website.
7. Deployment considerations, such as use of docker/ kubernetes have been considered but have not been explicitly outlined as that was not the primary focus here. 

**What can be improved:**
There is still some extraneous classes / code in different services like category in Pricing microservices which need to be cleaned out.


## Implementation

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
