# coding: utf-8

import sys
from setuptools import setup, find_packages

NAME = "swagger_server"
VERSION = "1.0.0"

# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools

REQUIRES = ["connexion"]

setup(
    name=NAME,
    version=VERSION,
    description="Shoppers OpenAPI",
    author_email="",
    url="",
    keywords=["Swagger", "Shoppers OpenAPI"],
    install_requires=REQUIRES,
    packages=find_packages(),
    package_data={'': ['swagger/swagger.yaml']},
    include_package_data=True,
    long_description="""\
    This is a Shoppers Catalogue server.  [Learn about Swagger](http://swagger.io) or join the IRC channel &#x60;#swagger&#x60; on irc.freenode.net.  For this sample, you can use the api key &#x60;special-key&#x60; to test the authorization filters 
    """
)

