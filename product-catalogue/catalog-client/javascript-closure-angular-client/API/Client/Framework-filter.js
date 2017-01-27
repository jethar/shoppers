goog.provide('API.Client.framework-filter');

/**
 * Filter which can be used by any methods from service layer.
 * @record
 */
API.Client.Framework-filter = function() {}

/**
 * Field
 * @type {!string}
 * @export
 */
API.Client.Framework-filter.prototype.field;

/**
 * Value
 * @type {!string}
 * @export
 */
API.Client.Framework-filter.prototype.value;

/**
 * Condition type
 * @type {!string}
 * @export
 */
API.Client.Framework-filter.prototype.conditionType;

