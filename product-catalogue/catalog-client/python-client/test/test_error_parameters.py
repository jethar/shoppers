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
from swagger_client.models.error_parameters import ErrorParameters


class TestErrorParameters(unittest.TestCase):
    """ ErrorParameters unit test stubs """

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testErrorParameters(self):
        """
        Test ErrorParameters
        """
        model = swagger_client.models.error_parameters.ErrorParameters()


if __name__ == '__main__':
    unittest.main()
