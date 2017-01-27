goog.provide('API.Client.product-link-interface');

/**
 * 
 * @record
 */
API.Client.Product-link-interface = function() {}

/**
 * SKU
 * @type {!string}
 * @export
 */
API.Client.Product-link-interface.prototype.sku;

/**
 * Link type
 * @type {!string}
 * @export
 */
API.Client.Product-link-interface.prototype.linkType;

/**
 * Linked product sku
 * @type {!string}
 * @export
 */
API.Client.Product-link-interface.prototype.linkedProductSku;

/**
 * Linked product type (simple, virtual, etc)
 * @type {!string}
 * @export
 */
API.Client.Product-link-interface.prototype.linkedProductType;

/**
 * Linked item position
 * @type {!number}
 * @export
 */
API.Client.Product-link-interface.prototype.position;

