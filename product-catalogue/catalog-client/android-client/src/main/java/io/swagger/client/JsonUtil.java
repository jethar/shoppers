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

package io.swagger.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Date;
import io.swagger.client.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
      public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new Date(json.getAsJsonPrimitive().getAsLong());
      }
    });
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Body".equalsIgnoreCase(className)) {
      return new TypeToken<List<Body>>(){}.getType();
    }
    
    if ("Body1".equalsIgnoreCase(className)) {
      return new TypeToken<List<Body1>>(){}.getType();
    }
    
    if ("Body2".equalsIgnoreCase(className)) {
      return new TypeToken<List<Body2>>(){}.getType();
    }
    
    if ("BundleDataLinkInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<BundleDataLinkInterface>>(){}.getType();
    }
    
    if ("BundleDataOptionInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<BundleDataOptionInterface>>(){}.getType();
    }
    
    if ("CatalogDataCategoryAttributeInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<CatalogDataCategoryAttributeInterface>>(){}.getType();
    }
    
    if ("CatalogDataCategoryTreeInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<CatalogDataCategoryTreeInterface>>(){}.getType();
    }
    
    if ("CatalogDataProductAttributeInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<CatalogDataProductAttributeInterface>>(){}.getType();
    }
    
    if ("CatalogDataProductAttributeMediaGalleryEntryInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<CatalogDataProductAttributeMediaGalleryEntryInterface>>(){}.getType();
    }
    
    if ("CatalogDataProductAttributeSearchResultsInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<CatalogDataProductAttributeSearchResultsInterface>>(){}.getType();
    }
    
    if ("CatalogDataProductCustomOptionInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<CatalogDataProductCustomOptionInterface>>(){}.getType();
    }
    
    if ("CatalogDataProductCustomOptionValuesInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<CatalogDataProductCustomOptionValuesInterface>>(){}.getType();
    }
    
    if ("CatalogDataProductLinkInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<CatalogDataProductLinkInterface>>(){}.getType();
    }
    
    if ("CatalogDataProductSearchResultsInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<CatalogDataProductSearchResultsInterface>>(){}.getType();
    }
    
    if ("CatalogDataProductTierPriceInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<CatalogDataProductTierPriceInterface>>(){}.getType();
    }
    
    if ("CatalogInventoryDataStockItemInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<CatalogInventoryDataStockItemInterface>>(){}.getType();
    }
    
    if ("CatalogInventoryDataStockStatusCollectionInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<CatalogInventoryDataStockStatusCollectionInterface>>(){}.getType();
    }
    
    if ("CatalogInventoryDataStockStatusInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<CatalogInventoryDataStockStatusInterface>>(){}.getType();
    }
    
    if ("CatalogInventoryStockStatusCriteriaInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<CatalogInventoryStockStatusCriteriaInterface>>(){}.getType();
    }
    
    if ("CatalogProductWebsiteLinkInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<CatalogProductWebsiteLinkInterface>>(){}.getType();
    }
    
    if ("Category".equalsIgnoreCase(className)) {
      return new TypeToken<List<Category>>(){}.getType();
    }
    
    if ("ConfigurableProductDataOptionInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConfigurableProductDataOptionInterface>>(){}.getType();
    }
    
    if ("ConfigurableProductDataOptionValueInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConfigurableProductDataOptionValueInterface>>(){}.getType();
    }
    
    if ("DownloadableDataFileContentInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<DownloadableDataFileContentInterface>>(){}.getType();
    }
    
    if ("DownloadableDataLinkInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<DownloadableDataLinkInterface>>(){}.getType();
    }
    
    if ("DownloadableDataSampleInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<DownloadableDataSampleInterface>>(){}.getType();
    }
    
    if ("EavDataAttributeFrontendLabelInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<EavDataAttributeFrontendLabelInterface>>(){}.getType();
    }
    
    if ("EavDataAttributeOptionInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<EavDataAttributeOptionInterface>>(){}.getType();
    }
    
    if ("EavDataAttributeOptionLabelInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<EavDataAttributeOptionLabelInterface>>(){}.getType();
    }
    
    if ("EavDataAttributeValidationRuleInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<EavDataAttributeValidationRuleInterface>>(){}.getType();
    }
    
    if ("ErrorErrors".equalsIgnoreCase(className)) {
      return new TypeToken<List<ErrorErrors>>(){}.getType();
    }
    
    if ("ErrorErrorsItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<ErrorErrorsItem>>(){}.getType();
    }
    
    if ("ErrorParameters".equalsIgnoreCase(className)) {
      return new TypeToken<List<ErrorParameters>>(){}.getType();
    }
    
    if ("ErrorParametersItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<ErrorParametersItem>>(){}.getType();
    }
    
    if ("ErrorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ErrorResponse>>(){}.getType();
    }
    
    if ("FrameworkAttributeInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<FrameworkAttributeInterface>>(){}.getType();
    }
    
    if ("FrameworkCriteriaInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<FrameworkCriteriaInterface>>(){}.getType();
    }
    
    if ("FrameworkDataImageContentInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<FrameworkDataImageContentInterface>>(){}.getType();
    }
    
    if ("FrameworkFilter".equalsIgnoreCase(className)) {
      return new TypeToken<List<FrameworkFilter>>(){}.getType();
    }
    
    if ("FrameworkSearchAggregationInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<FrameworkSearchAggregationInterface>>(){}.getType();
    }
    
    if ("FrameworkSearchAggregationValueInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<FrameworkSearchAggregationValueInterface>>(){}.getType();
    }
    
    if ("FrameworkSearchBucketInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<FrameworkSearchBucketInterface>>(){}.getType();
    }
    
    if ("FrameworkSearchCriteriaInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<FrameworkSearchCriteriaInterface>>(){}.getType();
    }
    
    if ("FrameworkSearchDocumentInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<FrameworkSearchDocumentInterface>>(){}.getType();
    }
    
    if ("FrameworkSearchFilterGroup".equalsIgnoreCase(className)) {
      return new TypeToken<List<FrameworkSearchFilterGroup>>(){}.getType();
    }
    
    if ("FrameworkSearchSearchCriteriaInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<FrameworkSearchSearchCriteriaInterface>>(){}.getType();
    }
    
    if ("FrameworkSearchSearchResultInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<FrameworkSearchSearchResultInterface>>(){}.getType();
    }
    
    if ("FrameworkSortOrder".equalsIgnoreCase(className)) {
      return new TypeToken<List<FrameworkSortOrder>>(){}.getType();
    }
    
    if ("Product".equalsIgnoreCase(className)) {
      return new TypeToken<List<Product>>(){}.getType();
    }
    
    if ("ProductExtensionInterface".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductExtensionInterface>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Body".equalsIgnoreCase(className)) {
      return new TypeToken<Body>(){}.getType();
    }
    
    if ("Body1".equalsIgnoreCase(className)) {
      return new TypeToken<Body1>(){}.getType();
    }
    
    if ("Body2".equalsIgnoreCase(className)) {
      return new TypeToken<Body2>(){}.getType();
    }
    
    if ("BundleDataLinkInterface".equalsIgnoreCase(className)) {
      return new TypeToken<BundleDataLinkInterface>(){}.getType();
    }
    
    if ("BundleDataOptionInterface".equalsIgnoreCase(className)) {
      return new TypeToken<BundleDataOptionInterface>(){}.getType();
    }
    
    if ("CatalogDataCategoryAttributeInterface".equalsIgnoreCase(className)) {
      return new TypeToken<CatalogDataCategoryAttributeInterface>(){}.getType();
    }
    
    if ("CatalogDataCategoryTreeInterface".equalsIgnoreCase(className)) {
      return new TypeToken<CatalogDataCategoryTreeInterface>(){}.getType();
    }
    
    if ("CatalogDataProductAttributeInterface".equalsIgnoreCase(className)) {
      return new TypeToken<CatalogDataProductAttributeInterface>(){}.getType();
    }
    
    if ("CatalogDataProductAttributeMediaGalleryEntryInterface".equalsIgnoreCase(className)) {
      return new TypeToken<CatalogDataProductAttributeMediaGalleryEntryInterface>(){}.getType();
    }
    
    if ("CatalogDataProductAttributeSearchResultsInterface".equalsIgnoreCase(className)) {
      return new TypeToken<CatalogDataProductAttributeSearchResultsInterface>(){}.getType();
    }
    
    if ("CatalogDataProductCustomOptionInterface".equalsIgnoreCase(className)) {
      return new TypeToken<CatalogDataProductCustomOptionInterface>(){}.getType();
    }
    
    if ("CatalogDataProductCustomOptionValuesInterface".equalsIgnoreCase(className)) {
      return new TypeToken<CatalogDataProductCustomOptionValuesInterface>(){}.getType();
    }
    
    if ("CatalogDataProductLinkInterface".equalsIgnoreCase(className)) {
      return new TypeToken<CatalogDataProductLinkInterface>(){}.getType();
    }
    
    if ("CatalogDataProductSearchResultsInterface".equalsIgnoreCase(className)) {
      return new TypeToken<CatalogDataProductSearchResultsInterface>(){}.getType();
    }
    
    if ("CatalogDataProductTierPriceInterface".equalsIgnoreCase(className)) {
      return new TypeToken<CatalogDataProductTierPriceInterface>(){}.getType();
    }
    
    if ("CatalogInventoryDataStockItemInterface".equalsIgnoreCase(className)) {
      return new TypeToken<CatalogInventoryDataStockItemInterface>(){}.getType();
    }
    
    if ("CatalogInventoryDataStockStatusCollectionInterface".equalsIgnoreCase(className)) {
      return new TypeToken<CatalogInventoryDataStockStatusCollectionInterface>(){}.getType();
    }
    
    if ("CatalogInventoryDataStockStatusInterface".equalsIgnoreCase(className)) {
      return new TypeToken<CatalogInventoryDataStockStatusInterface>(){}.getType();
    }
    
    if ("CatalogInventoryStockStatusCriteriaInterface".equalsIgnoreCase(className)) {
      return new TypeToken<CatalogInventoryStockStatusCriteriaInterface>(){}.getType();
    }
    
    if ("CatalogProductWebsiteLinkInterface".equalsIgnoreCase(className)) {
      return new TypeToken<CatalogProductWebsiteLinkInterface>(){}.getType();
    }
    
    if ("Category".equalsIgnoreCase(className)) {
      return new TypeToken<Category>(){}.getType();
    }
    
    if ("ConfigurableProductDataOptionInterface".equalsIgnoreCase(className)) {
      return new TypeToken<ConfigurableProductDataOptionInterface>(){}.getType();
    }
    
    if ("ConfigurableProductDataOptionValueInterface".equalsIgnoreCase(className)) {
      return new TypeToken<ConfigurableProductDataOptionValueInterface>(){}.getType();
    }
    
    if ("DownloadableDataFileContentInterface".equalsIgnoreCase(className)) {
      return new TypeToken<DownloadableDataFileContentInterface>(){}.getType();
    }
    
    if ("DownloadableDataLinkInterface".equalsIgnoreCase(className)) {
      return new TypeToken<DownloadableDataLinkInterface>(){}.getType();
    }
    
    if ("DownloadableDataSampleInterface".equalsIgnoreCase(className)) {
      return new TypeToken<DownloadableDataSampleInterface>(){}.getType();
    }
    
    if ("EavDataAttributeFrontendLabelInterface".equalsIgnoreCase(className)) {
      return new TypeToken<EavDataAttributeFrontendLabelInterface>(){}.getType();
    }
    
    if ("EavDataAttributeOptionInterface".equalsIgnoreCase(className)) {
      return new TypeToken<EavDataAttributeOptionInterface>(){}.getType();
    }
    
    if ("EavDataAttributeOptionLabelInterface".equalsIgnoreCase(className)) {
      return new TypeToken<EavDataAttributeOptionLabelInterface>(){}.getType();
    }
    
    if ("EavDataAttributeValidationRuleInterface".equalsIgnoreCase(className)) {
      return new TypeToken<EavDataAttributeValidationRuleInterface>(){}.getType();
    }
    
    if ("ErrorErrors".equalsIgnoreCase(className)) {
      return new TypeToken<ErrorErrors>(){}.getType();
    }
    
    if ("ErrorErrorsItem".equalsIgnoreCase(className)) {
      return new TypeToken<ErrorErrorsItem>(){}.getType();
    }
    
    if ("ErrorParameters".equalsIgnoreCase(className)) {
      return new TypeToken<ErrorParameters>(){}.getType();
    }
    
    if ("ErrorParametersItem".equalsIgnoreCase(className)) {
      return new TypeToken<ErrorParametersItem>(){}.getType();
    }
    
    if ("ErrorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ErrorResponse>(){}.getType();
    }
    
    if ("FrameworkAttributeInterface".equalsIgnoreCase(className)) {
      return new TypeToken<FrameworkAttributeInterface>(){}.getType();
    }
    
    if ("FrameworkCriteriaInterface".equalsIgnoreCase(className)) {
      return new TypeToken<FrameworkCriteriaInterface>(){}.getType();
    }
    
    if ("FrameworkDataImageContentInterface".equalsIgnoreCase(className)) {
      return new TypeToken<FrameworkDataImageContentInterface>(){}.getType();
    }
    
    if ("FrameworkFilter".equalsIgnoreCase(className)) {
      return new TypeToken<FrameworkFilter>(){}.getType();
    }
    
    if ("FrameworkSearchAggregationInterface".equalsIgnoreCase(className)) {
      return new TypeToken<FrameworkSearchAggregationInterface>(){}.getType();
    }
    
    if ("FrameworkSearchAggregationValueInterface".equalsIgnoreCase(className)) {
      return new TypeToken<FrameworkSearchAggregationValueInterface>(){}.getType();
    }
    
    if ("FrameworkSearchBucketInterface".equalsIgnoreCase(className)) {
      return new TypeToken<FrameworkSearchBucketInterface>(){}.getType();
    }
    
    if ("FrameworkSearchCriteriaInterface".equalsIgnoreCase(className)) {
      return new TypeToken<FrameworkSearchCriteriaInterface>(){}.getType();
    }
    
    if ("FrameworkSearchDocumentInterface".equalsIgnoreCase(className)) {
      return new TypeToken<FrameworkSearchDocumentInterface>(){}.getType();
    }
    
    if ("FrameworkSearchFilterGroup".equalsIgnoreCase(className)) {
      return new TypeToken<FrameworkSearchFilterGroup>(){}.getType();
    }
    
    if ("FrameworkSearchSearchCriteriaInterface".equalsIgnoreCase(className)) {
      return new TypeToken<FrameworkSearchSearchCriteriaInterface>(){}.getType();
    }
    
    if ("FrameworkSearchSearchResultInterface".equalsIgnoreCase(className)) {
      return new TypeToken<FrameworkSearchSearchResultInterface>(){}.getType();
    }
    
    if ("FrameworkSortOrder".equalsIgnoreCase(className)) {
      return new TypeToken<FrameworkSortOrder>(){}.getType();
    }
    
    if ("Product".equalsIgnoreCase(className)) {
      return new TypeToken<Product>(){}.getType();
    }
    
    if ("ProductExtensionInterface".equalsIgnoreCase(className)) {
      return new TypeToken<ProductExtensionInterface>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
