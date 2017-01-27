goog.provide('API.Client.downloadable-data-link-interface');

/**
 * 
 * @record
 */
API.Client.Downloadable-data-link-interface = function() {}

/**
 * Sample(or link) id
 * @type {!number}
 * @export
 */
API.Client.Downloadable-data-link-interface.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.Downloadable-data-link-interface.prototype.title;

/**
 * @type {!number}
 * @export
 */
API.Client.Downloadable-data-link-interface.prototype.sortOrder;

/**
 * Shareable status
 * @type {!number}
 * @export
 */
API.Client.Downloadable-data-link-interface.prototype.isShareable;

/**
 * Price
 * @type {!number}
 * @export
 */
API.Client.Downloadable-data-link-interface.prototype.price;

/**
 * Of downloads per user
 * @type {!number}
 * @export
 */
API.Client.Downloadable-data-link-interface.prototype.numberOfDownloads;

/**
 * @type {!string}
 * @export
 */
API.Client.Downloadable-data-link-interface.prototype.linkType;

/**
 * relative file path
 * @type {!string}
 * @export
 */
API.Client.Downloadable-data-link-interface.prototype.linkFile;

/**
 * @type {!API.Client.downloadable-data-file-content-interface}
 * @export
 */
API.Client.Downloadable-data-link-interface.prototype.linkFileContent;

/**
 * Link url or null when type is 'file'
 * @type {!string}
 * @export
 */
API.Client.Downloadable-data-link-interface.prototype.linkUrl;

/**
 * @type {!string}
 * @export
 */
API.Client.Downloadable-data-link-interface.prototype.sampleType;

/**
 * relative file path
 * @type {!string}
 * @export
 */
API.Client.Downloadable-data-link-interface.prototype.sampleFile;

/**
 * @type {!API.Client.downloadable-data-file-content-interface}
 * @export
 */
API.Client.Downloadable-data-link-interface.prototype.sampleFileContent;

/**
 * file URL
 * @type {!string}
 * @export
 */
API.Client.Downloadable-data-link-interface.prototype.sampleUrl;

