goog.provide('API.Client.product');

/**
 * 
 * @record
 */
API.Client.Product = function() {}

/**
 * Id
 * @type {!number}
 * @export
 */
API.Client.Product.prototype.id;

/**
 * Sku
 * @type {!string}
 * @export
 */
API.Client.Product.prototype.sku;

/**
 * Name
 * @type {!string}
 * @export
 */
API.Client.Product.prototype.name;

/**
 * Attribute set id
 * @type {!number}
 * @export
 */
API.Client.Product.prototype.attributeSetId;

/**
 * Price
 * @type {!number}
 * @export
 */
API.Client.Product.prototype.price;

/**
 * Status
 * @type {!number}
 * @export
 */
API.Client.Product.prototype.status;

/**
 * Visibility
 * @type {!number}
 * @export
 */
API.Client.Product.prototype.visibility;

/**
 * Type id
 * @type {!string}
 * @export
 */
API.Client.Product.prototype.typeId;

/**
 * Created date
 * @type {!string}
 * @export
 */
API.Client.Product.prototype.createdAt;

/**
 * Updated date
 * @type {!string}
 * @export
 */
API.Client.Product.prototype.updatedAt;

/**
 * Weight
 * @type {!number}
 * @export
 */
API.Client.Product.prototype.weight;

/**
 * @type {!API.Client.product-extension-interface}
 * @export
 */
API.Client.Product.prototype.extensionAttributes;

/**
 * Product links info
 * @type {!Array<!API.Client.product-link-interface>}
 * @export
 */
API.Client.Product.prototype.productLinks;

/**
 * List of product options
 * @type {!Array<!API.Client.product-custom-option-interface>}
 * @export
 */
API.Client.Product.prototype.options;

/**
 * List of product tier prices
 * @type {!Array<!API.Client.product-tier-price-interface>}
 * @export
 */
API.Client.Product.prototype.tierPrices;

/**
 * Custom attributes values.
 * @type {!Array<!API.Client.framework-attribute-interface>}
 * @export
 */
API.Client.Product.prototype.customAttributes;

