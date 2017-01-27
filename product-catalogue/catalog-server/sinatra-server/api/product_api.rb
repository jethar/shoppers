require 'json'


MyApp.add_route('POST', '/v2/v1/products', {
  "resourcePath" => "/Product",
  "summary" => "Add a new product to the store",
  "nickname" => "add_product", 
  "responseClass" => "product", 
  "endpoint" => "/v1/products", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Body",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v2/v1/products/{productId}', {
  "resourcePath" => "/Product",
  "summary" => "Deletes a product",
  "nickname" => "delete_product", 
  "responseClass" => "void", 
  "endpoint" => "/v1/products/{productId}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "product_id",
      "description" => "Product id to delete",
      "dataType" => "int",
      "paramType" => "path",
    },
    {
      "name" => "api_key",
      "description" => "",
      "dataType" => "string",
      "paramType" => "header",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v2/v1/products/findByCategory', {
  "resourcePath" => "/Product",
  "summary" => "Finds Products by category",
  "nickname" => "find_products_by_categories", 
  "responseClass" => "array[catalog-data-product-search-results-interface]", 
  "endpoint" => "/v1/products/findByCategory", 
  "notes" => "Use category1 for testing.",
  "parameters" => [
    {
      "name" => "category",
      "description" => "Category to filter by",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v2/v1/products/{productId}', {
  "resourcePath" => "/Product",
  "summary" => "Find product by ID",
  "nickname" => "get_product_by_id", 
  "responseClass" => "product", 
  "endpoint" => "/v1/products/{productId}", 
  "notes" => "Returns a product when ID < 10.  ID > 10 or nonintegers will simulate API error conditions",
  "parameters" => [
    {
      "name" => "product_id",
      "description" => "ID of product that needs to be fetched",
      "dataType" => "int",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v2/v1/products/{productId}', {
  "resourcePath" => "/Product",
  "summary" => "Updates a product in the store with form data",
  "nickname" => "update_product_with_form", 
  "responseClass" => "void", 
  "endpoint" => "/v1/products/{productId}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "product_id",
      "description" => "ID of product that needs to be updated",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

