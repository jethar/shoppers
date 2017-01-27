# coding: utf-8

from __future__ import absolute_import
from swagger_server.models.product import Product
from .base_model_ import Model
from datetime import date, datetime
from typing import List, Dict
from ..util import deserialize_model


class Body(Model):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, product: Product=None, save_options: bool=None):
        """
        Body - a model defined in Swagger

        :param product: The product of this Body.
        :type product: Product
        :param save_options: The save_options of this Body.
        :type save_options: bool
        """
        self.swagger_types = {
            'product': Product,
            'save_options': bool
        }

        self.attribute_map = {
            'product': 'product',
            'save_options': 'saveOptions'
        }

        self._product = product
        self._save_options = save_options

    @classmethod
    def from_dict(cls, dikt) -> 'Body':
        """
        Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The body of this Body.
        :rtype: Body
        """
        return deserialize_model(dikt, cls)

    @property
    def product(self) -> Product:
        """
        Gets the product of this Body.

        :return: The product of this Body.
        :rtype: Product
        """
        return self._product

    @product.setter
    def product(self, product: Product):
        """
        Sets the product of this Body.

        :param product: The product of this Body.
        :type product: Product
        """
        if product is None:
            raise ValueError("Invalid value for `product`, must not be `None`")

        self._product = product

    @property
    def save_options(self) -> bool:
        """
        Gets the save_options of this Body.

        :return: The save_options of this Body.
        :rtype: bool
        """
        return self._save_options

    @save_options.setter
    def save_options(self, save_options: bool):
        """
        Sets the save_options of this Body.

        :param save_options: The save_options of this Body.
        :type save_options: bool
        """

        self._save_options = save_options
