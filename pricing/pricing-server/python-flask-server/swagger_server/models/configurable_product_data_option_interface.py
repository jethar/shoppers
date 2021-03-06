# coding: utf-8

from __future__ import absolute_import
from swagger_server.models.configurable_product_data_option_value_interface import ConfigurableProductDataOptionValueInterface
from .base_model_ import Model
from datetime import date, datetime
from typing import List, Dict
from ..util import deserialize_model


class ConfigurableProductDataOptionInterface(Model):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, id: int=None, attribute_id: str=None, label: str=None, position: int=None, is_use_default: bool=None, values: List[ConfigurableProductDataOptionValueInterface]=None, product_id: int=None):
        """
        ConfigurableProductDataOptionInterface - a model defined in Swagger

        :param id: The id of this ConfigurableProductDataOptionInterface.
        :type id: int
        :param attribute_id: The attribute_id of this ConfigurableProductDataOptionInterface.
        :type attribute_id: str
        :param label: The label of this ConfigurableProductDataOptionInterface.
        :type label: str
        :param position: The position of this ConfigurableProductDataOptionInterface.
        :type position: int
        :param is_use_default: The is_use_default of this ConfigurableProductDataOptionInterface.
        :type is_use_default: bool
        :param values: The values of this ConfigurableProductDataOptionInterface.
        :type values: List[ConfigurableProductDataOptionValueInterface]
        :param product_id: The product_id of this ConfigurableProductDataOptionInterface.
        :type product_id: int
        """
        self.swagger_types = {
            'id': int,
            'attribute_id': str,
            'label': str,
            'position': int,
            'is_use_default': bool,
            'values': List[ConfigurableProductDataOptionValueInterface],
            'product_id': int
        }

        self.attribute_map = {
            'id': 'id',
            'attribute_id': 'attribute_id',
            'label': 'label',
            'position': 'position',
            'is_use_default': 'is_use_default',
            'values': 'values',
            'product_id': 'product_id'
        }

        self._id = id
        self._attribute_id = attribute_id
        self._label = label
        self._position = position
        self._is_use_default = is_use_default
        self._values = values
        self._product_id = product_id

    @classmethod
    def from_dict(cls, dikt) -> 'ConfigurableProductDataOptionInterface':
        """
        Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The configurable-product-data-option-interface of this ConfigurableProductDataOptionInterface.
        :rtype: ConfigurableProductDataOptionInterface
        """
        return deserialize_model(dikt, cls)

    @property
    def id(self) -> int:
        """
        Gets the id of this ConfigurableProductDataOptionInterface.

        :return: The id of this ConfigurableProductDataOptionInterface.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """
        Sets the id of this ConfigurableProductDataOptionInterface.

        :param id: The id of this ConfigurableProductDataOptionInterface.
        :type id: int
        """

        self._id = id

    @property
    def attribute_id(self) -> str:
        """
        Gets the attribute_id of this ConfigurableProductDataOptionInterface.

        :return: The attribute_id of this ConfigurableProductDataOptionInterface.
        :rtype: str
        """
        return self._attribute_id

    @attribute_id.setter
    def attribute_id(self, attribute_id: str):
        """
        Sets the attribute_id of this ConfigurableProductDataOptionInterface.

        :param attribute_id: The attribute_id of this ConfigurableProductDataOptionInterface.
        :type attribute_id: str
        """

        self._attribute_id = attribute_id

    @property
    def label(self) -> str:
        """
        Gets the label of this ConfigurableProductDataOptionInterface.

        :return: The label of this ConfigurableProductDataOptionInterface.
        :rtype: str
        """
        return self._label

    @label.setter
    def label(self, label: str):
        """
        Sets the label of this ConfigurableProductDataOptionInterface.

        :param label: The label of this ConfigurableProductDataOptionInterface.
        :type label: str
        """

        self._label = label

    @property
    def position(self) -> int:
        """
        Gets the position of this ConfigurableProductDataOptionInterface.

        :return: The position of this ConfigurableProductDataOptionInterface.
        :rtype: int
        """
        return self._position

    @position.setter
    def position(self, position: int):
        """
        Sets the position of this ConfigurableProductDataOptionInterface.

        :param position: The position of this ConfigurableProductDataOptionInterface.
        :type position: int
        """

        self._position = position

    @property
    def is_use_default(self) -> bool:
        """
        Gets the is_use_default of this ConfigurableProductDataOptionInterface.

        :return: The is_use_default of this ConfigurableProductDataOptionInterface.
        :rtype: bool
        """
        return self._is_use_default

    @is_use_default.setter
    def is_use_default(self, is_use_default: bool):
        """
        Sets the is_use_default of this ConfigurableProductDataOptionInterface.

        :param is_use_default: The is_use_default of this ConfigurableProductDataOptionInterface.
        :type is_use_default: bool
        """

        self._is_use_default = is_use_default

    @property
    def values(self) -> List[ConfigurableProductDataOptionValueInterface]:
        """
        Gets the values of this ConfigurableProductDataOptionInterface.

        :return: The values of this ConfigurableProductDataOptionInterface.
        :rtype: List[ConfigurableProductDataOptionValueInterface]
        """
        return self._values

    @values.setter
    def values(self, values: List[ConfigurableProductDataOptionValueInterface]):
        """
        Sets the values of this ConfigurableProductDataOptionInterface.

        :param values: The values of this ConfigurableProductDataOptionInterface.
        :type values: List[ConfigurableProductDataOptionValueInterface]
        """

        self._values = values

    @property
    def product_id(self) -> int:
        """
        Gets the product_id of this ConfigurableProductDataOptionInterface.

        :return: The product_id of this ConfigurableProductDataOptionInterface.
        :rtype: int
        """
        return self._product_id

    @product_id.setter
    def product_id(self, product_id: int):
        """
        Sets the product_id of this ConfigurableProductDataOptionInterface.

        :param product_id: The product_id of this ConfigurableProductDataOptionInterface.
        :type product_id: int
        """

        self._product_id = product_id

