# coding: utf-8

from __future__ import absolute_import
from swagger_server.models.catalog_data_product_attribute_media_gallery_entry_interface import CatalogDataProductAttributeMediaGalleryEntryInterface
from swagger_server.models.catalog_data_product_custom_option_interface import CatalogDataProductCustomOptionInterface
from swagger_server.models.catalog_data_product_link_interface import CatalogDataProductLinkInterface
from swagger_server.models.catalog_data_product_tier_price_interface import CatalogDataProductTierPriceInterface
from swagger_server.models.framework_attribute_interface import FrameworkAttributeInterface
from swagger_server.models.product_extension_interface import ProductExtensionInterface
from .base_model_ import Model
from datetime import date, datetime
from typing import List, Dict
from ..util import deserialize_model


class Product(Model):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, id: int=None, sku: str=None, name: str=None, attribute_set_id: int=None, price: float=None, status: int=None, visibility: int=None, type_id: str=None, created_at: str=None, updated_at: str=None, weight: float=None, extension_attributes: ProductExtensionInterface=None, product_links: List[CatalogDataProductLinkInterface]=None, options: List[CatalogDataProductCustomOptionInterface]=None, media_gallery_entries: List[CatalogDataProductAttributeMediaGalleryEntryInterface]=None, tier_prices: List[CatalogDataProductTierPriceInterface]=None, custom_attributes: List[FrameworkAttributeInterface]=None):
        """
        Product - a model defined in Swagger

        :param id: The id of this Product.
        :type id: int
        :param sku: The sku of this Product.
        :type sku: str
        :param name: The name of this Product.
        :type name: str
        :param attribute_set_id: The attribute_set_id of this Product.
        :type attribute_set_id: int
        :param price: The price of this Product.
        :type price: float
        :param status: The status of this Product.
        :type status: int
        :param visibility: The visibility of this Product.
        :type visibility: int
        :param type_id: The type_id of this Product.
        :type type_id: str
        :param created_at: The created_at of this Product.
        :type created_at: str
        :param updated_at: The updated_at of this Product.
        :type updated_at: str
        :param weight: The weight of this Product.
        :type weight: float
        :param extension_attributes: The extension_attributes of this Product.
        :type extension_attributes: ProductExtensionInterface
        :param product_links: The product_links of this Product.
        :type product_links: List[CatalogDataProductLinkInterface]
        :param options: The options of this Product.
        :type options: List[CatalogDataProductCustomOptionInterface]
        :param media_gallery_entries: The media_gallery_entries of this Product.
        :type media_gallery_entries: List[CatalogDataProductAttributeMediaGalleryEntryInterface]
        :param tier_prices: The tier_prices of this Product.
        :type tier_prices: List[CatalogDataProductTierPriceInterface]
        :param custom_attributes: The custom_attributes of this Product.
        :type custom_attributes: List[FrameworkAttributeInterface]
        """
        self.swagger_types = {
            'id': int,
            'sku': str,
            'name': str,
            'attribute_set_id': int,
            'price': float,
            'status': int,
            'visibility': int,
            'type_id': str,
            'created_at': str,
            'updated_at': str,
            'weight': float,
            'extension_attributes': ProductExtensionInterface,
            'product_links': List[CatalogDataProductLinkInterface],
            'options': List[CatalogDataProductCustomOptionInterface],
            'media_gallery_entries': List[CatalogDataProductAttributeMediaGalleryEntryInterface],
            'tier_prices': List[CatalogDataProductTierPriceInterface],
            'custom_attributes': List[FrameworkAttributeInterface]
        }

        self.attribute_map = {
            'id': 'id',
            'sku': 'sku',
            'name': 'name',
            'attribute_set_id': 'attribute_set_id',
            'price': 'price',
            'status': 'status',
            'visibility': 'visibility',
            'type_id': 'type_id',
            'created_at': 'created_at',
            'updated_at': 'updated_at',
            'weight': 'weight',
            'extension_attributes': 'extension_attributes',
            'product_links': 'product_links',
            'options': 'options',
            'media_gallery_entries': 'media_gallery_entries',
            'tier_prices': 'tier_prices',
            'custom_attributes': 'custom_attributes'
        }

        self._id = id
        self._sku = sku
        self._name = name
        self._attribute_set_id = attribute_set_id
        self._price = price
        self._status = status
        self._visibility = visibility
        self._type_id = type_id
        self._created_at = created_at
        self._updated_at = updated_at
        self._weight = weight
        self._extension_attributes = extension_attributes
        self._product_links = product_links
        self._options = options
        self._media_gallery_entries = media_gallery_entries
        self._tier_prices = tier_prices
        self._custom_attributes = custom_attributes

    @classmethod
    def from_dict(cls, dikt) -> 'Product':
        """
        Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The product of this Product.
        :rtype: Product
        """
        return deserialize_model(dikt, cls)

    @property
    def id(self) -> int:
        """
        Gets the id of this Product.
        Id

        :return: The id of this Product.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """
        Sets the id of this Product.
        Id

        :param id: The id of this Product.
        :type id: int
        """

        self._id = id

    @property
    def sku(self) -> str:
        """
        Gets the sku of this Product.
        Sku

        :return: The sku of this Product.
        :rtype: str
        """
        return self._sku

    @sku.setter
    def sku(self, sku: str):
        """
        Sets the sku of this Product.
        Sku

        :param sku: The sku of this Product.
        :type sku: str
        """
        if sku is None:
            raise ValueError("Invalid value for `sku`, must not be `None`")

        self._sku = sku

    @property
    def name(self) -> str:
        """
        Gets the name of this Product.
        Name

        :return: The name of this Product.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """
        Sets the name of this Product.
        Name

        :param name: The name of this Product.
        :type name: str
        """

        self._name = name

    @property
    def attribute_set_id(self) -> int:
        """
        Gets the attribute_set_id of this Product.
        Attribute set id

        :return: The attribute_set_id of this Product.
        :rtype: int
        """
        return self._attribute_set_id

    @attribute_set_id.setter
    def attribute_set_id(self, attribute_set_id: int):
        """
        Sets the attribute_set_id of this Product.
        Attribute set id

        :param attribute_set_id: The attribute_set_id of this Product.
        :type attribute_set_id: int
        """

        self._attribute_set_id = attribute_set_id

    @property
    def price(self) -> float:
        """
        Gets the price of this Product.
        Price

        :return: The price of this Product.
        :rtype: float
        """
        return self._price

    @price.setter
    def price(self, price: float):
        """
        Sets the price of this Product.
        Price

        :param price: The price of this Product.
        :type price: float
        """

        self._price = price

    @property
    def status(self) -> int:
        """
        Gets the status of this Product.
        Status

        :return: The status of this Product.
        :rtype: int
        """
        return self._status

    @status.setter
    def status(self, status: int):
        """
        Sets the status of this Product.
        Status

        :param status: The status of this Product.
        :type status: int
        """

        self._status = status

    @property
    def visibility(self) -> int:
        """
        Gets the visibility of this Product.
        Visibility

        :return: The visibility of this Product.
        :rtype: int
        """
        return self._visibility

    @visibility.setter
    def visibility(self, visibility: int):
        """
        Sets the visibility of this Product.
        Visibility

        :param visibility: The visibility of this Product.
        :type visibility: int
        """

        self._visibility = visibility

    @property
    def type_id(self) -> str:
        """
        Gets the type_id of this Product.
        Type id

        :return: The type_id of this Product.
        :rtype: str
        """
        return self._type_id

    @type_id.setter
    def type_id(self, type_id: str):
        """
        Sets the type_id of this Product.
        Type id

        :param type_id: The type_id of this Product.
        :type type_id: str
        """

        self._type_id = type_id

    @property
    def created_at(self) -> str:
        """
        Gets the created_at of this Product.
        Created date

        :return: The created_at of this Product.
        :rtype: str
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at: str):
        """
        Sets the created_at of this Product.
        Created date

        :param created_at: The created_at of this Product.
        :type created_at: str
        """

        self._created_at = created_at

    @property
    def updated_at(self) -> str:
        """
        Gets the updated_at of this Product.
        Updated date

        :return: The updated_at of this Product.
        :rtype: str
        """
        return self._updated_at

    @updated_at.setter
    def updated_at(self, updated_at: str):
        """
        Sets the updated_at of this Product.
        Updated date

        :param updated_at: The updated_at of this Product.
        :type updated_at: str
        """

        self._updated_at = updated_at

    @property
    def weight(self) -> float:
        """
        Gets the weight of this Product.
        Weight

        :return: The weight of this Product.
        :rtype: float
        """
        return self._weight

    @weight.setter
    def weight(self, weight: float):
        """
        Sets the weight of this Product.
        Weight

        :param weight: The weight of this Product.
        :type weight: float
        """

        self._weight = weight

    @property
    def extension_attributes(self) -> ProductExtensionInterface:
        """
        Gets the extension_attributes of this Product.

        :return: The extension_attributes of this Product.
        :rtype: ProductExtensionInterface
        """
        return self._extension_attributes

    @extension_attributes.setter
    def extension_attributes(self, extension_attributes: ProductExtensionInterface):
        """
        Sets the extension_attributes of this Product.

        :param extension_attributes: The extension_attributes of this Product.
        :type extension_attributes: ProductExtensionInterface
        """

        self._extension_attributes = extension_attributes

    @property
    def product_links(self) -> List[CatalogDataProductLinkInterface]:
        """
        Gets the product_links of this Product.
        Product links info

        :return: The product_links of this Product.
        :rtype: List[CatalogDataProductLinkInterface]
        """
        return self._product_links

    @product_links.setter
    def product_links(self, product_links: List[CatalogDataProductLinkInterface]):
        """
        Sets the product_links of this Product.
        Product links info

        :param product_links: The product_links of this Product.
        :type product_links: List[CatalogDataProductLinkInterface]
        """

        self._product_links = product_links

    @property
    def options(self) -> List[CatalogDataProductCustomOptionInterface]:
        """
        Gets the options of this Product.
        List of product options

        :return: The options of this Product.
        :rtype: List[CatalogDataProductCustomOptionInterface]
        """
        return self._options

    @options.setter
    def options(self, options: List[CatalogDataProductCustomOptionInterface]):
        """
        Sets the options of this Product.
        List of product options

        :param options: The options of this Product.
        :type options: List[CatalogDataProductCustomOptionInterface]
        """

        self._options = options

    @property
    def media_gallery_entries(self) -> List[CatalogDataProductAttributeMediaGalleryEntryInterface]:
        """
        Gets the media_gallery_entries of this Product.
        Media gallery entries

        :return: The media_gallery_entries of this Product.
        :rtype: List[CatalogDataProductAttributeMediaGalleryEntryInterface]
        """
        return self._media_gallery_entries

    @media_gallery_entries.setter
    def media_gallery_entries(self, media_gallery_entries: List[CatalogDataProductAttributeMediaGalleryEntryInterface]):
        """
        Sets the media_gallery_entries of this Product.
        Media gallery entries

        :param media_gallery_entries: The media_gallery_entries of this Product.
        :type media_gallery_entries: List[CatalogDataProductAttributeMediaGalleryEntryInterface]
        """

        self._media_gallery_entries = media_gallery_entries

    @property
    def tier_prices(self) -> List[CatalogDataProductTierPriceInterface]:
        """
        Gets the tier_prices of this Product.
        List of product tier prices

        :return: The tier_prices of this Product.
        :rtype: List[CatalogDataProductTierPriceInterface]
        """
        return self._tier_prices

    @tier_prices.setter
    def tier_prices(self, tier_prices: List[CatalogDataProductTierPriceInterface]):
        """
        Sets the tier_prices of this Product.
        List of product tier prices

        :param tier_prices: The tier_prices of this Product.
        :type tier_prices: List[CatalogDataProductTierPriceInterface]
        """

        self._tier_prices = tier_prices

    @property
    def custom_attributes(self) -> List[FrameworkAttributeInterface]:
        """
        Gets the custom_attributes of this Product.
        Custom attributes values.

        :return: The custom_attributes of this Product.
        :rtype: List[FrameworkAttributeInterface]
        """
        return self._custom_attributes

    @custom_attributes.setter
    def custom_attributes(self, custom_attributes: List[FrameworkAttributeInterface]):
        """
        Sets the custom_attributes of this Product.
        Custom attributes values.

        :param custom_attributes: The custom_attributes of this Product.
        :type custom_attributes: List[FrameworkAttributeInterface]
        """

        self._custom_attributes = custom_attributes

