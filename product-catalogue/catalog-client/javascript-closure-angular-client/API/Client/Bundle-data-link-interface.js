goog.provide('API.Client.bundle-data-link-interface');

/**
 * Interface LinkInterface
 * @record
 */
API.Client.Bundle-data-link-interface = function() {}

/**
 * The identifier
 * @type {!string}
 * @export
 */
API.Client.Bundle-data-link-interface.prototype.id;

/**
 * Linked product sku
 * @type {!string}
 * @export
 */
API.Client.Bundle-data-link-interface.prototype.sku;

/**
 * Option id
 * @type {!number}
 * @export
 */
API.Client.Bundle-data-link-interface.prototype.optionId;

/**
 * Qty
 * @type {!number}
 * @export
 */
API.Client.Bundle-data-link-interface.prototype.qty;

/**
 * Position
 * @type {!number}
 * @export
 */
API.Client.Bundle-data-link-interface.prototype.position;

/**
 * Is default
 * @type {!boolean}
 * @export
 */
API.Client.Bundle-data-link-interface.prototype.isDefault;

/**
 * Price
 * @type {!number}
 * @export
 */
API.Client.Bundle-data-link-interface.prototype.price;

/**
 * Price type
 * @type {!number}
 * @export
 */
API.Client.Bundle-data-link-interface.prototype.priceType;

/**
 * Whether quantity could be changed
 * @type {!number}
 * @export
 */
API.Client.Bundle-data-link-interface.prototype.canChangeQuantity;

