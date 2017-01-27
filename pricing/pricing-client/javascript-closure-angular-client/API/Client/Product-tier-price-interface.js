goog.provide('API.Client.product-tier-price-interface');

/**
 * 
 * @record
 */
API.Client.Product-tier-price-interface = function() {}

/**
 * Customer group id
 * @type {!number}
 * @export
 */
API.Client.Product-tier-price-interface.prototype.customerGroupId;

/**
 * Tier qty
 * @type {!number}
 * @export
 */
API.Client.Product-tier-price-interface.prototype.qty;

/**
 * Price value
 * @type {!number}
 * @export
 */
API.Client.Product-tier-price-interface.prototype.value;

