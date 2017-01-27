import connexion
from swagger_server.models.body import Body
from swagger_server.models.catalog_data_product_search_results_interface import CatalogDataProductSearchResultsInterface
from swagger_server.models.error_response import ErrorResponse
from swagger_server.models.product import Product
from datetime import date, datetime
from typing import List, Dict
from six import iteritems
from ..util import deserialize_date, deserialize_datetime


def add_product(body=None):
    """
    Add a new product to the store
    
    :param body: 
    :type body: dict | bytes

    :rtype: Product
    """
    if connexion.request.is_json:
        body = Body.from_dict(connexion.request.get_json())
    return 'do some magic!'


def delete_product(api_key, productId):
    """
    Deletes a product
    
    :param api_key: 
    :type api_key: str
    :param productId: Product id to delete
    :type productId: int

    :rtype: None
    """
    return 'do some magic!'


def find_products_by_categories(category=None):
    """
    Finds Products by category
    Use category1 for testing.
    :param category: Category to filter by
    :type category: str

    :rtype: List[CatalogDataProductSearchResultsInterface]
    """
    return 'do some magic!'


def get_product_by_id(productId):
    """
    Find product by ID
    Returns a product when ID &lt; 10.  ID &gt; 10 or nonintegers will simulate API error conditions
    :param productId: ID of product that needs to be fetched
    :type productId: int

    :rtype: Product
    """
    return 'do some magic!'


def update_product_with_form(productId, name, status):
    """
    Updates a product in the store with form data
    
    :param productId: ID of product that needs to be updated
    :type productId: str
    :param name: Updated name of the product
    :type name: str
    :param status: Updated status of the product
    :type status: str

    :rtype: None
    """
    return 'do some magic!'
