# coding: utf-8

"""
    Shoppers OpenAPI

    This is a Shoppers Catalogue server.  [Learn about Swagger](http://swagger.io) or join the IRC channel `#swagger` on irc.freenode.net.  For this sample, you can use the api key `special-key` to test the authorization filters 

    OpenAPI spec version: 1.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

# import models into sdk package
from .models.body import Body
from .models.body_1 import Body1
from .models.body_2 import Body2
from .models.bundle_data_link_interface import BundleDataLinkInterface
from .models.bundle_data_option_interface import BundleDataOptionInterface
from .models.catalog_data_category_attribute_interface import CatalogDataCategoryAttributeInterface
from .models.catalog_data_category_tree_interface import CatalogDataCategoryTreeInterface
from .models.catalog_data_product_attribute_interface import CatalogDataProductAttributeInterface
from .models.catalog_data_product_attribute_media_gallery_entry_interface import CatalogDataProductAttributeMediaGalleryEntryInterface
from .models.catalog_data_product_attribute_search_results_interface import CatalogDataProductAttributeSearchResultsInterface
from .models.catalog_data_product_custom_option_interface import CatalogDataProductCustomOptionInterface
from .models.catalog_data_product_custom_option_values_interface import CatalogDataProductCustomOptionValuesInterface
from .models.catalog_data_product_link_interface import CatalogDataProductLinkInterface
from .models.catalog_data_product_search_results_interface import CatalogDataProductSearchResultsInterface
from .models.catalog_data_product_tier_price_interface import CatalogDataProductTierPriceInterface
from .models.catalog_inventory_data_stock_item_interface import CatalogInventoryDataStockItemInterface
from .models.catalog_inventory_data_stock_status_collection_interface import CatalogInventoryDataStockStatusCollectionInterface
from .models.catalog_inventory_data_stock_status_interface import CatalogInventoryDataStockStatusInterface
from .models.catalog_inventory_stock_status_criteria_interface import CatalogInventoryStockStatusCriteriaInterface
from .models.catalog_product_website_link_interface import CatalogProductWebsiteLinkInterface
from .models.category import Category
from .models.configurable_product_data_option_interface import ConfigurableProductDataOptionInterface
from .models.configurable_product_data_option_value_interface import ConfigurableProductDataOptionValueInterface
from .models.downloadable_data_file_content_interface import DownloadableDataFileContentInterface
from .models.downloadable_data_link_interface import DownloadableDataLinkInterface
from .models.downloadable_data_sample_interface import DownloadableDataSampleInterface
from .models.eav_data_attribute_frontend_label_interface import EavDataAttributeFrontendLabelInterface
from .models.eav_data_attribute_option_interface import EavDataAttributeOptionInterface
from .models.eav_data_attribute_option_label_interface import EavDataAttributeOptionLabelInterface
from .models.eav_data_attribute_validation_rule_interface import EavDataAttributeValidationRuleInterface
from .models.error_errors import ErrorErrors
from .models.error_errors_item import ErrorErrorsItem
from .models.error_parameters import ErrorParameters
from .models.error_parameters_item import ErrorParametersItem
from .models.error_response import ErrorResponse
from .models.framework_attribute_interface import FrameworkAttributeInterface
from .models.framework_criteria_interface import FrameworkCriteriaInterface
from .models.framework_data_image_content_interface import FrameworkDataImageContentInterface
from .models.framework_filter import FrameworkFilter
from .models.framework_search_aggregation_interface import FrameworkSearchAggregationInterface
from .models.framework_search_aggregation_value_interface import FrameworkSearchAggregationValueInterface
from .models.framework_search_bucket_interface import FrameworkSearchBucketInterface
from .models.framework_search_criteria_interface import FrameworkSearchCriteriaInterface
from .models.framework_search_document_interface import FrameworkSearchDocumentInterface
from .models.framework_search_filter_group import FrameworkSearchFilterGroup
from .models.framework_search_search_criteria_interface import FrameworkSearchSearchCriteriaInterface
from .models.framework_search_search_result_interface import FrameworkSearchSearchResultInterface
from .models.framework_sort_order import FrameworkSortOrder
from .models.product import Product
from .models.product_extension_interface import ProductExtensionInterface

# import apis into sdk package
from .apis.catalog_product_website_link_repository_v1_api import CatalogProductWebsiteLinkRepositoryV1Api
from .apis.product_api import ProductApi

# import ApiClient
from .api_client import ApiClient

from .configuration import Configuration

configuration = Configuration()