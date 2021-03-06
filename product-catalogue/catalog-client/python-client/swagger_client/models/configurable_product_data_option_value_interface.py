# coding: utf-8

"""
    Shoppers OpenAPI

    This is a Shoppers Catalogue server.  [Learn about Swagger](http://swagger.io) or join the IRC channel `#swagger` on irc.freenode.net.  For this sample, you can use the api key `special-key` to test the authorization filters 

    OpenAPI spec version: 1.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from pprint import pformat
from six import iteritems
import re


class ConfigurableProductDataOptionValueInterface(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, value_index=None):
        """
        ConfigurableProductDataOptionValueInterface - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'value_index': 'int'
        }

        self.attribute_map = {
            'value_index': 'value_index'
        }

        self._value_index = value_index

    @property
    def value_index(self):
        """
        Gets the value_index of this ConfigurableProductDataOptionValueInterface.

        :return: The value_index of this ConfigurableProductDataOptionValueInterface.
        :rtype: int
        """
        return self._value_index

    @value_index.setter
    def value_index(self, value_index):
        """
        Sets the value_index of this ConfigurableProductDataOptionValueInterface.

        :param value_index: The value_index of this ConfigurableProductDataOptionValueInterface.
        :type: int
        """
        if value_index is None:
            raise ValueError("Invalid value for `value_index`, must not be `None`")

        self._value_index = value_index

    def to_dict(self):
        """
        Returns the model properties as a dict
        """
        result = {}

        for attr, _ in iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """
        Returns the string representation of the model
        """
        return pformat(self.to_dict())

    def __repr__(self):
        """
        For `print` and `pprint`
        """
        return self.to_str()

    def __eq__(self, other):
        """
        Returns true if both objects are equal
        """
        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other
