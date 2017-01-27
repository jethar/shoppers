goog.provide('API.Client.framework-search-search-result-interface');

/**
 * 
 * @record
 */
API.Client.Framework-search-search-result-interface = function() {}

/**
 * @type {!Array<!API.Client.framework-search-document-interface>}
 * @export
 */
API.Client.Framework-search-search-result-interface.prototype.items;

/**
 * @type {!API.Client.framework-search-aggregation-interface}
 * @export
 */
API.Client.Framework-search-search-result-interface.prototype.aggregations;

/**
 * @type {!API.Client.framework-search-search-criteria-interface}
 * @export
 */
API.Client.Framework-search-search-result-interface.prototype.searchCriteria;

/**
 * Total count.
 * @type {!number}
 * @export
 */
API.Client.Framework-search-search-result-interface.prototype.totalCount;

