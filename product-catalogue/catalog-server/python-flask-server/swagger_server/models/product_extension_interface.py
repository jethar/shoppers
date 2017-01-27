# coding: utf-8

from __future__ import absolute_import
from swagger_server.models.bundle_data_option_interface import BundleDataOptionInterface
from swagger_server.models.catalog_inventory_data_stock_item_interface import CatalogInventoryDataStockItemInterface
from swagger_server.models.configurable_product_data_option_interface import ConfigurableProductDataOptionInterface
from swagger_server.models.downloadable_data_link_interface import DownloadableDataLinkInterface
from swagger_server.models.downloadable_data_sample_interface import DownloadableDataSampleInterface
from .base_model_ import Model
from datetime import date, datetime
from typing import List, Dict
from ..util import deserialize_model


class ProductExtensionInterface(Model):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, stock_item: CatalogInventoryDataStockItemInterface=None, bundle_product_options: List[BundleDataOptionInterface]=None, downloadable_product_links: List[DownloadableDataLinkInterface]=None, downloadable_product_samples: List[DownloadableDataSampleInterface]=None, configurable_product_options: List[ConfigurableProductDataOptionInterface]=None, configurable_product_links: List[int]=None):
        """
        ProductExtensionInterface - a model defined in Swagger

        :param stock_item: The stock_item of this ProductExtensionInterface.
        :type stock_item: CatalogInventoryDataStockItemInterface
        :param bundle_product_options: The bundle_product_options of this ProductExtensionInterface.
        :type bundle_product_options: List[BundleDataOptionInterface]
        :param downloadable_product_links: The downloadable_product_links of this ProductExtensionInterface.
        :type downloadable_product_links: List[DownloadableDataLinkInterface]
        :param downloadable_product_samples: The downloadable_product_samples of this ProductExtensionInterface.
        :type downloadable_product_samples: List[DownloadableDataSampleInterface]
        :param configurable_product_options: The configurable_product_options of this ProductExtensionInterface.
        :type configurable_product_options: List[ConfigurableProductDataOptionInterface]
        :param configurable_product_links: The configurable_product_links of this ProductExtensionInterface.
        :type configurable_product_links: List[int]
        """
        self.swagger_types = {
            'stock_item': CatalogInventoryDataStockItemInterface,
            'bundle_product_options': List[BundleDataOptionInterface],
            'downloadable_product_links': List[DownloadableDataLinkInterface],
            'downloadable_product_samples': List[DownloadableDataSampleInterface],
            'configurable_product_options': List[ConfigurableProductDataOptionInterface],
            'configurable_product_links': List[int]
        }

        self.attribute_map = {
            'stock_item': 'stock_item',
            'bundle_product_options': 'bundle_product_options',
            'downloadable_product_links': 'downloadable_product_links',
            'downloadable_product_samples': 'downloadable_product_samples',
            'configurable_product_options': 'configurable_product_options',
            'configurable_product_links': 'configurable_product_links'
        }

        self._stock_item = stock_item
        self._bundle_product_options = bundle_product_options
        self._downloadable_product_links = downloadable_product_links
        self._downloadable_product_samples = downloadable_product_samples
        self._configurable_product_options = configurable_product_options
        self._configurable_product_links = configurable_product_links

    @classmethod
    def from_dict(cls, dikt) -> 'ProductExtensionInterface':
        """
        Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The product-extension-interface of this ProductExtensionInterface.
        :rtype: ProductExtensionInterface
        """
        return deserialize_model(dikt, cls)

    @property
    def stock_item(self) -> CatalogInventoryDataStockItemInterface:
        """
        Gets the stock_item of this ProductExtensionInterface.

        :return: The stock_item of this ProductExtensionInterface.
        :rtype: CatalogInventoryDataStockItemInterface
        """
        return self._stock_item

    @stock_item.setter
    def stock_item(self, stock_item: CatalogInventoryDataStockItemInterface):
        """
        Sets the stock_item of this ProductExtensionInterface.

        :param stock_item: The stock_item of this ProductExtensionInterface.
        :type stock_item: CatalogInventoryDataStockItemInterface
        """

        self._stock_item = stock_item

    @property
    def bundle_product_options(self) -> List[BundleDataOptionInterface]:
        """
        Gets the bundle_product_options of this ProductExtensionInterface.

        :return: The bundle_product_options of this ProductExtensionInterface.
        :rtype: List[BundleDataOptionInterface]
        """
        return self._bundle_product_options

    @bundle_product_options.setter
    def bundle_product_options(self, bundle_product_options: List[BundleDataOptionInterface]):
        """
        Sets the bundle_product_options of this ProductExtensionInterface.

        :param bundle_product_options: The bundle_product_options of this ProductExtensionInterface.
        :type bundle_product_options: List[BundleDataOptionInterface]
        """

        self._bundle_product_options = bundle_product_options

    @property
    def downloadable_product_links(self) -> List[DownloadableDataLinkInterface]:
        """
        Gets the downloadable_product_links of this ProductExtensionInterface.

        :return: The downloadable_product_links of this ProductExtensionInterface.
        :rtype: List[DownloadableDataLinkInterface]
        """
        return self._downloadable_product_links

    @downloadable_product_links.setter
    def downloadable_product_links(self, downloadable_product_links: List[DownloadableDataLinkInterface]):
        """
        Sets the downloadable_product_links of this ProductExtensionInterface.

        :param downloadable_product_links: The downloadable_product_links of this ProductExtensionInterface.
        :type downloadable_product_links: List[DownloadableDataLinkInterface]
        """

        self._downloadable_product_links = downloadable_product_links

    @property
    def downloadable_product_samples(self) -> List[DownloadableDataSampleInterface]:
        """
        Gets the downloadable_product_samples of this ProductExtensionInterface.

        :return: The downloadable_product_samples of this ProductExtensionInterface.
        :rtype: List[DownloadableDataSampleInterface]
        """
        return self._downloadable_product_samples

    @downloadable_product_samples.setter
    def downloadable_product_samples(self, downloadable_product_samples: List[DownloadableDataSampleInterface]):
        """
        Sets the downloadable_product_samples of this ProductExtensionInterface.

        :param downloadable_product_samples: The downloadable_product_samples of this ProductExtensionInterface.
        :type downloadable_product_samples: List[DownloadableDataSampleInterface]
        """

        self._downloadable_product_samples = downloadable_product_samples

    @property
    def configurable_product_options(self) -> List[ConfigurableProductDataOptionInterface]:
        """
        Gets the configurable_product_options of this ProductExtensionInterface.

        :return: The configurable_product_options of this ProductExtensionInterface.
        :rtype: List[ConfigurableProductDataOptionInterface]
        """
        return self._configurable_product_options

    @configurable_product_options.setter
    def configurable_product_options(self, configurable_product_options: List[ConfigurableProductDataOptionInterface]):
        """
        Sets the configurable_product_options of this ProductExtensionInterface.

        :param configurable_product_options: The configurable_product_options of this ProductExtensionInterface.
        :type configurable_product_options: List[ConfigurableProductDataOptionInterface]
        """

        self._configurable_product_options = configurable_product_options

    @property
    def configurable_product_links(self) -> List[int]:
        """
        Gets the configurable_product_links of this ProductExtensionInterface.

        :return: The configurable_product_links of this ProductExtensionInterface.
        :rtype: List[int]
        """
        return self._configurable_product_links

    @configurable_product_links.setter
    def configurable_product_links(self, configurable_product_links: List[int]):
        """
        Sets the configurable_product_links of this ProductExtensionInterface.

        :param configurable_product_links: The configurable_product_links of this ProductExtensionInterface.
        :type configurable_product_links: List[int]
        """

        self._configurable_product_links = configurable_product_links

