goog.provide('API.Client.product-custom-option-interface');

/**
 * 
 * @record
 */
API.Client.Product-custom-option-interface = function() {}

/**
 * Product SKU
 * @type {!string}
 * @export
 */
API.Client.Product-custom-option-interface.prototype.productSku;

/**
 * Option id
 * @type {!number}
 * @export
 */
API.Client.Product-custom-option-interface.prototype.optionId;

/**
 * Option title
 * @type {!string}
 * @export
 */
API.Client.Product-custom-option-interface.prototype.title;

/**
 * Option type
 * @type {!string}
 * @export
 */
API.Client.Product-custom-option-interface.prototype.type;

/**
 * Sort order
 * @type {!number}
 * @export
 */
API.Client.Product-custom-option-interface.prototype.sortOrder;

/**
 * Is require
 * @type {!boolean}
 * @export
 */
API.Client.Product-custom-option-interface.prototype.isRequire;

/**
 * Price
 * @type {!number}
 * @export
 */
API.Client.Product-custom-option-interface.prototype.price;

/**
 * Price type
 * @type {!string}
 * @export
 */
API.Client.Product-custom-option-interface.prototype.priceType;

/**
 * Sku
 * @type {!string}
 * @export
 */
API.Client.Product-custom-option-interface.prototype.sku;

/**
 * @type {!string}
 * @export
 */
API.Client.Product-custom-option-interface.prototype.fileExtension;

/**
 * @type {!number}
 * @export
 */
API.Client.Product-custom-option-interface.prototype.maxCharacters;

/**
 * @type {!number}
 * @export
 */
API.Client.Product-custom-option-interface.prototype.imageSizeX;

/**
 * @type {!number}
 * @export
 */
API.Client.Product-custom-option-interface.prototype.imageSizeY;

/**
 * @type {!Array<!API.Client.product-custom-option-values-interface>}
 * @export
 */
API.Client.Product-custom-option-interface.prototype.values;

