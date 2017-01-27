goog.provide('API.Client.framework-search-filter-group');

/**
 * Groups two or more filters together using a logical OR
 * @record
 */
API.Client.Framework-search-filter-group = function() {}

/**
 * A list of filters in this group
 * @type {!Array<!API.Client.framework-filter>}
 * @export
 */
API.Client.Framework-search-filter-group.prototype.filters;

