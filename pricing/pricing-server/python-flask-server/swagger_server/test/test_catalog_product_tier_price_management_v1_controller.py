# coding: utf-8

from __future__ import absolute_import

from swagger_server.models.error_response import ErrorResponse
from swagger_server.models.product_tier_price_interface import ProductTierPriceInterface
from . import BaseTestCase
from six import BytesIO
from flask import json


class TestCatalogProductTierPriceManagementV1Controller(BaseTestCase):
    """ CatalogProductTierPriceManagementV1Controller integration test stubs """

    def test_catalog_product_tier_price_management_v1_add_post(self):
        """
        Test case for catalog_product_tier_price_management_v1_add_post

        
        """
        response = self.client.open('/v2/v1/products/{sku}/group-prices/{customerGroupId}/tiers/{qty}/price/{price}'.format(sku='sku_example', customerGroupId='customerGroupId_example', price=3.4, qty=3.4),
                                    method='POST')
        self.assert200(response, "Response body is : " + response.data.decode('utf-8'))

    def test_catalog_product_tier_price_management_v1_get_list_get(self):
        """
        Test case for catalog_product_tier_price_management_v1_get_list_get

        
        """
        response = self.client.open('/v2/v1/products/{sku}/group-prices/{customerGroupId}/tiers'.format(sku='sku_example', customerGroupId='customerGroupId_example'),
                                    method='GET')
        self.assert200(response, "Response body is : " + response.data.decode('utf-8'))

    def test_catalog_product_tier_price_management_v1_remove_delete(self):
        """
        Test case for catalog_product_tier_price_management_v1_remove_delete

        
        """
        response = self.client.open('/v2/v1/products/{sku}/group-prices/{customerGroupId}/tiers/{qty}'.format(sku='sku_example', customerGroupId='customerGroupId_example', qty=3.4),
                                    method='DELETE')
        self.assert200(response, "Response body is : " + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
