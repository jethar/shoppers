# coding: utf-8

from __future__ import absolute_import
from .base_model_ import Model
from datetime import date, datetime
from typing import List, Dict
from ..util import deserialize_model


class DownloadableDataFileContentInterface(Model):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, file_data: str=None, name: str=None):
        """
        DownloadableDataFileContentInterface - a model defined in Swagger

        :param file_data: The file_data of this DownloadableDataFileContentInterface.
        :type file_data: str
        :param name: The name of this DownloadableDataFileContentInterface.
        :type name: str
        """
        self.swagger_types = {
            'file_data': str,
            'name': str
        }

        self.attribute_map = {
            'file_data': 'file_data',
            'name': 'name'
        }

        self._file_data = file_data
        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'DownloadableDataFileContentInterface':
        """
        Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The downloadable-data-file-content-interface of this DownloadableDataFileContentInterface.
        :rtype: DownloadableDataFileContentInterface
        """
        return deserialize_model(dikt, cls)

    @property
    def file_data(self) -> str:
        """
        Gets the file_data of this DownloadableDataFileContentInterface.
        Data (base64 encoded content)

        :return: The file_data of this DownloadableDataFileContentInterface.
        :rtype: str
        """
        return self._file_data

    @file_data.setter
    def file_data(self, file_data: str):
        """
        Sets the file_data of this DownloadableDataFileContentInterface.
        Data (base64 encoded content)

        :param file_data: The file_data of this DownloadableDataFileContentInterface.
        :type file_data: str
        """
        if file_data is None:
            raise ValueError("Invalid value for `file_data`, must not be `None`")

        self._file_data = file_data

    @property
    def name(self) -> str:
        """
        Gets the name of this DownloadableDataFileContentInterface.
        File name

        :return: The name of this DownloadableDataFileContentInterface.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """
        Sets the name of this DownloadableDataFileContentInterface.
        File name

        :param name: The name of this DownloadableDataFileContentInterface.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")

        self._name = name

