require 'json'


MyApp.add_route('POST', '/v2/v1/products/{sku}/group-prices/{customerGroupId}/tiers/{qty}/price/{price}', {
  "resourcePath" => "/CatalogProductTierPriceManagementV1",
  "summary" => "",
  "nickname" => "catalog_product_tier_price_management_v1_add_post", 
  "responseClass" => "boolean", 
  "endpoint" => "/v1/products/{sku}/group-prices/{customerGroupId}/tiers/{qty}/price/{price}", 
  "notes" => "Create tier price for product",
  "parameters" => [
    {
      "name" => "sku",
      "description" => "",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "customer_group_id",
      "description" => "&#39;all&#39; can be used to specify &#39;ALL GROUPS&#39;",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "price",
      "description" => "",
      "dataType" => "number",
      "paramType" => "path",
    },
    {
      "name" => "qty",
      "description" => "",
      "dataType" => "number",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v2/v1/products/{sku}/group-prices/{customerGroupId}/tiers', {
  "resourcePath" => "/CatalogProductTierPriceManagementV1",
  "summary" => "",
  "nickname" => "catalog_product_tier_price_management_v1_get_list_get", 
  "responseClass" => "array[product-tier-price-interface]", 
  "endpoint" => "/v1/products/{sku}/group-prices/{customerGroupId}/tiers", 
  "notes" => "Get tier price of product",
  "parameters" => [
    {
      "name" => "sku",
      "description" => "",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "customer_group_id",
      "description" => "&#39;all&#39; can be used to specify &#39;ALL GROUPS&#39;",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v2/v1/products/{sku}/group-prices/{customerGroupId}/tiers/{qty}', {
  "resourcePath" => "/CatalogProductTierPriceManagementV1",
  "summary" => "",
  "nickname" => "catalog_product_tier_price_management_v1_remove_delete", 
  "responseClass" => "boolean", 
  "endpoint" => "/v1/products/{sku}/group-prices/{customerGroupId}/tiers/{qty}", 
  "notes" => "Remove tier price from product",
  "parameters" => [
    {
      "name" => "sku",
      "description" => "",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "customer_group_id",
      "description" => "&#39;all&#39; can be used to specify &#39;ALL GROUPS&#39;",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "qty",
      "description" => "",
      "dataType" => "number",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

