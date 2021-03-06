//
// CatalogDataProductAttributeInterface.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/**  */
open class CatalogDataProductAttributeInterface: JSONEncodable {
    /** WYSIWYG flag */
    public var isWysiwygEnabled: Bool?
    /** The HTML tags are allowed on the frontend */
    public var isHtmlAllowedOnFront: Bool?
    /** It is used for sorting in product listing */
    public var usedForSortBy: Bool?
    /** It used in layered navigation */
    public var isFilterable: Bool?
    /** It is used in search results layered navigation */
    public var isFilterableInSearch: Bool?
    /** It is used in catalog product grid */
    public var isUsedInGrid: Bool?
    /** It is visible in catalog product grid */
    public var isVisibleInGrid: Bool?
    /** It is filterable in catalog product grid */
    public var isFilterableInGrid: Bool?
    /** Position */
    public var position: Int32?
    /** Apply to value for the element */
    public var applyTo: [String]?
    /** The attribute can be used in Quick Search */
    public var isSearchable: String?
    /** The attribute can be used in Advanced Search */
    public var isVisibleInAdvancedSearch: String?
    /** The attribute can be compared on the frontend */
    public var isComparable: String?
    /** The attribute can be used for promo rules */
    public var isUsedForPromoRules: String?
    /** The attribute is visible on the frontend */
    public var isVisibleOnFront: String?
    /** The attribute can be used in product listing */
    public var usedInProductListing: String?
    /** Attribute is visible on frontend. */
    public var isVisible: Bool?
    /** Attribute scope */
    public var scope: String?
    /** Id of the attribute. */
    public var attributeId: Int32?
    /** Code of the attribute. */
    public var attributeCode: String?
    /** HTML for input element. */
    public var frontendInput: String?
    /** Entity type id */
    public var entityTypeId: String?
    /** Attribute is required. */
    public var isRequired: Bool?
    /** Options of the attribute (key &#x3D;&gt; value pairs for select) */
    public var options: [EavDataAttributeOptionInterface]?
    /** Current attribute has been defined by a user. */
    public var isUserDefined: Bool?
    /** Frontend label for default store */
    public var defaultFrontendLabel: String?
    /** Frontend label for each store */
    public var frontendLabels: [EavDataAttributeFrontendLabelInterface]?
    /** The note attribute for the element. */
    public var note: String?
    /** Backend type. */
    public var backendType: String?
    /** Backend model */
    public var backendModel: String?
    /** Source model */
    public var sourceModel: String?
    /** Default value for the element. */
    public var defaultValue: String?
    /** This is a unique attribute */
    public var isUnique: String?
    /** Frontend class of attribute */
    public var frontendClass: String?
    /** Validation rules. */
    public var validationRules: [EavDataAttributeValidationRuleInterface]?
    /** Custom attributes values. */
    public var customAttributes: [FrameworkAttributeInterface]?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["is_wysiwyg_enabled"] = self.isWysiwygEnabled
        nillableDictionary["is_html_allowed_on_front"] = self.isHtmlAllowedOnFront
        nillableDictionary["used_for_sort_by"] = self.usedForSortBy
        nillableDictionary["is_filterable"] = self.isFilterable
        nillableDictionary["is_filterable_in_search"] = self.isFilterableInSearch
        nillableDictionary["is_used_in_grid"] = self.isUsedInGrid
        nillableDictionary["is_visible_in_grid"] = self.isVisibleInGrid
        nillableDictionary["is_filterable_in_grid"] = self.isFilterableInGrid
        nillableDictionary["position"] = self.position?.encodeToJSON()
        nillableDictionary["apply_to"] = self.applyTo?.encodeToJSON()
        nillableDictionary["is_searchable"] = self.isSearchable
        nillableDictionary["is_visible_in_advanced_search"] = self.isVisibleInAdvancedSearch
        nillableDictionary["is_comparable"] = self.isComparable
        nillableDictionary["is_used_for_promo_rules"] = self.isUsedForPromoRules
        nillableDictionary["is_visible_on_front"] = self.isVisibleOnFront
        nillableDictionary["used_in_product_listing"] = self.usedInProductListing
        nillableDictionary["is_visible"] = self.isVisible
        nillableDictionary["scope"] = self.scope
        nillableDictionary["attribute_id"] = self.attributeId?.encodeToJSON()
        nillableDictionary["attribute_code"] = self.attributeCode
        nillableDictionary["frontend_input"] = self.frontendInput
        nillableDictionary["entity_type_id"] = self.entityTypeId
        nillableDictionary["is_required"] = self.isRequired
        nillableDictionary["options"] = self.options?.encodeToJSON()
        nillableDictionary["is_user_defined"] = self.isUserDefined
        nillableDictionary["default_frontend_label"] = self.defaultFrontendLabel
        nillableDictionary["frontend_labels"] = self.frontendLabels?.encodeToJSON()
        nillableDictionary["note"] = self.note
        nillableDictionary["backend_type"] = self.backendType
        nillableDictionary["backend_model"] = self.backendModel
        nillableDictionary["source_model"] = self.sourceModel
        nillableDictionary["default_value"] = self.defaultValue
        nillableDictionary["is_unique"] = self.isUnique
        nillableDictionary["frontend_class"] = self.frontendClass
        nillableDictionary["validation_rules"] = self.validationRules?.encodeToJSON()
        nillableDictionary["custom_attributes"] = self.customAttributes?.encodeToJSON()
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
