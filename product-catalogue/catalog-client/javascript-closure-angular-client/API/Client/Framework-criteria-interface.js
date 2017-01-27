goog.provide('API.Client.framework-criteria-interface');

/**
 * Interface CriteriaInterface
 * @record
 */
API.Client.Framework-criteria-interface = function() {}

/**
 * Associated Mapper Interface name
 * @type {!string}
 * @export
 */
API.Client.Framework-criteria-interface.prototype.mapperInterfaceName;

/**
 * Criteria objects added to current Composite Criteria
 * @type {!Array<!API.Client.framework-criteria-interface>}
 * @export
 */
API.Client.Framework-criteria-interface.prototype.criteriaList;

/**
 * List of filters
 * @type {!Array<!string>}
 * @export
 */
API.Client.Framework-criteria-interface.prototype.filters;

/**
 * Ordering criteria
 * @type {!Array<!string>}
 * @export
 */
API.Client.Framework-criteria-interface.prototype.orders;

/**
 * Limit
 * @type {!Array<!string>}
 * @export
 */
API.Client.Framework-criteria-interface.prototype.limit;

