# coding: utf-8

"""
    Shoppers OpenAPI

    This is a Shoppers Catalogue server.  [Learn about Swagger](http://swagger.io) or join the IRC channel `#swagger` on irc.freenode.net.  For this sample, you can use the api key `special-key` to test the authorization filters 

    OpenAPI spec version: 1.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import os
import sys
import unittest

import swagger_client
from swagger_client.rest import ApiException
from swagger_client.models.catalog_data_product_custom_option_interface import CatalogDataProductCustomOptionInterface


class TestCatalogDataProductCustomOptionInterface(unittest.TestCase):
    """ CatalogDataProductCustomOptionInterface unit test stubs """

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testCatalogDataProductCustomOptionInterface(self):
        """
        Test CatalogDataProductCustomOptionInterface
        """
        model = swagger_client.models.catalog_data_product_custom_option_interface.CatalogDataProductCustomOptionInterface()


if __name__ == '__main__':
    unittest.main()
