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


class DownloadableDataFileContentInterface(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, file_data=None, name=None):
        """
        DownloadableDataFileContentInterface - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'file_data': 'str',
            'name': 'str'
        }

        self.attribute_map = {
            'file_data': 'file_data',
            'name': 'name'
        }

        self._file_data = file_data
        self._name = name

    @property
    def file_data(self):
        """
        Gets the file_data of this DownloadableDataFileContentInterface.
        Data (base64 encoded content)

        :return: The file_data of this DownloadableDataFileContentInterface.
        :rtype: str
        """
        return self._file_data

    @file_data.setter
    def file_data(self, file_data):
        """
        Sets the file_data of this DownloadableDataFileContentInterface.
        Data (base64 encoded content)

        :param file_data: The file_data of this DownloadableDataFileContentInterface.
        :type: str
        """
        if file_data is None:
            raise ValueError("Invalid value for `file_data`, must not be `None`")

        self._file_data = file_data

    @property
    def name(self):
        """
        Gets the name of this DownloadableDataFileContentInterface.
        File name

        :return: The name of this DownloadableDataFileContentInterface.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this DownloadableDataFileContentInterface.
        File name

        :param name: The name of this DownloadableDataFileContentInterface.
        :type: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")

        self._name = name

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
