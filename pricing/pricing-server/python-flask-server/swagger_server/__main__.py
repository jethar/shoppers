#!/usr/bin/env python3

import connexion
from .encoder import JSONEncoder


if __name__ == '__main__':
    app = connexion.App(__name__, specification_dir='./swagger/')
    app.app.json_encoder = JSONEncoder
    app.add_api('swagger.yaml', arguments={'title': 'This is a Shoppers Catalogue server.  [Learn about Swagger](http://swagger.io) or join the IRC channel &#x60;#swagger&#x60; on irc.freenode.net.  For this sample, you can use the api key &#x60;special-key&#x60; to test the authorization filters '})
    app.run(port=8080)
