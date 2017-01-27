goog.provide('API.Client.catalog-inventory-data-stock-status-collection-interface');

/**
 * Stock Status collection interface
 * @record
 */
API.Client.Catalog-inventory-data-stock-status-collection-interface = function() {}

/**
 * Items
 * @type {!Array<!API.Client.catalog-inventory-data-stock-status-interface>}
 * @export
 */
API.Client.Catalog-inventory-data-stock-status-collection-interface.prototype.items;

/**
 * @type {!API.Client.catalog-inventory-stock-status-criteria-interface}
 * @export
 */
API.Client.Catalog-inventory-data-stock-status-collection-interface.prototype.searchCriteria;

/**
 * Total count.
 * @type {!number}
 * @export
 */
API.Client.Catalog-inventory-data-stock-status-collection-interface.prototype.totalCount;

