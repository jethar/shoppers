goog.provide('API.Client.catalog-inventory-stock-status-criteria-interface');

/**
 * Interface StockStatusCriteriaInterface
 * @record
 */
API.Client.Catalog-inventory-stock-status-criteria-interface = function() {}

/**
 * Associated Mapper Interface name
 * @type {!string}
 * @export
 */
API.Client.Catalog-inventory-stock-status-criteria-interface.prototype.mapperInterfaceName;

/**
 * Criteria objects added to current Composite Criteria
 * @type {!Array<!API.Client.framework-criteria-interface>}
 * @export
 */
API.Client.Catalog-inventory-stock-status-criteria-interface.prototype.criteriaList;

/**
 * List of filters
 * @type {!Array<!string>}
 * @export
 */
API.Client.Catalog-inventory-stock-status-criteria-interface.prototype.filters;

/**
 * Ordering criteria
 * @type {!Array<!string>}
 * @export
 */
API.Client.Catalog-inventory-stock-status-criteria-interface.prototype.orders;

/**
 * Limit
 * @type {!Array<!string>}
 * @export
 */
API.Client.Catalog-inventory-stock-status-criteria-interface.prototype.limit;

