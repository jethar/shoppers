# coding: utf-8

from __future__ import absolute_import
from .base_model_ import Model
from datetime import date, datetime
from typing import List, Dict
from ..util import deserialize_model


class EavDataAttributeValidationRuleInterface(Model):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, key: str=None, value: str=None):
        """
        EavDataAttributeValidationRuleInterface - a model defined in Swagger

        :param key: The key of this EavDataAttributeValidationRuleInterface.
        :type key: str
        :param value: The value of this EavDataAttributeValidationRuleInterface.
        :type value: str
        """
        self.swagger_types = {
            'key': str,
            'value': str
        }

        self.attribute_map = {
            'key': 'key',
            'value': 'value'
        }

        self._key = key
        self._value = value

    @classmethod
    def from_dict(cls, dikt) -> 'EavDataAttributeValidationRuleInterface':
        """
        Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The eav-data-attribute-validation-rule-interface of this EavDataAttributeValidationRuleInterface.
        :rtype: EavDataAttributeValidationRuleInterface
        """
        return deserialize_model(dikt, cls)

    @property
    def key(self) -> str:
        """
        Gets the key of this EavDataAttributeValidationRuleInterface.
        Object key

        :return: The key of this EavDataAttributeValidationRuleInterface.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key: str):
        """
        Sets the key of this EavDataAttributeValidationRuleInterface.
        Object key

        :param key: The key of this EavDataAttributeValidationRuleInterface.
        :type key: str
        """
        if key is None:
            raise ValueError("Invalid value for `key`, must not be `None`")

        self._key = key

    @property
    def value(self) -> str:
        """
        Gets the value of this EavDataAttributeValidationRuleInterface.
        Object value

        :return: The value of this EavDataAttributeValidationRuleInterface.
        :rtype: str
        """
        return self._value

    @value.setter
    def value(self, value: str):
        """
        Sets the value of this EavDataAttributeValidationRuleInterface.
        Object value

        :param value: The value of this EavDataAttributeValidationRuleInterface.
        :type value: str
        """
        if value is None:
            raise ValueError("Invalid value for `value`, must not be `None`")

        self._value = value

