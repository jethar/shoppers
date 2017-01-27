goog.provide('API.Client.framework-search-aggregation-interface');

/**
 * Faceted data
 * @record
 */
API.Client.Framework-search-aggregation-interface = function() {}

/**
 * All Document fields
 * @type {!Array<!API.Client.framework-search-bucket-interface>}
 * @export
 */
API.Client.Framework-search-aggregation-interface.prototype.buckets;

/**
 * Document field names
 * @type {!Array<!string>}
 * @export
 */
API.Client.Framework-search-aggregation-interface.prototype.bucketNames;

