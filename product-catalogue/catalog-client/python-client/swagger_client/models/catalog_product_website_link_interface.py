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


class CatalogProductWebsiteLinkInterface(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, sku=None, website_id=None):
        """
        CatalogProductWebsiteLinkInterface - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'sku': 'str',
            'website_id': 'int'
        }

        self.attribute_map = {
            'sku': 'sku',
            'website_id': 'website_id'
        }

        self._sku = sku
        self._website_id = website_id

    @property
    def sku(self):
        """
        Gets the sku of this CatalogProductWebsiteLinkInterface.

        :return: The sku of this CatalogProductWebsiteLinkInterface.
        :rtype: str
        """
        return self._sku

    @sku.setter
    def sku(self, sku):
        """
        Sets the sku of this CatalogProductWebsiteLinkInterface.

        :param sku: The sku of this CatalogProductWebsiteLinkInterface.
        :type: str
        """
        if sku is None:
            raise ValueError("Invalid value for `sku`, must not be `None`")

        self._sku = sku

    @property
    def website_id(self):
        """
        Gets the website_id of this CatalogProductWebsiteLinkInterface.
        Website ids

        :return: The website_id of this CatalogProductWebsiteLinkInterface.
        :rtype: int
        """
        return self._website_id

    @website_id.setter
    def website_id(self, website_id):
        """
        Sets the website_id of this CatalogProductWebsiteLinkInterface.
        Website ids

        :param website_id: The website_id of this CatalogProductWebsiteLinkInterface.
        :type: int
        """
        if website_id is None:
            raise ValueError("Invalid value for `website_id`, must not be `None`")

        self._website_id = website_id

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
