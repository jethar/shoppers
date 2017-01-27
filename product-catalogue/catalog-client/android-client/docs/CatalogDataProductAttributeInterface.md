
# CatalogDataProductAttributeInterface

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isWysiwygEnabled** | **Boolean** | WYSIWYG flag |  [optional]
**isHtmlAllowedOnFront** | **Boolean** | The HTML tags are allowed on the frontend |  [optional]
**usedForSortBy** | **Boolean** | It is used for sorting in product listing |  [optional]
**isFilterable** | **Boolean** | It used in layered navigation |  [optional]
**isFilterableInSearch** | **Boolean** | It is used in search results layered navigation |  [optional]
**isUsedInGrid** | **Boolean** | It is used in catalog product grid |  [optional]
**isVisibleInGrid** | **Boolean** | It is visible in catalog product grid |  [optional]
**isFilterableInGrid** | **Boolean** | It is filterable in catalog product grid |  [optional]
**position** | **Integer** | Position |  [optional]
**applyTo** | **List&lt;String&gt;** | Apply to value for the element |  [optional]
**isSearchable** | **String** | The attribute can be used in Quick Search |  [optional]
**isVisibleInAdvancedSearch** | **String** | The attribute can be used in Advanced Search |  [optional]
**isComparable** | **String** | The attribute can be compared on the frontend |  [optional]
**isUsedForPromoRules** | **String** | The attribute can be used for promo rules |  [optional]
**isVisibleOnFront** | **String** | The attribute is visible on the frontend |  [optional]
**usedInProductListing** | **String** | The attribute can be used in product listing |  [optional]
**isVisible** | **Boolean** | Attribute is visible on frontend. |  [optional]
**scope** | **String** | Attribute scope |  [optional]
**attributeId** | **Integer** | Id of the attribute. |  [optional]
**attributeCode** | **String** | Code of the attribute. | 
**frontendInput** | **String** | HTML for input element. | 
**entityTypeId** | **String** | Entity type id |  [optional]
**isRequired** | **Boolean** | Attribute is required. | 
**options** | [**List&lt;EavDataAttributeOptionInterface&gt;**](EavDataAttributeOptionInterface.md) | Options of the attribute (key &#x3D;&gt; value pairs for select) |  [optional]
**isUserDefined** | **Boolean** | Current attribute has been defined by a user. |  [optional]
**defaultFrontendLabel** | **String** | Frontend label for default store |  [optional]
**frontendLabels** | [**List&lt;EavDataAttributeFrontendLabelInterface&gt;**](EavDataAttributeFrontendLabelInterface.md) | Frontend label for each store | 
**note** | **String** | The note attribute for the element. |  [optional]
**backendType** | **String** | Backend type. |  [optional]
**backendModel** | **String** | Backend model |  [optional]
**sourceModel** | **String** | Source model |  [optional]
**defaultValue** | **String** | Default value for the element. |  [optional]
**isUnique** | **String** | This is a unique attribute |  [optional]
**frontendClass** | **String** | Frontend class of attribute |  [optional]
**validationRules** | [**List&lt;EavDataAttributeValidationRuleInterface&gt;**](EavDataAttributeValidationRuleInterface.md) | Validation rules. |  [optional]
**customAttributes** | [**List&lt;FrameworkAttributeInterface&gt;**](FrameworkAttributeInterface.md) | Custom attributes values. |  [optional]



