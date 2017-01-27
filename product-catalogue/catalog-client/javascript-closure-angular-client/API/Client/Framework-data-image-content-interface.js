goog.provide('API.Client.framework-data-image-content-interface');

/**
 * Image Content data interface
 * @record
 */
API.Client.Framework-data-image-content-interface = function() {}

/**
 * Media data (base64 encoded content)
 * @type {!string}
 * @export
 */
API.Client.Framework-data-image-content-interface.prototype.base64EncodedData;

/**
 * MIME type
 * @type {!string}
 * @export
 */
API.Client.Framework-data-image-content-interface.prototype.type;

/**
 * Image name
 * @type {!string}
 * @export
 */
API.Client.Framework-data-image-content-interface.prototype.name;

