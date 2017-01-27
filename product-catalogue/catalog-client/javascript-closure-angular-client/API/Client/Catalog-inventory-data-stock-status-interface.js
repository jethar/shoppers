goog.provide('API.Client.catalog-inventory-data-stock-status-interface');

/**
 * Interface StockStatusInterface
 * @record
 */
API.Client.Catalog-inventory-data-stock-status-interface = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.Catalog-inventory-data-stock-status-interface.prototype.productId;

/**
 * @type {!number}
 * @export
 */
API.Client.Catalog-inventory-data-stock-status-interface.prototype.stockId;

/**
 * @type {!number}
 * @export
 */
API.Client.Catalog-inventory-data-stock-status-interface.prototype.qty;

/**
 * @type {!number}
 * @export
 */
API.Client.Catalog-inventory-data-stock-status-interface.prototype.stockStatus;

/**
 * @type {!API.Client.catalog-inventory-data-stock-item-interface}
 * @export
 */
API.Client.Catalog-inventory-data-stock-status-interface.prototype.stockItem;

