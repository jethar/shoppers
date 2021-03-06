# coding: utf-8

from __future__ import absolute_import
from swagger_server.models.product_custom_option_values_interface import ProductCustomOptionValuesInterface
from .base_model_ import Model
from datetime import date, datetime
from typing import List, Dict
from ..util import deserialize_model


class ProductCustomOptionInterface(Model):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, product_sku: str=None, option_id: int=None, title: str=None, type: str=None, sort_order: int=None, is_require: bool=None, price: float=None, price_type: str=None, sku: str=None, file_extension: str=None, max_characters: int=None, image_size_x: int=None, image_size_y: int=None, values: List[ProductCustomOptionValuesInterface]=None):
        """
        ProductCustomOptionInterface - a model defined in Swagger

        :param product_sku: The product_sku of this ProductCustomOptionInterface.
        :type product_sku: str
        :param option_id: The option_id of this ProductCustomOptionInterface.
        :type option_id: int
        :param title: The title of this ProductCustomOptionInterface.
        :type title: str
        :param type: The type of this ProductCustomOptionInterface.
        :type type: str
        :param sort_order: The sort_order of this ProductCustomOptionInterface.
        :type sort_order: int
        :param is_require: The is_require of this ProductCustomOptionInterface.
        :type is_require: bool
        :param price: The price of this ProductCustomOptionInterface.
        :type price: float
        :param price_type: The price_type of this ProductCustomOptionInterface.
        :type price_type: str
        :param sku: The sku of this ProductCustomOptionInterface.
        :type sku: str
        :param file_extension: The file_extension of this ProductCustomOptionInterface.
        :type file_extension: str
        :param max_characters: The max_characters of this ProductCustomOptionInterface.
        :type max_characters: int
        :param image_size_x: The image_size_x of this ProductCustomOptionInterface.
        :type image_size_x: int
        :param image_size_y: The image_size_y of this ProductCustomOptionInterface.
        :type image_size_y: int
        :param values: The values of this ProductCustomOptionInterface.
        :type values: List[ProductCustomOptionValuesInterface]
        """
        self.swagger_types = {
            'product_sku': str,
            'option_id': int,
            'title': str,
            'type': str,
            'sort_order': int,
            'is_require': bool,
            'price': float,
            'price_type': str,
            'sku': str,
            'file_extension': str,
            'max_characters': int,
            'image_size_x': int,
            'image_size_y': int,
            'values': List[ProductCustomOptionValuesInterface]
        }

        self.attribute_map = {
            'product_sku': 'product_sku',
            'option_id': 'option_id',
            'title': 'title',
            'type': 'type',
            'sort_order': 'sort_order',
            'is_require': 'is_require',
            'price': 'price',
            'price_type': 'price_type',
            'sku': 'sku',
            'file_extension': 'file_extension',
            'max_characters': 'max_characters',
            'image_size_x': 'image_size_x',
            'image_size_y': 'image_size_y',
            'values': 'values'
        }

        self._product_sku = product_sku
        self._option_id = option_id
        self._title = title
        self._type = type
        self._sort_order = sort_order
        self._is_require = is_require
        self._price = price
        self._price_type = price_type
        self._sku = sku
        self._file_extension = file_extension
        self._max_characters = max_characters
        self._image_size_x = image_size_x
        self._image_size_y = image_size_y
        self._values = values

    @classmethod
    def from_dict(cls, dikt) -> 'ProductCustomOptionInterface':
        """
        Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The product-custom-option-interface of this ProductCustomOptionInterface.
        :rtype: ProductCustomOptionInterface
        """
        return deserialize_model(dikt, cls)

    @property
    def product_sku(self) -> str:
        """
        Gets the product_sku of this ProductCustomOptionInterface.
        Product SKU

        :return: The product_sku of this ProductCustomOptionInterface.
        :rtype: str
        """
        return self._product_sku

    @product_sku.setter
    def product_sku(self, product_sku: str):
        """
        Sets the product_sku of this ProductCustomOptionInterface.
        Product SKU

        :param product_sku: The product_sku of this ProductCustomOptionInterface.
        :type product_sku: str
        """
        if product_sku is None:
            raise ValueError("Invalid value for `product_sku`, must not be `None`")

        self._product_sku = product_sku

    @property
    def option_id(self) -> int:
        """
        Gets the option_id of this ProductCustomOptionInterface.
        Option id

        :return: The option_id of this ProductCustomOptionInterface.
        :rtype: int
        """
        return self._option_id

    @option_id.setter
    def option_id(self, option_id: int):
        """
        Sets the option_id of this ProductCustomOptionInterface.
        Option id

        :param option_id: The option_id of this ProductCustomOptionInterface.
        :type option_id: int
        """

        self._option_id = option_id

    @property
    def title(self) -> str:
        """
        Gets the title of this ProductCustomOptionInterface.
        Option title

        :return: The title of this ProductCustomOptionInterface.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """
        Sets the title of this ProductCustomOptionInterface.
        Option title

        :param title: The title of this ProductCustomOptionInterface.
        :type title: str
        """
        if title is None:
            raise ValueError("Invalid value for `title`, must not be `None`")

        self._title = title

    @property
    def type(self) -> str:
        """
        Gets the type of this ProductCustomOptionInterface.
        Option type

        :return: The type of this ProductCustomOptionInterface.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """
        Sets the type of this ProductCustomOptionInterface.
        Option type

        :param type: The type of this ProductCustomOptionInterface.
        :type type: str
        """
        if type is None:
            raise ValueError("Invalid value for `type`, must not be `None`")

        self._type = type

    @property
    def sort_order(self) -> int:
        """
        Gets the sort_order of this ProductCustomOptionInterface.
        Sort order

        :return: The sort_order of this ProductCustomOptionInterface.
        :rtype: int
        """
        return self._sort_order

    @sort_order.setter
    def sort_order(self, sort_order: int):
        """
        Sets the sort_order of this ProductCustomOptionInterface.
        Sort order

        :param sort_order: The sort_order of this ProductCustomOptionInterface.
        :type sort_order: int
        """
        if sort_order is None:
            raise ValueError("Invalid value for `sort_order`, must not be `None`")

        self._sort_order = sort_order

    @property
    def is_require(self) -> bool:
        """
        Gets the is_require of this ProductCustomOptionInterface.
        Is require

        :return: The is_require of this ProductCustomOptionInterface.
        :rtype: bool
        """
        return self._is_require

    @is_require.setter
    def is_require(self, is_require: bool):
        """
        Sets the is_require of this ProductCustomOptionInterface.
        Is require

        :param is_require: The is_require of this ProductCustomOptionInterface.
        :type is_require: bool
        """
        if is_require is None:
            raise ValueError("Invalid value for `is_require`, must not be `None`")

        self._is_require = is_require

    @property
    def price(self) -> float:
        """
        Gets the price of this ProductCustomOptionInterface.
        Price

        :return: The price of this ProductCustomOptionInterface.
        :rtype: float
        """
        return self._price

    @price.setter
    def price(self, price: float):
        """
        Sets the price of this ProductCustomOptionInterface.
        Price

        :param price: The price of this ProductCustomOptionInterface.
        :type price: float
        """

        self._price = price

    @property
    def price_type(self) -> str:
        """
        Gets the price_type of this ProductCustomOptionInterface.
        Price type

        :return: The price_type of this ProductCustomOptionInterface.
        :rtype: str
        """
        return self._price_type

    @price_type.setter
    def price_type(self, price_type: str):
        """
        Sets the price_type of this ProductCustomOptionInterface.
        Price type

        :param price_type: The price_type of this ProductCustomOptionInterface.
        :type price_type: str
        """

        self._price_type = price_type

    @property
    def sku(self) -> str:
        """
        Gets the sku of this ProductCustomOptionInterface.
        Sku

        :return: The sku of this ProductCustomOptionInterface.
        :rtype: str
        """
        return self._sku

    @sku.setter
    def sku(self, sku: str):
        """
        Sets the sku of this ProductCustomOptionInterface.
        Sku

        :param sku: The sku of this ProductCustomOptionInterface.
        :type sku: str
        """

        self._sku = sku

    @property
    def file_extension(self) -> str:
        """
        Gets the file_extension of this ProductCustomOptionInterface.

        :return: The file_extension of this ProductCustomOptionInterface.
        :rtype: str
        """
        return self._file_extension

    @file_extension.setter
    def file_extension(self, file_extension: str):
        """
        Sets the file_extension of this ProductCustomOptionInterface.

        :param file_extension: The file_extension of this ProductCustomOptionInterface.
        :type file_extension: str
        """

        self._file_extension = file_extension

    @property
    def max_characters(self) -> int:
        """
        Gets the max_characters of this ProductCustomOptionInterface.

        :return: The max_characters of this ProductCustomOptionInterface.
        :rtype: int
        """
        return self._max_characters

    @max_characters.setter
    def max_characters(self, max_characters: int):
        """
        Sets the max_characters of this ProductCustomOptionInterface.

        :param max_characters: The max_characters of this ProductCustomOptionInterface.
        :type max_characters: int
        """

        self._max_characters = max_characters

    @property
    def image_size_x(self) -> int:
        """
        Gets the image_size_x of this ProductCustomOptionInterface.

        :return: The image_size_x of this ProductCustomOptionInterface.
        :rtype: int
        """
        return self._image_size_x

    @image_size_x.setter
    def image_size_x(self, image_size_x: int):
        """
        Sets the image_size_x of this ProductCustomOptionInterface.

        :param image_size_x: The image_size_x of this ProductCustomOptionInterface.
        :type image_size_x: int
        """

        self._image_size_x = image_size_x

    @property
    def image_size_y(self) -> int:
        """
        Gets the image_size_y of this ProductCustomOptionInterface.

        :return: The image_size_y of this ProductCustomOptionInterface.
        :rtype: int
        """
        return self._image_size_y

    @image_size_y.setter
    def image_size_y(self, image_size_y: int):
        """
        Sets the image_size_y of this ProductCustomOptionInterface.

        :param image_size_y: The image_size_y of this ProductCustomOptionInterface.
        :type image_size_y: int
        """

        self._image_size_y = image_size_y

    @property
    def values(self) -> List[ProductCustomOptionValuesInterface]:
        """
        Gets the values of this ProductCustomOptionInterface.

        :return: The values of this ProductCustomOptionInterface.
        :rtype: List[ProductCustomOptionValuesInterface]
        """
        return self._values

    @values.setter
    def values(self, values: List[ProductCustomOptionValuesInterface]):
        """
        Sets the values of this ProductCustomOptionInterface.

        :param values: The values of this ProductCustomOptionInterface.
        :type values: List[ProductCustomOptionValuesInterface]
        """

        self._values = values

