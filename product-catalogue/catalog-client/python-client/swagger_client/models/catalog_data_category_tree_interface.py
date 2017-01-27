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


class CatalogDataCategoryTreeInterface(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, id=None, parent_id=None, name=None, is_active=None, position=None, level=None, product_count=None, children_data=None):
        """
        CatalogDataCategoryTreeInterface - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'id': 'int',
            'parent_id': 'int',
            'name': 'str',
            'is_active': 'bool',
            'position': 'int',
            'level': 'int',
            'product_count': 'int',
            'children_data': 'list[CatalogDataCategoryTreeInterface]'
        }

        self.attribute_map = {
            'id': 'id',
            'parent_id': 'parent_id',
            'name': 'name',
            'is_active': 'is_active',
            'position': 'position',
            'level': 'level',
            'product_count': 'product_count',
            'children_data': 'children_data'
        }

        self._id = id
        self._parent_id = parent_id
        self._name = name
        self._is_active = is_active
        self._position = position
        self._level = level
        self._product_count = product_count
        self._children_data = children_data

    @property
    def id(self):
        """
        Gets the id of this CatalogDataCategoryTreeInterface.

        :return: The id of this CatalogDataCategoryTreeInterface.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this CatalogDataCategoryTreeInterface.

        :param id: The id of this CatalogDataCategoryTreeInterface.
        :type: int
        """

        self._id = id

    @property
    def parent_id(self):
        """
        Gets the parent_id of this CatalogDataCategoryTreeInterface.
        Parent category ID

        :return: The parent_id of this CatalogDataCategoryTreeInterface.
        :rtype: int
        """
        return self._parent_id

    @parent_id.setter
    def parent_id(self, parent_id):
        """
        Sets the parent_id of this CatalogDataCategoryTreeInterface.
        Parent category ID

        :param parent_id: The parent_id of this CatalogDataCategoryTreeInterface.
        :type: int
        """
        if parent_id is None:
            raise ValueError("Invalid value for `parent_id`, must not be `None`")

        self._parent_id = parent_id

    @property
    def name(self):
        """
        Gets the name of this CatalogDataCategoryTreeInterface.
        Category name

        :return: The name of this CatalogDataCategoryTreeInterface.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this CatalogDataCategoryTreeInterface.
        Category name

        :param name: The name of this CatalogDataCategoryTreeInterface.
        :type: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")

        self._name = name

    @property
    def is_active(self):
        """
        Gets the is_active of this CatalogDataCategoryTreeInterface.
        Whether category is active

        :return: The is_active of this CatalogDataCategoryTreeInterface.
        :rtype: bool
        """
        return self._is_active

    @is_active.setter
    def is_active(self, is_active):
        """
        Sets the is_active of this CatalogDataCategoryTreeInterface.
        Whether category is active

        :param is_active: The is_active of this CatalogDataCategoryTreeInterface.
        :type: bool
        """
        if is_active is None:
            raise ValueError("Invalid value for `is_active`, must not be `None`")

        self._is_active = is_active

    @property
    def position(self):
        """
        Gets the position of this CatalogDataCategoryTreeInterface.
        Category position

        :return: The position of this CatalogDataCategoryTreeInterface.
        :rtype: int
        """
        return self._position

    @position.setter
    def position(self, position):
        """
        Sets the position of this CatalogDataCategoryTreeInterface.
        Category position

        :param position: The position of this CatalogDataCategoryTreeInterface.
        :type: int
        """
        if position is None:
            raise ValueError("Invalid value for `position`, must not be `None`")

        self._position = position

    @property
    def level(self):
        """
        Gets the level of this CatalogDataCategoryTreeInterface.
        Category level

        :return: The level of this CatalogDataCategoryTreeInterface.
        :rtype: int
        """
        return self._level

    @level.setter
    def level(self, level):
        """
        Sets the level of this CatalogDataCategoryTreeInterface.
        Category level

        :param level: The level of this CatalogDataCategoryTreeInterface.
        :type: int
        """
        if level is None:
            raise ValueError("Invalid value for `level`, must not be `None`")

        self._level = level

    @property
    def product_count(self):
        """
        Gets the product_count of this CatalogDataCategoryTreeInterface.
        Product count

        :return: The product_count of this CatalogDataCategoryTreeInterface.
        :rtype: int
        """
        return self._product_count

    @product_count.setter
    def product_count(self, product_count):
        """
        Sets the product_count of this CatalogDataCategoryTreeInterface.
        Product count

        :param product_count: The product_count of this CatalogDataCategoryTreeInterface.
        :type: int
        """
        if product_count is None:
            raise ValueError("Invalid value for `product_count`, must not be `None`")

        self._product_count = product_count

    @property
    def children_data(self):
        """
        Gets the children_data of this CatalogDataCategoryTreeInterface.

        :return: The children_data of this CatalogDataCategoryTreeInterface.
        :rtype: list[CatalogDataCategoryTreeInterface]
        """
        return self._children_data

    @children_data.setter
    def children_data(self, children_data):
        """
        Sets the children_data of this CatalogDataCategoryTreeInterface.

        :param children_data: The children_data of this CatalogDataCategoryTreeInterface.
        :type: list[CatalogDataCategoryTreeInterface]
        """
        if children_data is None:
            raise ValueError("Invalid value for `children_data`, must not be `None`")

        self._children_data = children_data

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