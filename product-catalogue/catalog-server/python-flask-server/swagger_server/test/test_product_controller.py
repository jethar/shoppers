# coding: utf-8

from __future__ import absolute_import

from swagger_server.models.body import Body
from swagger_server.models.catalog_data_product_search_results_interface import CatalogDataProductSearchResultsInterface
from swagger_server.models.error_response import ErrorResponse
from swagger_server.models.product import Product
from . import BaseTestCase
from six import BytesIO
from flask import json


class TestProductController(BaseTestCase):
    """ ProductController integration test stubs """

    def test_add_product(self):
        """
        Test case for add_product

        Add a new product to the store
        """
        body = Body()
        response = self.client.open('/v2/v1/products',
                                    method='POST',
                                    data=json.dumps(body),
                                    content_type='application/json')
        self.assert200(response, "Response body is : " + response.data.decode('utf-8'))

    def test_delete_product(self):
        """
        Test case for delete_product

        Deletes a product
        """
        headers = [('api_key', 'api_key_example')]
        response = self.client.open('/v2/v1/products/{productId}'.format(productId=789),
                                    method='DELETE',
                                    headers=headers)
        self.assert200(response, "Response body is : " + response.data.decode('utf-8'))

    def test_find_products_by_categories(self):
        """
        Test case for find_products_by_categories

        Finds Products by category
        """
        query_string = [('category', 'category_example')]
        response = self.client.open('/v2/v1/products/findByCategory',
                                    method='GET',
                                    query_string=query_string)
        self.assert200(response, "Response body is : " + response.data.decode('utf-8'))

    def test_get_product_by_id(self):
        """
        Test case for get_product_by_id

        Find product by ID
        """
        response = self.client.open('/v2/v1/products/{productId}'.format(productId=789),
                                    method='GET')
        self.assert200(response, "Response body is : " + response.data.decode('utf-8'))

    def test_update_product_with_form(self):
        """
        Test case for update_product_with_form

        Updates a product in the store with form data
        """
        data = dict(name='name_example',
                    status='status_example')
        response = self.client.open('/v2/v1/products/{productId}'.format(productId='productId_example'),
                                    method='POST',
                                    data=data,
                                    content_type='application/x-www-form-urlencoded')
        self.assert200(response, "Response body is : " + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
