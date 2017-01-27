import connexion
from swagger_server.models.body1 import Body1
from swagger_server.models.body2 import Body2
from swagger_server.models.error_response import ErrorResponse
from datetime import date, datetime
from typing import List, Dict
from six import iteritems
from ..util import deserialize_date, deserialize_datetime


def catalog_product_website_link_repository_v1_delete_by_id_delete(sku, websiteId):
    """
    catalog_product_website_link_repository_v1_delete_by_id_delete
    Remove the website assignment from the product by product sku
    :param sku: 
    :type sku: str
    :param websiteId: 
    :type websiteId: int

    :rtype: bool
    """
    return 'do some magic!'


def catalog_product_website_link_repository_v1_save_post(sku, body=None):
    """
    catalog_product_website_link_repository_v1_save_post
    Assign a product to the website
    :param sku: 
    :type sku: str
    :param body: 
    :type body: dict | bytes

    :rtype: bool
    """
    if connexion.request.is_json:
        body = Body2.from_dict(connexion.request.get_json())
    return 'do some magic!'


def catalog_product_website_link_repository_v1_save_put(sku, body=None):
    """
    catalog_product_website_link_repository_v1_save_put
    Assign a product to the website
    :param sku: 
    :type sku: str
    :param body: 
    :type body: dict | bytes

    :rtype: bool
    """
    if connexion.request.is_json:
        body = Body1.from_dict(connexion.request.get_json())
    return 'do some magic!'
