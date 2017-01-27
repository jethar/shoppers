goog.provide('API.Client.framework-search-criteria-interface');

/**
 * Search criteria interface.
 * @record
 */
API.Client.Framework-search-criteria-interface = function() {}

/**
 * A list of filter groups.
 * @type {!Array<!API.Client.framework-search-filter-group>}
 * @export
 */
API.Client.Framework-search-criteria-interface.prototype.filterGroups;

/**
 * Sort order.
 * @type {!Array<!API.Client.framework-sort-order>}
 * @export
 */
API.Client.Framework-search-criteria-interface.prototype.sortOrders;

/**
 * Page size.
 * @type {!number}
 * @export
 */
API.Client.Framework-search-criteria-interface.prototype.pageSize;

/**
 * Current page.
 * @type {!number}
 * @export
 */
API.Client.Framework-search-criteria-interface.prototype.currentPage;

