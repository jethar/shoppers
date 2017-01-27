goog.provide('API.Client.catalog-data-product-attribute-media-gallery-entry-interface');

/**
 * 
 * @record
 */
API.Client.Catalog-data-product-attribute-media-gallery-entry-interface = function() {}

/**
 * Gallery entry ID
 * @type {!number}
 * @export
 */
API.Client.Catalog-data-product-attribute-media-gallery-entry-interface.prototype.id;

/**
 * Media type
 * @type {!string}
 * @export
 */
API.Client.Catalog-data-product-attribute-media-gallery-entry-interface.prototype.mediaType;

/**
 * Gallery entry alternative text
 * @type {!string}
 * @export
 */
API.Client.Catalog-data-product-attribute-media-gallery-entry-interface.prototype.label;

/**
 * Gallery entry position (sort order)
 * @type {!number}
 * @export
 */
API.Client.Catalog-data-product-attribute-media-gallery-entry-interface.prototype.position;

/**
 * If gallery entry is hidden from product page
 * @type {!boolean}
 * @export
 */
API.Client.Catalog-data-product-attribute-media-gallery-entry-interface.prototype.disabled;

/**
 * Gallery entry image types (thumbnail, image, small_image etc)
 * @type {!Array<!string>}
 * @export
 */
API.Client.Catalog-data-product-attribute-media-gallery-entry-interface.prototype.types;

/**
 * File path
 * @type {!string}
 * @export
 */
API.Client.Catalog-data-product-attribute-media-gallery-entry-interface.prototype.file;

/**
 * @type {!API.Client.framework-data-image-content-interface}
 * @export
 */
API.Client.Catalog-data-product-attribute-media-gallery-entry-interface.prototype.content;

