goog.provide('API.Client.configurable-product-data-option-interface');

/**
 * Interface OptionInterface
 * @record
 */
API.Client.Configurable-product-data-option-interface = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.Configurable-product-data-option-interface.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.Configurable-product-data-option-interface.prototype.attributeId;

/**
 * @type {!string}
 * @export
 */
API.Client.Configurable-product-data-option-interface.prototype.label;

/**
 * @type {!number}
 * @export
 */
API.Client.Configurable-product-data-option-interface.prototype.position;

/**
 * @type {!boolean}
 * @export
 */
API.Client.Configurable-product-data-option-interface.prototype.isUseDefault;

/**
 * @type {!Array<!API.Client.configurable-product-data-option-value-interface>}
 * @export
 */
API.Client.Configurable-product-data-option-interface.prototype.values;

/**
 * @type {!number}
 * @export
 */
API.Client.Configurable-product-data-option-interface.prototype.productId;

