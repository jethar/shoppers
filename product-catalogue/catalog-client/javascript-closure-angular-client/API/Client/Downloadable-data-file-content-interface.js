goog.provide('API.Client.downloadable-data-file-content-interface');

/**
 * 
 * @record
 */
API.Client.Downloadable-data-file-content-interface = function() {}

/**
 * Data (base64 encoded content)
 * @type {!string}
 * @export
 */
API.Client.Downloadable-data-file-content-interface.prototype.fileData;

/**
 * File name
 * @type {!string}
 * @export
 */
API.Client.Downloadable-data-file-content-interface.prototype.name;

