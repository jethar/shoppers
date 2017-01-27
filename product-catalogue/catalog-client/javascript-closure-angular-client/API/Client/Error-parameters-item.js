goog.provide('API.Client.error-parameters-item');

/**
 * Error parameters item
 * @record
 */
API.Client.Error-parameters-item = function() {}

/**
 * ACL resource
 * @type {!string}
 * @export
 */
API.Client.Error-parameters-item.prototype.resources;

/**
 * Missing or invalid field name
 * @type {!string}
 * @export
 */
API.Client.Error-parameters-item.prototype.fieldName;

/**
 * Incorrect field value
 * @type {!string}
 * @export
 */
API.Client.Error-parameters-item.prototype.fieldValue;

