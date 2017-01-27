require 'json'


MyApp.add_route('DELETE', '/v2/v1/products/{sku}/websites/{websiteId}', {
  "resourcePath" => "/CatalogProductWebsiteLinkRepositoryV1",
  "summary" => "",
  "nickname" => "catalog_product_website_link_repository_v1_delete_by_id_delete", 
  "responseClass" => "boolean", 
  "endpoint" => "/v1/products/{sku}/websites/{websiteId}", 
  "notes" => "Remove the website assignment from the product by product sku",
  "parameters" => [
    {
      "name" => "sku",
      "description" => "",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "website_id",
      "description" => "",
      "dataType" => "int",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v2/v1/products/{sku}/websites', {
  "resourcePath" => "/CatalogProductWebsiteLinkRepositoryV1",
  "summary" => "",
  "nickname" => "catalog_product_website_link_repository_v1_save_post", 
  "responseClass" => "boolean", 
  "endpoint" => "/v1/products/{sku}/websites", 
  "notes" => "Assign a product to the website",
  "parameters" => [
    {
      "name" => "sku",
      "description" => "",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Body2",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/v2/v1/products/{sku}/websites', {
  "resourcePath" => "/CatalogProductWebsiteLinkRepositoryV1",
  "summary" => "",
  "nickname" => "catalog_product_website_link_repository_v1_save_put", 
  "responseClass" => "boolean", 
  "endpoint" => "/v1/products/{sku}/websites", 
  "notes" => "Assign a product to the website",
  "parameters" => [
    {
      "name" => "sku",
      "description" => "",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Body1",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

