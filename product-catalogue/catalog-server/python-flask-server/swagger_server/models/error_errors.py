# coding: utf-8

from __future__ import absolute_import
from swagger_server.models.error_errors_item import ErrorErrorsItem
from .base_model_ import Model
from datetime import date, datetime
from typing import List, Dict
from ..util import deserialize_model


class ErrorErrors(Model):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self):
        """
        ErrorErrors - a model defined in Swagger

        """
        self.swagger_types = {
            
        }

        self.attribute_map = {
            
        }


    @classmethod
    def from_dict(cls, dikt) -> 'ErrorErrors':
        """
        Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The error-errors of this ErrorErrors.
        :rtype: ErrorErrors
        """
        return deserialize_model(dikt, cls)
