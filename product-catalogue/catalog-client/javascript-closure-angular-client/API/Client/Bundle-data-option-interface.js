goog.provide('API.Client.bundle-data-option-interface');

/**
 * Interface OptionInterface
 * @record
 */
API.Client.Bundle-data-option-interface = function() {}

/**
 * Option id
 * @type {!number}
 * @export
 */
API.Client.Bundle-data-option-interface.prototype.optionId;

/**
 * Option title
 * @type {!string}
 * @export
 */
API.Client.Bundle-data-option-interface.prototype.title;

/**
 * Is required option
 * @type {!boolean}
 * @export
 */
API.Client.Bundle-data-option-interface.prototype.required;

/**
 * Input type
 * @type {!string}
 * @export
 */
API.Client.Bundle-data-option-interface.prototype.type;

/**
 * Option position
 * @type {!number}
 * @export
 */
API.Client.Bundle-data-option-interface.prototype.position;

/**
 * Product sku
 * @type {!string}
 * @export
 */
API.Client.Bundle-data-option-interface.prototype.sku;

/**
 * Product links
 * @type {!Array<!API.Client.bundle-data-link-interface>}
 * @export
 */
API.Client.Bundle-data-option-interface.prototype.productLinks;

