# coding: utf-8

from __future__ import absolute_import
from .base_model_ import Model
from datetime import date, datetime
from typing import List, Dict
from ..util import deserialize_model


class ConfigurableProductDataOptionValueInterface(Model):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, value_index: int=None):
        """
        ConfigurableProductDataOptionValueInterface - a model defined in Swagger

        :param value_index: The value_index of this ConfigurableProductDataOptionValueInterface.
        :type value_index: int
        """
        self.swagger_types = {
            'value_index': int
        }

        self.attribute_map = {
            'value_index': 'value_index'
        }

        self._value_index = value_index

    @classmethod
    def from_dict(cls, dikt) -> 'ConfigurableProductDataOptionValueInterface':
        """
        Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The configurable-product-data-option-value-interface of this ConfigurableProductDataOptionValueInterface.
        :rtype: ConfigurableProductDataOptionValueInterface
        """
        return deserialize_model(dikt, cls)

    @property
    def value_index(self) -> int:
        """
        Gets the value_index of this ConfigurableProductDataOptionValueInterface.

        :return: The value_index of this ConfigurableProductDataOptionValueInterface.
        :rtype: int
        """
        return self._value_index

    @value_index.setter
    def value_index(self, value_index: int):
        """
        Sets the value_index of this ConfigurableProductDataOptionValueInterface.

        :param value_index: The value_index of this ConfigurableProductDataOptionValueInterface.
        :type value_index: int
        """
        if value_index is None:
            raise ValueError("Invalid value for `value_index`, must not be `None`")

        self._value_index = value_index

