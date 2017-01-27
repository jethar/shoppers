goog.provide('API.Client.eav-data-attribute-option-interface');

/**
 * Created from:
 * @record
 */
API.Client.Eav-data-attribute-option-interface = function() {}

/**
 * Option label
 * @type {!string}
 * @export
 */
API.Client.Eav-data-attribute-option-interface.prototype.label;

/**
 * Option value
 * @type {!string}
 * @export
 */
API.Client.Eav-data-attribute-option-interface.prototype.value;

/**
 * Option order
 * @type {!number}
 * @export
 */
API.Client.Eav-data-attribute-option-interface.prototype.sortOrder;

/**
 * Default
 * @type {!boolean}
 * @export
 */
API.Client.Eav-data-attribute-option-interface.prototype.isDefault;

/**
 * Option label for store scopes
 * @type {!Array<!API.Client.eav-data-attribute-option-label-interface>}
 * @export
 */
API.Client.Eav-data-attribute-option-interface.prototype.storeLabels;

