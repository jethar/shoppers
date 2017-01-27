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


class FrameworkCriteriaInterface(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, mapper_interface_name=None, criteria_list=None, filters=None, orders=None, limit=None):
        """
        FrameworkCriteriaInterface - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'mapper_interface_name': 'str',
            'criteria_list': 'list[FrameworkCriteriaInterface]',
            'filters': 'list[str]',
            'orders': 'list[str]',
            'limit': 'list[str]'
        }

        self.attribute_map = {
            'mapper_interface_name': 'mapper_interface_name',
            'criteria_list': 'criteria_list',
            'filters': 'filters',
            'orders': 'orders',
            'limit': 'limit'
        }

        self._mapper_interface_name = mapper_interface_name
        self._criteria_list = criteria_list
        self._filters = filters
        self._orders = orders
        self._limit = limit

    @property
    def mapper_interface_name(self):
        """
        Gets the mapper_interface_name of this FrameworkCriteriaInterface.
        Associated Mapper Interface name

        :return: The mapper_interface_name of this FrameworkCriteriaInterface.
        :rtype: str
        """
        return self._mapper_interface_name

    @mapper_interface_name.setter
    def mapper_interface_name(self, mapper_interface_name):
        """
        Sets the mapper_interface_name of this FrameworkCriteriaInterface.
        Associated Mapper Interface name

        :param mapper_interface_name: The mapper_interface_name of this FrameworkCriteriaInterface.
        :type: str
        """
        if mapper_interface_name is None:
            raise ValueError("Invalid value for `mapper_interface_name`, must not be `None`")

        self._mapper_interface_name = mapper_interface_name

    @property
    def criteria_list(self):
        """
        Gets the criteria_list of this FrameworkCriteriaInterface.
        Criteria objects added to current Composite Criteria

        :return: The criteria_list of this FrameworkCriteriaInterface.
        :rtype: list[FrameworkCriteriaInterface]
        """
        return self._criteria_list

    @criteria_list.setter
    def criteria_list(self, criteria_list):
        """
        Sets the criteria_list of this FrameworkCriteriaInterface.
        Criteria objects added to current Composite Criteria

        :param criteria_list: The criteria_list of this FrameworkCriteriaInterface.
        :type: list[FrameworkCriteriaInterface]
        """
        if criteria_list is None:
            raise ValueError("Invalid value for `criteria_list`, must not be `None`")

        self._criteria_list = criteria_list

    @property
    def filters(self):
        """
        Gets the filters of this FrameworkCriteriaInterface.
        List of filters

        :return: The filters of this FrameworkCriteriaInterface.
        :rtype: list[str]
        """
        return self._filters

    @filters.setter
    def filters(self, filters):
        """
        Sets the filters of this FrameworkCriteriaInterface.
        List of filters

        :param filters: The filters of this FrameworkCriteriaInterface.
        :type: list[str]
        """
        if filters is None:
            raise ValueError("Invalid value for `filters`, must not be `None`")

        self._filters = filters

    @property
    def orders(self):
        """
        Gets the orders of this FrameworkCriteriaInterface.
        Ordering criteria

        :return: The orders of this FrameworkCriteriaInterface.
        :rtype: list[str]
        """
        return self._orders

    @orders.setter
    def orders(self, orders):
        """
        Sets the orders of this FrameworkCriteriaInterface.
        Ordering criteria

        :param orders: The orders of this FrameworkCriteriaInterface.
        :type: list[str]
        """
        if orders is None:
            raise ValueError("Invalid value for `orders`, must not be `None`")

        self._orders = orders

    @property
    def limit(self):
        """
        Gets the limit of this FrameworkCriteriaInterface.
        Limit

        :return: The limit of this FrameworkCriteriaInterface.
        :rtype: list[str]
        """
        return self._limit

    @limit.setter
    def limit(self, limit):
        """
        Sets the limit of this FrameworkCriteriaInterface.
        Limit

        :param limit: The limit of this FrameworkCriteriaInterface.
        :type: list[str]
        """
        if limit is None:
            raise ValueError("Invalid value for `limit`, must not be `None`")

        self._limit = limit

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
