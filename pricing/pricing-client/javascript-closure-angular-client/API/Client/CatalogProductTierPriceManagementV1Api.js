/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.CatalogProductTierPriceManagementV1Api.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * This is a Shoppers Catalogue server.  [Learn about Swagger](http://swagger.io) or join the IRC channel &#x60;#swagger&#x60; on irc.freenode.net.  For this sample, you can use the api key &#x60;special-key&#x60; to test the authorization filters 
 * Version: 1.0.0
 * Generated by: io.swagger.codegen.languages.JavascriptClosureAngularClientCodegen
 */
/**
 * @license Apache 2.0
 * http://www.apache.org/licenses/LICENSE-2.0.html
 */

goog.provide('API.Client.CatalogProductTierPriceManagementV1Api');

goog.require('API.Client.error-response');
goog.require('API.Client.product-tier-price-interface');

/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.CatalogProductTierPriceManagementV1Api = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('CatalogProductTierPriceManagementV1ApiBasePath') ?
                   /** @type {!string} */ ($injector.get('CatalogProductTierPriceManagementV1ApiBasePath')) :
                   'http://shoppers.io/v2';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('CatalogProductTierPriceManagementV1ApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('CatalogProductTierPriceManagementV1ApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.CatalogProductTierPriceManagementV1Api.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * 
 * Create tier price for product
 * @param {!string} sku 
 * @param {!string} customerGroupId &#39;all&#39; can be used to specify &#39;ALL GROUPS&#39;
 * @param {!number} price 
 * @param {!number} qty 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!boolean>}
 */
API.Client.CatalogProductTierPriceManagementV1Api.prototype.catalogProductTierPriceManagementV1AddPost = function(sku, customerGroupId, price, qty, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/v1/products/{sku}/group-prices/{customerGroupId}/tiers/{qty}/price/{price}'
      .replace('{' + 'sku' + '}', String(sku))
      .replace('{' + 'customerGroupId' + '}', String(customerGroupId))
      .replace('{' + 'price' + '}', String(price))
      .replace('{' + 'qty' + '}', String(qty));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'sku' is set
  if (!sku) {
    throw new Error('Missing required parameter sku when calling catalogProductTierPriceManagementV1AddPost');
  }
  // verify required parameter 'customerGroupId' is set
  if (!customerGroupId) {
    throw new Error('Missing required parameter customerGroupId when calling catalogProductTierPriceManagementV1AddPost');
  }
  // verify required parameter 'price' is set
  if (!price) {
    throw new Error('Missing required parameter price when calling catalogProductTierPriceManagementV1AddPost');
  }
  // verify required parameter 'qty' is set
  if (!qty) {
    throw new Error('Missing required parameter qty when calling catalogProductTierPriceManagementV1AddPost');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * 
 * Get tier price of product
 * @param {!string} sku 
 * @param {!string} customerGroupId &#39;all&#39; can be used to specify &#39;ALL GROUPS&#39;
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.product-tier-price-interface>>}
 */
API.Client.CatalogProductTierPriceManagementV1Api.prototype.catalogProductTierPriceManagementV1GetListGet = function(sku, customerGroupId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/v1/products/{sku}/group-prices/{customerGroupId}/tiers'
      .replace('{' + 'sku' + '}', String(sku))
      .replace('{' + 'customerGroupId' + '}', String(customerGroupId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'sku' is set
  if (!sku) {
    throw new Error('Missing required parameter sku when calling catalogProductTierPriceManagementV1GetListGet');
  }
  // verify required parameter 'customerGroupId' is set
  if (!customerGroupId) {
    throw new Error('Missing required parameter customerGroupId when calling catalogProductTierPriceManagementV1GetListGet');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * 
 * Remove tier price from product
 * @param {!string} sku 
 * @param {!string} customerGroupId &#39;all&#39; can be used to specify &#39;ALL GROUPS&#39;
 * @param {!number} qty 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!boolean>}
 */
API.Client.CatalogProductTierPriceManagementV1Api.prototype.catalogProductTierPriceManagementV1RemoveDelete = function(sku, customerGroupId, qty, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/v1/products/{sku}/group-prices/{customerGroupId}/tiers/{qty}'
      .replace('{' + 'sku' + '}', String(sku))
      .replace('{' + 'customerGroupId' + '}', String(customerGroupId))
      .replace('{' + 'qty' + '}', String(qty));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'sku' is set
  if (!sku) {
    throw new Error('Missing required parameter sku when calling catalogProductTierPriceManagementV1RemoveDelete');
  }
  // verify required parameter 'customerGroupId' is set
  if (!customerGroupId) {
    throw new Error('Missing required parameter customerGroupId when calling catalogProductTierPriceManagementV1RemoveDelete');
  }
  // verify required parameter 'qty' is set
  if (!qty) {
    throw new Error('Missing required parameter qty when calling catalogProductTierPriceManagementV1RemoveDelete');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'DELETE',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}
