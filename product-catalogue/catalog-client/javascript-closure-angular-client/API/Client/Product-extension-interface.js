goog.provide('API.Client.product-extension-interface');

/**
 * extending
 * @record
 */
API.Client.Product-extension-interface = function() {}

/**
 * @type {!API.Client.catalog-inventory-data-stock-item-interface}
 * @export
 */
API.Client.Product-extension-interface.prototype.stockItem;

/**
 * @type {!Array<!API.Client.bundle-data-option-interface>}
 * @export
 */
API.Client.Product-extension-interface.prototype.bundleProductOptions;

/**
 * @type {!Array<!API.Client.downloadable-data-link-interface>}
 * @export
 */
API.Client.Product-extension-interface.prototype.downloadableProductLinks;

/**
 * @type {!Array<!API.Client.downloadable-data-sample-interface>}
 * @export
 */
API.Client.Product-extension-interface.prototype.downloadableProductSamples;

/**
 * @type {!Array<!API.Client.configurable-product-data-option-interface>}
 * @export
 */
API.Client.Product-extension-interface.prototype.configurableProductOptions;

/**
 * @type {!Array<!number>}
 * @export
 */
API.Client.Product-extension-interface.prototype.configurableProductLinks;

