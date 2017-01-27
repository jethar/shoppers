goog.provide('API.Client.catalog-data-product-attribute-interface');

/**
 * 
 * @record
 */
API.Client.Catalog-data-product-attribute-interface = function() {}

/**
 * WYSIWYG flag
 * @type {!boolean}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.isWysiwygEnabled;

/**
 * The HTML tags are allowed on the frontend
 * @type {!boolean}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.isHtmlAllowedOnFront;

/**
 * It is used for sorting in product listing
 * @type {!boolean}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.usedForSortBy;

/**
 * It used in layered navigation
 * @type {!boolean}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.isFilterable;

/**
 * It is used in search results layered navigation
 * @type {!boolean}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.isFilterableInSearch;

/**
 * It is used in catalog product grid
 * @type {!boolean}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.isUsedInGrid;

/**
 * It is visible in catalog product grid
 * @type {!boolean}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.isVisibleInGrid;

/**
 * It is filterable in catalog product grid
 * @type {!boolean}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.isFilterableInGrid;

/**
 * Position
 * @type {!number}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.position;

/**
 * Apply to value for the element
 * @type {!Array<!string>}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.applyTo;

/**
 * The attribute can be used in Quick Search
 * @type {!string}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.isSearchable;

/**
 * The attribute can be used in Advanced Search
 * @type {!string}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.isVisibleInAdvancedSearch;

/**
 * The attribute can be compared on the frontend
 * @type {!string}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.isComparable;

/**
 * The attribute can be used for promo rules
 * @type {!string}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.isUsedForPromoRules;

/**
 * The attribute is visible on the frontend
 * @type {!string}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.isVisibleOnFront;

/**
 * The attribute can be used in product listing
 * @type {!string}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.usedInProductListing;

/**
 * Attribute is visible on frontend.
 * @type {!boolean}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.isVisible;

/**
 * Attribute scope
 * @type {!string}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.scope;

/**
 * Id of the attribute.
 * @type {!number}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.attributeId;

/**
 * Code of the attribute.
 * @type {!string}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.attributeCode;

/**
 * HTML for input element.
 * @type {!string}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.frontendInput;

/**
 * Entity type id
 * @type {!string}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.entityTypeId;

/**
 * Attribute is required.
 * @type {!boolean}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.isRequired;

/**
 * Options of the attribute (key => value pairs for select)
 * @type {!Array<!API.Client.eav-data-attribute-option-interface>}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.options;

/**
 * Current attribute has been defined by a user.
 * @type {!boolean}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.isUserDefined;

/**
 * Frontend label for default store
 * @type {!string}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.defaultFrontendLabel;

/**
 * Frontend label for each store
 * @type {!Array<!API.Client.eav-data-attribute-frontend-label-interface>}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.frontendLabels;

/**
 * The note attribute for the element.
 * @type {!string}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.note;

/**
 * Backend type.
 * @type {!string}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.backendType;

/**
 * Backend model
 * @type {!string}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.backendModel;

/**
 * Source model
 * @type {!string}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.sourceModel;

/**
 * Default value for the element.
 * @type {!string}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.defaultValue;

/**
 * This is a unique attribute
 * @type {!string}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.isUnique;

/**
 * Frontend class of attribute
 * @type {!string}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.frontendClass;

/**
 * Validation rules.
 * @type {!Array<!API.Client.eav-data-attribute-validation-rule-interface>}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.validationRules;

/**
 * Custom attributes values.
 * @type {!Array<!API.Client.framework-attribute-interface>}
 * @export
 */
API.Client.Catalog-data-product-attribute-interface.prototype.customAttributes;

