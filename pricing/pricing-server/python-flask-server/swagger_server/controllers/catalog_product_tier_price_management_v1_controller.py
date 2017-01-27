import connexion
from swagger_server.models.error_response import ErrorResponse
from swagger_server.models.product_tier_price_interface import ProductTierPriceInterface
from datetime import date, datetime
from typing import List, Dict
from six import iteritems
from ..util import deserialize_date, deserialize_datetime


def catalog_product_tier_price_management_v1_add_post(sku, customerGroupId, price, qty):
    """
    catalog_product_tier_price_management_v1_add_post
    Create tier price for product
    :param sku: 
    :type sku: str
    :param customerGroupId: &#39;all&#39; can be used to specify &#39;ALL GROUPS&#39;
    :type customerGroupId: str
    :param price: 
    :type price: float
    :param qty: 
    :type qty: float

    :rtype: bool
    """
    return 'do some magic!'


def catalog_product_tier_price_management_v1_get_list_get(sku, customerGroupId):
    """
    catalog_product_tier_price_management_v1_get_list_get
    Get tier price of product
    :param sku: 
    :type sku: str
    :param customerGroupId: &#39;all&#39; can be used to specify &#39;ALL GROUPS&#39;
    :type customerGroupId: str

    :rtype: List[ProductTierPriceInterface]
    """
    return 'do some magic!'


def catalog_product_tier_price_management_v1_remove_delete(sku, customerGroupId, qty):
    """
    catalog_product_tier_price_management_v1_remove_delete
    Remove tier price from product
    :param sku: 
    :type sku: str
    :param customerGroupId: &#39;all&#39; can be used to specify &#39;ALL GROUPS&#39;
    :type customerGroupId: str
    :param qty: 
    :type qty: float

    :rtype: bool
    """
    return 'do some magic!'
