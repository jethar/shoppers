# coding: utf-8

from __future__ import absolute_import
from swagger_server.models.framework_filter import FrameworkFilter
from .base_model_ import Model
from datetime import date, datetime
from typing import List, Dict
from ..util import deserialize_model


class FrameworkSearchFilterGroup(Model):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, filters: List[FrameworkFilter]=None):
        """
        FrameworkSearchFilterGroup - a model defined in Swagger

        :param filters: The filters of this FrameworkSearchFilterGroup.
        :type filters: List[FrameworkFilter]
        """
        self.swagger_types = {
            'filters': List[FrameworkFilter]
        }

        self.attribute_map = {
            'filters': 'filters'
        }

        self._filters = filters

    @classmethod
    def from_dict(cls, dikt) -> 'FrameworkSearchFilterGroup':
        """
        Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The framework-search-filter-group of this FrameworkSearchFilterGroup.
        :rtype: FrameworkSearchFilterGroup
        """
        return deserialize_model(dikt, cls)

    @property
    def filters(self) -> List[FrameworkFilter]:
        """
        Gets the filters of this FrameworkSearchFilterGroup.
        A list of filters in this group

        :return: The filters of this FrameworkSearchFilterGroup.
        :rtype: List[FrameworkFilter]
        """
        return self._filters

    @filters.setter
    def filters(self, filters: List[FrameworkFilter]):
        """
        Sets the filters of this FrameworkSearchFilterGroup.
        A list of filters in this group

        :param filters: The filters of this FrameworkSearchFilterGroup.
        :type filters: List[FrameworkFilter]
        """

        self._filters = filters

