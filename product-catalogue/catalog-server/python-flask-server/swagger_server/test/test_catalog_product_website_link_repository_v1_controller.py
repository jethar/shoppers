# coding: utf-8

from __future__ import absolute_import

from swagger_server.models.body1 import Body1
from swagger_server.models.body2 import Body2
from swagger_server.models.error_response import ErrorResponse
from . import BaseTestCase
from six import BytesIO
from flask import json


class TestCatalogProductWebsiteLinkRepositoryV1Controller(BaseTestCase):
    """ CatalogProductWebsiteLinkRepositoryV1Controller integration test stubs """

    def test_catalog_product_website_link_repository_v1_delete_by_id_delete(self):
        """
        Test case for catalog_product_website_link_repository_v1_delete_by_id_delete

        
        """
        response = self.client.open('/v2/v1/products/{sku}/websites/{websiteId}'.format(sku='sku_example', websiteId=56),
                                    method='DELETE')
        self.assert200(response, "Response body is : " + response.data.decode('utf-8'))

    def test_catalog_product_website_link_repository_v1_save_post(self):
        """
        Test case for catalog_product_website_link_repository_v1_save_post

        
        """
        body = Body2()
        response = self.client.open('/v2/v1/products/{sku}/websites'.format(sku='sku_example'),
                                    method='POST',
                                    data=json.dumps(body),
                                    content_type='application/json')
        self.assert200(response, "Response body is : " + response.data.decode('utf-8'))

    def test_catalog_product_website_link_repository_v1_save_put(self):
        """
        Test case for catalog_product_website_link_repository_v1_save_put

        
        """
        body = Body1()
        response = self.client.open('/v2/v1/products/{sku}/websites'.format(sku='sku_example'),
                                    method='PUT',
                                    data=json.dumps(body),
                                    content_type='application/json')
        self.assert200(response, "Response body is : " + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
