goog.provide('API.Client.catalog-data-product-search-results-interface');

/**
 * 
 * @record
 */
API.Client.Catalog-data-product-search-results-interface = function() {}

/**
 * Attributes list.
 * @type {!Array<!API.Client.product>}
 * @export
 */
API.Client.Catalog-data-product-search-results-interface.prototype.items;

/**
 * @type {!API.Client.framework-search-criteria-interface}
 * @export
 */
API.Client.Catalog-data-product-search-results-interface.prototype.searchCriteria;

/**
 * Total count.
 * @type {!number}
 * @export
 */
API.Client.Catalog-data-product-search-results-interface.prototype.totalCount;

