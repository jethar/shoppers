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
from swagger_client.models.catalog_inventory_data_stock_item_interface import CatalogInventoryDataStockItemInterface


class TestCatalogInventoryDataStockItemInterface(unittest.TestCase):
    """ CatalogInventoryDataStockItemInterface unit test stubs """

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testCatalogInventoryDataStockItemInterface(self):
        """
        Test CatalogInventoryDataStockItemInterface
        """
        model = swagger_client.models.catalog_inventory_data_stock_item_interface.CatalogInventoryDataStockItemInterface()


if __name__ == '__main__':
    unittest.main()
