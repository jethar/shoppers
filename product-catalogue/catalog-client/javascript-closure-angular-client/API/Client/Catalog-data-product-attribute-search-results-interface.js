goog.provide('API.Client.catalog-data-product-attribute-search-results-interface');

/**
 * 
 * @record
 */
API.Client.Catalog-data-product-attribute-search-results-interface = function() {}

/**
 * Attributes list.
 * @type {!Array<!API.Client.catalog-data-product-attribute-interface>}
 * @export
 */
API.Client.Catalog-data-product-attribute-search-results-interface.prototype.items;

/**
 * @type {!API.Client.framework-search-criteria-interface}
 * @export
 */
API.Client.Catalog-data-product-attribute-search-results-interface.prototype.searchCriteria;

/**
 * Total count.
 * @type {!number}
 * @export
 */
API.Client.Catalog-data-product-attribute-search-results-interface.prototype.totalCount;

