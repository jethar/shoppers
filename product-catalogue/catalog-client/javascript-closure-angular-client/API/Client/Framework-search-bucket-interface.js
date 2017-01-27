goog.provide('API.Client.framework-search-bucket-interface');

/**
 * Facet Bucket
 * @record
 */
API.Client.Framework-search-bucket-interface = function() {}

/**
 * Field name
 * @type {!string}
 * @export
 */
API.Client.Framework-search-bucket-interface.prototype.name;

/**
 * Field values
 * @type {!Array<!API.Client.framework-search-aggregation-value-interface>}
 * @export
 */
API.Client.Framework-search-bucket-interface.prototype.values;

