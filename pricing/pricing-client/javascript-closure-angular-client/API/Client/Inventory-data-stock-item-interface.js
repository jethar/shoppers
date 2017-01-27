goog.provide('API.Client.inventory-data-stock-item-interface');

/**
 * Interface StockItem
 * @record
 */
API.Client.Inventory-data-stock-item-interface = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.Inventory-data-stock-item-interface.prototype.itemId;

/**
 * @type {!number}
 * @export
 */
API.Client.Inventory-data-stock-item-interface.prototype.productId;

/**
 * Stock identifier
 * @type {!number}
 * @export
 */
API.Client.Inventory-data-stock-item-interface.prototype.stockId;

/**
 * @type {!number}
 * @export
 */
API.Client.Inventory-data-stock-item-interface.prototype.qty;

/**
 * Stock Availability
 * @type {!boolean}
 * @export
 */
API.Client.Inventory-data-stock-item-interface.prototype.isInStock;

/**
 * @type {!boolean}
 * @export
 */
API.Client.Inventory-data-stock-item-interface.prototype.isQtyDecimal;

/**
 * @type {!boolean}
 * @export
 */
API.Client.Inventory-data-stock-item-interface.prototype.showDefaultNotificationMessage;

/**
 * @type {!boolean}
 * @export
 */
API.Client.Inventory-data-stock-item-interface.prototype.useConfigMinQty;

/**
 * Minimal quantity available for item status in stock
 * @type {!number}
 * @export
 */
API.Client.Inventory-data-stock-item-interface.prototype.minQty;

/**
 * @type {!number}
 * @export
 */
API.Client.Inventory-data-stock-item-interface.prototype.useConfigMinSaleQty;

/**
 * Minimum Qty Allowed in Shopping Cart or NULL when there is no limitation
 * @type {!number}
 * @export
 */
API.Client.Inventory-data-stock-item-interface.prototype.minSaleQty;

/**
 * @type {!boolean}
 * @export
 */
API.Client.Inventory-data-stock-item-interface.prototype.useConfigMaxSaleQty;

/**
 * Maximum Qty Allowed in Shopping Cart data wrapper
 * @type {!number}
 * @export
 */
API.Client.Inventory-data-stock-item-interface.prototype.maxSaleQty;

/**
 * @type {!boolean}
 * @export
 */
API.Client.Inventory-data-stock-item-interface.prototype.useConfigBackorders;

/**
 * Backorders status
 * @type {!number}
 * @export
 */
API.Client.Inventory-data-stock-item-interface.prototype.backorders;

/**
 * @type {!boolean}
 * @export
 */
API.Client.Inventory-data-stock-item-interface.prototype.useConfigNotifyStockQty;

/**
 * Notify for Quantity Below data wrapper
 * @type {!number}
 * @export
 */
API.Client.Inventory-data-stock-item-interface.prototype.notifyStockQty;

/**
 * @type {!boolean}
 * @export
 */
API.Client.Inventory-data-stock-item-interface.prototype.useConfigQtyIncrements;

/**
 * Quantity Increments data wrapper
 * @type {!number}
 * @export
 */
API.Client.Inventory-data-stock-item-interface.prototype.qtyIncrements;

/**
 * @type {!boolean}
 * @export
 */
API.Client.Inventory-data-stock-item-interface.prototype.useConfigEnableQtyInc;

/**
 * Whether Quantity Increments is enabled
 * @type {!boolean}
 * @export
 */
API.Client.Inventory-data-stock-item-interface.prototype.enableQtyIncrements;

/**
 * @type {!boolean}
 * @export
 */
API.Client.Inventory-data-stock-item-interface.prototype.useConfigManageStock;

/**
 * Can Manage Stock
 * @type {!boolean}
 * @export
 */
API.Client.Inventory-data-stock-item-interface.prototype.manageStock;

/**
 * @type {!string}
 * @export
 */
API.Client.Inventory-data-stock-item-interface.prototype.lowStockDate;

/**
 * @type {!boolean}
 * @export
 */
API.Client.Inventory-data-stock-item-interface.prototype.isDecimalDivided;

/**
 * @type {!number}
 * @export
 */
API.Client.Inventory-data-stock-item-interface.prototype.stockStatusChangedAuto;

