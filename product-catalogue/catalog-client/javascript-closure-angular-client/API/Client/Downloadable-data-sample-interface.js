goog.provide('API.Client.downloadable-data-sample-interface');

/**
 * 
 * @record
 */
API.Client.Downloadable-data-sample-interface = function() {}

/**
 * Sample(or link) id
 * @type {!number}
 * @export
 */
API.Client.Downloadable-data-sample-interface.prototype.id;

/**
 * Title
 * @type {!string}
 * @export
 */
API.Client.Downloadable-data-sample-interface.prototype.title;

/**
 * Order index for sample
 * @type {!number}
 * @export
 */
API.Client.Downloadable-data-sample-interface.prototype.sortOrder;

/**
 * @type {!string}
 * @export
 */
API.Client.Downloadable-data-sample-interface.prototype.sampleType;

/**
 * relative file path
 * @type {!string}
 * @export
 */
API.Client.Downloadable-data-sample-interface.prototype.sampleFile;

/**
 * @type {!API.Client.downloadable-data-file-content-interface}
 * @export
 */
API.Client.Downloadable-data-sample-interface.prototype.sampleFileContent;

/**
 * file URL
 * @type {!string}
 * @export
 */
API.Client.Downloadable-data-sample-interface.prototype.sampleUrl;

