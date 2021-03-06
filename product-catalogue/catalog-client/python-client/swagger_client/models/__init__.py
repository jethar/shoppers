# coding: utf-8

"""
    Shoppers OpenAPI

    This is a Shoppers Catalogue server.  [Learn about Swagger](http://swagger.io) or join the IRC channel `#swagger` on irc.freenode.net.  For this sample, you can use the api key `special-key` to test the authorization filters 

    OpenAPI spec version: 1.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

# import models into model package
from .body import Body
from .body_1 import Body1
from .body_2 import Body2
from .bundle_data_link_interface import BundleDataLinkInterface
from .bundle_data_option_interface import BundleDataOptionInterface
from .catalog_data_category_attribute_interface import CatalogDataCategoryAttributeInterface
from .catalog_data_category_tree_interface import CatalogDataCategoryTreeInterface
from .catalog_data_product_attribute_interface import CatalogDataProductAttributeInterface
from .catalog_data_product_attribute_media_gallery_entry_interface import CatalogDataProductAttributeMediaGalleryEntryInterface
from .catalog_data_product_attribute_search_results_interface import CatalogDataProductAttributeSearchResultsInterface
from .catalog_data_product_custom_option_interface import CatalogDataProductCustomOptionInterface
from .catalog_data_product_custom_option_values_interface import CatalogDataProductCustomOptionValuesInterface
from .catalog_data_product_link_interface import CatalogDataProductLinkInterface
from .catalog_data_product_search_results_interface import CatalogDataProductSearchResultsInterface
from .catalog_data_product_tier_price_interface import CatalogDataProductTierPriceInterface
from .catalog_inventory_data_stock_item_interface import CatalogInventoryDataStockItemInterface
from .catalog_inventory_data_stock_status_collection_interface import CatalogInventoryDataStockStatusCollectionInterface
from .catalog_inventory_data_stock_status_interface import CatalogInventoryDataStockStatusInterface
from .catalog_inventory_stock_status_criteria_interface import CatalogInventoryStockStatusCriteriaInterface
from .catalog_product_website_link_interface import CatalogProductWebsiteLinkInterface
from .category import Category
from .configurable_product_data_option_interface import ConfigurableProductDataOptionInterface
from .configurable_product_data_option_value_interface import ConfigurableProductDataOptionValueInterface
from .downloadable_data_file_content_interface import DownloadableDataFileContentInterface
from .downloadable_data_link_interface import DownloadableDataLinkInterface
from .downloadable_data_sample_interface import DownloadableDataSampleInterface
from .eav_data_attribute_frontend_label_interface import EavDataAttributeFrontendLabelInterface
from .eav_data_attribute_option_interface import EavDataAttributeOptionInterface
from .eav_data_attribute_option_label_interface import EavDataAttributeOptionLabelInterface
from .eav_data_attribute_validation_rule_interface import EavDataAttributeValidationRuleInterface
from .error_errors import ErrorErrors
from .error_errors_item import ErrorErrorsItem
from .error_parameters import ErrorParameters
from .error_parameters_item import ErrorParametersItem
from .error_response import ErrorResponse
from .framework_attribute_interface import FrameworkAttributeInterface
from .framework_criteria_interface import FrameworkCriteriaInterface
from .framework_data_image_content_interface import FrameworkDataImageContentInterface
from .framework_filter import FrameworkFilter
from .framework_search_aggregation_interface import FrameworkSearchAggregationInterface
from .framework_search_aggregation_value_interface import FrameworkSearchAggregationValueInterface
from .framework_search_bucket_interface import FrameworkSearchBucketInterface
from .framework_search_criteria_interface import FrameworkSearchCriteriaInterface
from .framework_search_document_interface import FrameworkSearchDocumentInterface
from .framework_search_filter_group import FrameworkSearchFilterGroup
from .framework_search_search_criteria_interface import FrameworkSearchSearchCriteriaInterface
from .framework_search_search_result_interface import FrameworkSearchSearchResultInterface
from .framework_sort_order import FrameworkSortOrder
from .product import Product
from .product_extension_interface import ProductExtensionInterface
