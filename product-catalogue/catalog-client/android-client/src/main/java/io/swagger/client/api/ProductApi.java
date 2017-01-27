/**
 * Shoppers OpenAPI
 * This is a Shoppers Catalogue server.  [Learn about Swagger](http://swagger.io) or join the IRC channel `#swagger` on irc.freenode.net.  For this sample, you can use the api key `special-key` to test the authorization filters 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.Body;
import io.swagger.client.model.CatalogDataProductSearchResultsInterface;
import io.swagger.client.model.ErrorResponse;
import io.swagger.client.model.Product;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ProductApi {
  String basePath = "http://shoppers.io/v2";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Add a new product to the store
  * 
   * @param body 
   * @return Product
  */
  public Product addProduct (Body body) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = body;

    // create path and map variables
    String path = "/v1/products".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json",
      "application/xml"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "shoppers_auth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Product) ApiInvoker.deserialize(localVarResponse, "", Product.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
       if (ex.getCause() instanceof VolleyError) {
         VolleyError volleyError = (VolleyError)ex.getCause();
         if (volleyError.networkResponse != null) {
           throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
         }
       }
       throw ex;
    } catch (TimeoutException ex) {
       throw ex;
    }
  }

      /**
   * Add a new product to the store
   * 
   * @param body 
  */
  public void addProduct (Body body, final Response.Listener<Product> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

  

    // create path and map variables
    String path = "/v1/products".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json","application/xml"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] { "shoppers_auth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Product) ApiInvoker.deserialize(localVarResponse,  "", Product.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Deletes a product
  * 
   * @param apiKey 
   * @param productId Product id to delete
   * @return void
  */
  public void deleteProduct (String apiKey, Long productId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'apiKey' when calling deleteProduct",
        new ApiException(400, "Missing the required parameter 'apiKey' when calling deleteProduct"));
    }
    // verify the required parameter 'productId' is set
    if (productId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'productId' when calling deleteProduct",
        new ApiException(400, "Missing the required parameter 'productId' when calling deleteProduct"));
    }

    // create path and map variables
    String path = "/v1/products/{productId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "productId" + "\\}", apiInvoker.escapeString(productId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    headerParams.put("api_key", ApiInvoker.parameterToString(apiKey));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "shoppers_auth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return ;
      } else {
         return ;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
       if (ex.getCause() instanceof VolleyError) {
         VolleyError volleyError = (VolleyError)ex.getCause();
         if (volleyError.networkResponse != null) {
           throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
         }
       }
       throw ex;
    } catch (TimeoutException ex) {
       throw ex;
    }
  }

      /**
   * Deletes a product
   * 
   * @param apiKey    * @param productId Product id to delete
  */
  public void deleteProduct (String apiKey, Long productId, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'apiKey' when calling deleteProduct",
         new ApiException(400, "Missing the required parameter 'apiKey' when calling deleteProduct"));
    }
    
    // verify the required parameter 'productId' is set
    if (productId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'productId' when calling deleteProduct",
         new ApiException(400, "Missing the required parameter 'productId' when calling deleteProduct"));
    }
    

    // create path and map variables
    String path = "/v1/products/{productId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "productId" + "\\}", apiInvoker.escapeString(productId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("api_key", ApiInvoker.parameterToString(apiKey));

    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] { "shoppers_auth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
              responseListener.onResponse(localVarResponse);
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Finds Products by category
  * Use category1 for testing.
   * @param category Category to filter by
   * @return List<CatalogDataProductSearchResultsInterface>
  */
  public List<CatalogDataProductSearchResultsInterface> findProductsByCategories (String category) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/v1/products/findByCategory".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "category", category));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "shoppers_auth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (List<CatalogDataProductSearchResultsInterface>) ApiInvoker.deserialize(localVarResponse, "array", CatalogDataProductSearchResultsInterface.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
       if (ex.getCause() instanceof VolleyError) {
         VolleyError volleyError = (VolleyError)ex.getCause();
         if (volleyError.networkResponse != null) {
           throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
         }
       }
       throw ex;
    } catch (TimeoutException ex) {
       throw ex;
    }
  }

      /**
   * Finds Products by category
   * Use category1 for testing.
   * @param category Category to filter by
  */
  public void findProductsByCategories (String category, final Response.Listener<List<CatalogDataProductSearchResultsInterface>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  

    // create path and map variables
    String path = "/v1/products/findByCategory".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "category", category));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] { "shoppers_auth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<CatalogDataProductSearchResultsInterface>) ApiInvoker.deserialize(localVarResponse,  "array", CatalogDataProductSearchResultsInterface.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Find product by ID
  * Returns a product when ID &lt; 10.  ID &gt; 10 or nonintegers will simulate API error conditions
   * @param productId ID of product that needs to be fetched
   * @return Product
  */
  public Product getProductById (Long productId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'productId' is set
    if (productId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'productId' when calling getProductById",
        new ApiException(400, "Missing the required parameter 'productId' when calling getProductById"));
    }

    // create path and map variables
    String path = "/v1/products/{productId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "productId" + "\\}", apiInvoker.escapeString(productId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "api_key", "shoppers_auth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Product) ApiInvoker.deserialize(localVarResponse, "", Product.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
       if (ex.getCause() instanceof VolleyError) {
         VolleyError volleyError = (VolleyError)ex.getCause();
         if (volleyError.networkResponse != null) {
           throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
         }
       }
       throw ex;
    } catch (TimeoutException ex) {
       throw ex;
    }
  }

      /**
   * Find product by ID
   * Returns a product when ID &lt; 10.  ID &gt; 10 or nonintegers will simulate API error conditions
   * @param productId ID of product that needs to be fetched
  */
  public void getProductById (Long productId, final Response.Listener<Product> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'productId' is set
    if (productId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'productId' when calling getProductById",
         new ApiException(400, "Missing the required parameter 'productId' when calling getProductById"));
    }
    

    // create path and map variables
    String path = "/v1/products/{productId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "productId" + "\\}", apiInvoker.escapeString(productId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] { "api_key", "shoppers_auth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Product) ApiInvoker.deserialize(localVarResponse,  "", Product.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Updates a product in the store with form data
  * 
   * @param productId ID of product that needs to be updated
   * @param name Updated name of the product
   * @param status Updated status of the product
   * @return void
  */
  public void updateProductWithForm (String productId, String name, String status) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'productId' is set
    if (productId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'productId' when calling updateProductWithForm",
        new ApiException(400, "Missing the required parameter 'productId' when calling updateProductWithForm"));
    }
    // verify the required parameter 'name' is set
    if (name == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'name' when calling updateProductWithForm",
        new ApiException(400, "Missing the required parameter 'name' when calling updateProductWithForm"));
    }
    // verify the required parameter 'status' is set
    if (status == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'status' when calling updateProductWithForm",
        new ApiException(400, "Missing the required parameter 'status' when calling updateProductWithForm"));
    }

    // create path and map variables
    String path = "/v1/products/{productId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "productId" + "\\}", apiInvoker.escapeString(productId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      if (name != null) {
        localVarBuilder.addTextBody("name", ApiInvoker.parameterToString(name), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (status != null) {
        localVarBuilder.addTextBody("status", ApiInvoker.parameterToString(status), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("name", ApiInvoker.parameterToString(name));
      formParams.put("status", ApiInvoker.parameterToString(status));
    }

    String[] authNames = new String[] { "shoppers_auth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return ;
      } else {
         return ;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
       if (ex.getCause() instanceof VolleyError) {
         VolleyError volleyError = (VolleyError)ex.getCause();
         if (volleyError.networkResponse != null) {
           throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
         }
       }
       throw ex;
    } catch (TimeoutException ex) {
       throw ex;
    }
  }

      /**
   * Updates a product in the store with form data
   * 
   * @param productId ID of product that needs to be updated   * @param name Updated name of the product   * @param status Updated status of the product
  */
  public void updateProductWithForm (String productId, String name, String status, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'productId' is set
    if (productId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'productId' when calling updateProductWithForm",
         new ApiException(400, "Missing the required parameter 'productId' when calling updateProductWithForm"));
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'name' when calling updateProductWithForm",
         new ApiException(400, "Missing the required parameter 'name' when calling updateProductWithForm"));
    }
    
    // verify the required parameter 'status' is set
    if (status == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'status' when calling updateProductWithForm",
         new ApiException(400, "Missing the required parameter 'status' when calling updateProductWithForm"));
    }
    

    // create path and map variables
    String path = "/v1/products/{productId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "productId" + "\\}", apiInvoker.escapeString(productId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (name != null) {
        localVarBuilder.addTextBody("name", ApiInvoker.parameterToString(name), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (status != null) {
        localVarBuilder.addTextBody("status", ApiInvoker.parameterToString(status), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("name", ApiInvoker.parameterToString(name));
formParams.put("status", ApiInvoker.parameterToString(status));
    }

      String[] authNames = new String[] { "shoppers_auth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
              responseListener.onResponse(localVarResponse);
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}