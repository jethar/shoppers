# coding: utf-8

from __future__ import absolute_import
from swagger_server.models.framework_search_bucket_interface import FrameworkSearchBucketInterface
from .base_model_ import Model
from datetime import date, datetime
from typing import List, Dict
from ..util import deserialize_model


class FrameworkSearchAggregationInterface(Model):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, buckets: List[FrameworkSearchBucketInterface]=None, bucket_names: List[str]=None):
        """
        FrameworkSearchAggregationInterface - a model defined in Swagger

        :param buckets: The buckets of this FrameworkSearchAggregationInterface.
        :type buckets: List[FrameworkSearchBucketInterface]
        :param bucket_names: The bucket_names of this FrameworkSearchAggregationInterface.
        :type bucket_names: List[str]
        """
        self.swagger_types = {
            'buckets': List[FrameworkSearchBucketInterface],
            'bucket_names': List[str]
        }

        self.attribute_map = {
            'buckets': 'buckets',
            'bucket_names': 'bucket_names'
        }

        self._buckets = buckets
        self._bucket_names = bucket_names

    @classmethod
    def from_dict(cls, dikt) -> 'FrameworkSearchAggregationInterface':
        """
        Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The framework-search-aggregation-interface of this FrameworkSearchAggregationInterface.
        :rtype: FrameworkSearchAggregationInterface
        """
        return deserialize_model(dikt, cls)

    @property
    def buckets(self) -> List[FrameworkSearchBucketInterface]:
        """
        Gets the buckets of this FrameworkSearchAggregationInterface.
        All Document fields

        :return: The buckets of this FrameworkSearchAggregationInterface.
        :rtype: List[FrameworkSearchBucketInterface]
        """
        return self._buckets

    @buckets.setter
    def buckets(self, buckets: List[FrameworkSearchBucketInterface]):
        """
        Sets the buckets of this FrameworkSearchAggregationInterface.
        All Document fields

        :param buckets: The buckets of this FrameworkSearchAggregationInterface.
        :type buckets: List[FrameworkSearchBucketInterface]
        """
        if buckets is None:
            raise ValueError("Invalid value for `buckets`, must not be `None`")

        self._buckets = buckets

    @property
    def bucket_names(self) -> List[str]:
        """
        Gets the bucket_names of this FrameworkSearchAggregationInterface.
        Document field names

        :return: The bucket_names of this FrameworkSearchAggregationInterface.
        :rtype: List[str]
        """
        return self._bucket_names

    @bucket_names.setter
    def bucket_names(self, bucket_names: List[str]):
        """
        Sets the bucket_names of this FrameworkSearchAggregationInterface.
        Document field names

        :param bucket_names: The bucket_names of this FrameworkSearchAggregationInterface.
        :type bucket_names: List[str]
        """
        if bucket_names is None:
            raise ValueError("Invalid value for `bucket_names`, must not be `None`")

        self._bucket_names = bucket_names

