# CatalogDataProductAttributeInterface

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_wysiwyg_enabled** | **bool** | WYSIWYG flag | [optional] 
**is_html_allowed_on_front** | **bool** | The HTML tags are allowed on the frontend | [optional] 
**used_for_sort_by** | **bool** | It is used for sorting in product listing | [optional] 
**is_filterable** | **bool** | It used in layered navigation | [optional] 
**is_filterable_in_search** | **bool** | It is used in search results layered navigation | [optional] 
**is_used_in_grid** | **bool** | It is used in catalog product grid | [optional] 
**is_visible_in_grid** | **bool** | It is visible in catalog product grid | [optional] 
**is_filterable_in_grid** | **bool** | It is filterable in catalog product grid | [optional] 
**position** | **int** | Position | [optional] 
**apply_to** | **list[str]** | Apply to value for the element | [optional] 
**is_searchable** | **str** | The attribute can be used in Quick Search | [optional] 
**is_visible_in_advanced_search** | **str** | The attribute can be used in Advanced Search | [optional] 
**is_comparable** | **str** | The attribute can be compared on the frontend | [optional] 
**is_used_for_promo_rules** | **str** | The attribute can be used for promo rules | [optional] 
**is_visible_on_front** | **str** | The attribute is visible on the frontend | [optional] 
**used_in_product_listing** | **str** | The attribute can be used in product listing | [optional] 
**is_visible** | **bool** | Attribute is visible on frontend. | [optional] 
**scope** | **str** | Attribute scope | [optional] 
**attribute_id** | **int** | Id of the attribute. | [optional] 
**attribute_code** | **str** | Code of the attribute. | 
**frontend_input** | **str** | HTML for input element. | 
**entity_type_id** | **str** | Entity type id | [optional] 
**is_required** | **bool** | Attribute is required. | 
**options** | [**list[EavDataAttributeOptionInterface]**](EavDataAttributeOptionInterface.md) | Options of the attribute (key &#x3D;&gt; value pairs for select) | [optional] 
**is_user_defined** | **bool** | Current attribute has been defined by a user. | [optional] 
**default_frontend_label** | **str** | Frontend label for default store | [optional] 
**frontend_labels** | [**list[EavDataAttributeFrontendLabelInterface]**](EavDataAttributeFrontendLabelInterface.md) | Frontend label for each store | 
**note** | **str** | The note attribute for the element. | [optional] 
**backend_type** | **str** | Backend type. | [optional] 
**backend_model** | **str** | Backend model | [optional] 
**source_model** | **str** | Source model | [optional] 
**default_value** | **str** | Default value for the element. | [optional] 
**is_unique** | **str** | This is a unique attribute | [optional] 
**frontend_class** | **str** | Frontend class of attribute | [optional] 
**validation_rules** | [**list[EavDataAttributeValidationRuleInterface]**](EavDataAttributeValidationRuleInterface.md) | Validation rules. | [optional] 
**custom_attributes** | [**list[FrameworkAttributeInterface]**](FrameworkAttributeInterface.md) | Custom attributes values. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


