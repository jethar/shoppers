goog.provide('API.Client.catalog-data-category-tree-interface');

/**
 * 
 * @record
 */
API.Client.Catalog-data-category-tree-interface = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.Catalog-data-category-tree-interface.prototype.id;

/**
 * Parent category ID
 * @type {!number}
 * @export
 */
API.Client.Catalog-data-category-tree-interface.prototype.parentId;

/**
 * Category name
 * @type {!string}
 * @export
 */
API.Client.Catalog-data-category-tree-interface.prototype.name;

/**
 * Whether category is active
 * @type {!boolean}
 * @export
 */
API.Client.Catalog-data-category-tree-interface.prototype.isActive;

/**
 * Category position
 * @type {!number}
 * @export
 */
API.Client.Catalog-data-category-tree-interface.prototype.position;

/**
 * Category level
 * @type {!number}
 * @export
 */
API.Client.Catalog-data-category-tree-interface.prototype.level;

/**
 * Product count
 * @type {!number}
 * @export
 */
API.Client.Catalog-data-category-tree-interface.prototype.productCount;

/**
 * @type {!Array<!API.Client.catalog-data-category-tree-interface>}
 * @export
 */
API.Client.Catalog-data-category-tree-interface.prototype.childrenData;

