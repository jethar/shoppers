goog.provide('API.Client.error-response');

/**
 * @record
 */
API.Client.Error-response = function() {}

/**
 * Error message
 * @type {!string}
 * @export
 */
API.Client.Error-response.prototype.message;

/**
 * @type {!API.Client.error-errors}
 * @export
 */
API.Client.Error-response.prototype.errors;

/**
 * Error code
 * @type {!number}
 * @export
 */
API.Client.Error-response.prototype.code;

/**
 * @type {!API.Client.error-parameters}
 * @export
 */
API.Client.Error-response.prototype.parameters;

/**
 * Stack trace
 * @type {!string}
 * @export
 */
API.Client.Error-response.prototype.trace;

