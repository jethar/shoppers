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

import java.math.BigDecimal;
import io.swagger.client.model.ErrorResponse;
import io.swagger.client.model.ProductTierPriceInterface;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class CatalogProductTierPriceManagementV1Api {
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
  * 
  * Create tier price for product
   * @param sku 
   * @param customerGroupId &#39;all&#39; can be used to specify &#39;ALL GROUPS&#39;
   * @param price 
   * @param qty 
   * @return Boolean
  */
  public Boolean catalogProductTierPriceManagementV1AddPost (String sku, String customerGroupId, BigDecimal price, BigDecimal qty) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'sku' is set
    if (sku == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'sku' when calling catalogProductTierPriceManagementV1AddPost",
        new ApiException(400, "Missing the required parameter 'sku' when calling catalogProductTierPriceManagementV1AddPost"));
    }
    // verify the required parameter 'customerGroupId' is set
    if (customerGroupId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'customerGroupId' when calling catalogProductTierPriceManagementV1AddPost",
        new ApiException(400, "Missing the required parameter 'customerGroupId' when calling catalogProductTierPriceManagementV1AddPost"));
    }
    // verify the required parameter 'price' is set
    if (price == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'price' when calling catalogProductTierPriceManagementV1AddPost",
        new ApiException(400, "Missing the required parameter 'price' when calling catalogProductTierPriceManagementV1AddPost"));
    }
    // verify the required parameter 'qty' is set
    if (qty == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'qty' when calling catalogProductTierPriceManagementV1AddPost",
        new ApiException(400, "Missing the required parameter 'qty' when calling catalogProductTierPriceManagementV1AddPost"));
    }

    // create path and map variables
    String path = "/v1/products/{sku}/group-prices/{customerGroupId}/tiers/{qty}/price/{price}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "sku" + "\\}", apiInvoker.escapeString(sku.toString())).replaceAll("\\{" + "customerGroupId" + "\\}", apiInvoker.escapeString(customerGroupId.toString())).replaceAll("\\{" + "price" + "\\}", apiInvoker.escapeString(price.toString())).replaceAll("\\{" + "qty" + "\\}", apiInvoker.escapeString(qty.toString()));

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

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Boolean) ApiInvoker.deserialize(localVarResponse, "", Boolean.class);
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
   * 
   * Create tier price for product
   * @param sku    * @param customerGroupId &#39;all&#39; can be used to specify &#39;ALL GROUPS&#39;   * @param price    * @param qty 
  */
  public void catalogProductTierPriceManagementV1AddPost (String sku, String customerGroupId, BigDecimal price, BigDecimal qty, final Response.Listener<Boolean> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'sku' is set
    if (sku == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'sku' when calling catalogProductTierPriceManagementV1AddPost",
         new ApiException(400, "Missing the required parameter 'sku' when calling catalogProductTierPriceManagementV1AddPost"));
    }
    
    // verify the required parameter 'customerGroupId' is set
    if (customerGroupId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'customerGroupId' when calling catalogProductTierPriceManagementV1AddPost",
         new ApiException(400, "Missing the required parameter 'customerGroupId' when calling catalogProductTierPriceManagementV1AddPost"));
    }
    
    // verify the required parameter 'price' is set
    if (price == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'price' when calling catalogProductTierPriceManagementV1AddPost",
         new ApiException(400, "Missing the required parameter 'price' when calling catalogProductTierPriceManagementV1AddPost"));
    }
    
    // verify the required parameter 'qty' is set
    if (qty == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'qty' when calling catalogProductTierPriceManagementV1AddPost",
         new ApiException(400, "Missing the required parameter 'qty' when calling catalogProductTierPriceManagementV1AddPost"));
    }
    

    // create path and map variables
    String path = "/v1/products/{sku}/group-prices/{customerGroupId}/tiers/{qty}/price/{price}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "sku" + "\\}", apiInvoker.escapeString(sku.toString())).replaceAll("\\{" + "customerGroupId" + "\\}", apiInvoker.escapeString(customerGroupId.toString())).replaceAll("\\{" + "price" + "\\}", apiInvoker.escapeString(price.toString())).replaceAll("\\{" + "qty" + "\\}", apiInvoker.escapeString(qty.toString()));

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

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Boolean) ApiInvoker.deserialize(localVarResponse,  "", Boolean.class));
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
  * 
  * Get tier price of product
   * @param sku 
   * @param customerGroupId &#39;all&#39; can be used to specify &#39;ALL GROUPS&#39;
   * @return List<ProductTierPriceInterface>
  */
  public List<ProductTierPriceInterface> catalogProductTierPriceManagementV1GetListGet (String sku, String customerGroupId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'sku' is set
    if (sku == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'sku' when calling catalogProductTierPriceManagementV1GetListGet",
        new ApiException(400, "Missing the required parameter 'sku' when calling catalogProductTierPriceManagementV1GetListGet"));
    }
    // verify the required parameter 'customerGroupId' is set
    if (customerGroupId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'customerGroupId' when calling catalogProductTierPriceManagementV1GetListGet",
        new ApiException(400, "Missing the required parameter 'customerGroupId' when calling catalogProductTierPriceManagementV1GetListGet"));
    }

    // create path and map variables
    String path = "/v1/products/{sku}/group-prices/{customerGroupId}/tiers".replaceAll("\\{format\\}","json").replaceAll("\\{" + "sku" + "\\}", apiInvoker.escapeString(sku.toString())).replaceAll("\\{" + "customerGroupId" + "\\}", apiInvoker.escapeString(customerGroupId.toString()));

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

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (List<ProductTierPriceInterface>) ApiInvoker.deserialize(localVarResponse, "array", ProductTierPriceInterface.class);
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
   * 
   * Get tier price of product
   * @param sku    * @param customerGroupId &#39;all&#39; can be used to specify &#39;ALL GROUPS&#39;
  */
  public void catalogProductTierPriceManagementV1GetListGet (String sku, String customerGroupId, final Response.Listener<List<ProductTierPriceInterface>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'sku' is set
    if (sku == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'sku' when calling catalogProductTierPriceManagementV1GetListGet",
         new ApiException(400, "Missing the required parameter 'sku' when calling catalogProductTierPriceManagementV1GetListGet"));
    }
    
    // verify the required parameter 'customerGroupId' is set
    if (customerGroupId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'customerGroupId' when calling catalogProductTierPriceManagementV1GetListGet",
         new ApiException(400, "Missing the required parameter 'customerGroupId' when calling catalogProductTierPriceManagementV1GetListGet"));
    }
    

    // create path and map variables
    String path = "/v1/products/{sku}/group-prices/{customerGroupId}/tiers".replaceAll("\\{format\\}","json").replaceAll("\\{" + "sku" + "\\}", apiInvoker.escapeString(sku.toString())).replaceAll("\\{" + "customerGroupId" + "\\}", apiInvoker.escapeString(customerGroupId.toString()));

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

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<ProductTierPriceInterface>) ApiInvoker.deserialize(localVarResponse,  "array", ProductTierPriceInterface.class));
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
  * 
  * Remove tier price from product
   * @param sku 
   * @param customerGroupId &#39;all&#39; can be used to specify &#39;ALL GROUPS&#39;
   * @param qty 
   * @return Boolean
  */
  public Boolean catalogProductTierPriceManagementV1RemoveDelete (String sku, String customerGroupId, BigDecimal qty) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'sku' is set
    if (sku == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'sku' when calling catalogProductTierPriceManagementV1RemoveDelete",
        new ApiException(400, "Missing the required parameter 'sku' when calling catalogProductTierPriceManagementV1RemoveDelete"));
    }
    // verify the required parameter 'customerGroupId' is set
    if (customerGroupId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'customerGroupId' when calling catalogProductTierPriceManagementV1RemoveDelete",
        new ApiException(400, "Missing the required parameter 'customerGroupId' when calling catalogProductTierPriceManagementV1RemoveDelete"));
    }
    // verify the required parameter 'qty' is set
    if (qty == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'qty' when calling catalogProductTierPriceManagementV1RemoveDelete",
        new ApiException(400, "Missing the required parameter 'qty' when calling catalogProductTierPriceManagementV1RemoveDelete"));
    }

    // create path and map variables
    String path = "/v1/products/{sku}/group-prices/{customerGroupId}/tiers/{qty}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "sku" + "\\}", apiInvoker.escapeString(sku.toString())).replaceAll("\\{" + "customerGroupId" + "\\}", apiInvoker.escapeString(customerGroupId.toString())).replaceAll("\\{" + "qty" + "\\}", apiInvoker.escapeString(qty.toString()));

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

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Boolean) ApiInvoker.deserialize(localVarResponse, "", Boolean.class);
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
   * 
   * Remove tier price from product
   * @param sku    * @param customerGroupId &#39;all&#39; can be used to specify &#39;ALL GROUPS&#39;   * @param qty 
  */
  public void catalogProductTierPriceManagementV1RemoveDelete (String sku, String customerGroupId, BigDecimal qty, final Response.Listener<Boolean> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'sku' is set
    if (sku == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'sku' when calling catalogProductTierPriceManagementV1RemoveDelete",
         new ApiException(400, "Missing the required parameter 'sku' when calling catalogProductTierPriceManagementV1RemoveDelete"));
    }
    
    // verify the required parameter 'customerGroupId' is set
    if (customerGroupId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'customerGroupId' when calling catalogProductTierPriceManagementV1RemoveDelete",
         new ApiException(400, "Missing the required parameter 'customerGroupId' when calling catalogProductTierPriceManagementV1RemoveDelete"));
    }
    
    // verify the required parameter 'qty' is set
    if (qty == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'qty' when calling catalogProductTierPriceManagementV1RemoveDelete",
         new ApiException(400, "Missing the required parameter 'qty' when calling catalogProductTierPriceManagementV1RemoveDelete"));
    }
    

    // create path and map variables
    String path = "/v1/products/{sku}/group-prices/{customerGroupId}/tiers/{qty}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "sku" + "\\}", apiInvoker.escapeString(sku.toString())).replaceAll("\\{" + "customerGroupId" + "\\}", apiInvoker.escapeString(customerGroupId.toString())).replaceAll("\\{" + "qty" + "\\}", apiInvoker.escapeString(qty.toString()));

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

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Boolean) ApiInvoker.deserialize(localVarResponse,  "", Boolean.class));
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
}
