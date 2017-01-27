goog.provide('API.Client.catalog-data-product-link-interface');

/**
 * 
 * @record
 */
API.Client.Catalog-data-product-link-interface = function() {}

/**
 * SKU
 * @type {!string}
 * @export
 */
API.Client.Catalog-data-product-link-interface.prototype.sku;

/**
 * Link type
 * @type {!string}
 * @export
 */
API.Client.Catalog-data-product-link-interface.prototype.linkType;

/**
 * Linked product sku
 * @type {!string}
 * @export
 */
API.Client.Catalog-data-product-link-interface.prototype.linkedProductSku;

/**
 * Linked product type (simple, virtual, etc)
 * @type {!string}
 * @export
 */
API.Client.Catalog-data-product-link-interface.prototype.linkedProductType;

/**
 * Linked item position
 * @type {!number}
 * @export
 */
API.Client.Catalog-data-product-link-interface.prototype.position;

