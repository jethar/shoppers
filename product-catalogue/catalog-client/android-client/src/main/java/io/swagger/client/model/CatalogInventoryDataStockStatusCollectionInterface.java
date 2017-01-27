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

package io.swagger.client.model;

import io.swagger.client.model.CatalogInventoryDataStockStatusInterface;
import io.swagger.client.model.CatalogInventoryStockStatusCriteriaInterface;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Stock Status collection interface
 **/
@ApiModel(description = "Stock Status collection interface")
public class CatalogInventoryDataStockStatusCollectionInterface {
  
  @SerializedName("items")
  private List<CatalogInventoryDataStockStatusInterface> items = null;
  @SerializedName("search_criteria")
  private CatalogInventoryStockStatusCriteriaInterface searchCriteria = null;
  @SerializedName("total_count")
  private Integer totalCount = null;

  /**
   * Items
   **/
  @ApiModelProperty(required = true, value = "Items")
  public List<CatalogInventoryDataStockStatusInterface> getItems() {
    return items;
  }
  public void setItems(List<CatalogInventoryDataStockStatusInterface> items) {
    this.items = items;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CatalogInventoryStockStatusCriteriaInterface getSearchCriteria() {
    return searchCriteria;
  }
  public void setSearchCriteria(CatalogInventoryStockStatusCriteriaInterface searchCriteria) {
    this.searchCriteria = searchCriteria;
  }

  /**
   * Total count.
   **/
  @ApiModelProperty(required = true, value = "Total count.")
  public Integer getTotalCount() {
    return totalCount;
  }
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogInventoryDataStockStatusCollectionInterface catalogInventoryDataStockStatusCollectionInterface = (CatalogInventoryDataStockStatusCollectionInterface) o;
    return (this.items == null ? catalogInventoryDataStockStatusCollectionInterface.items == null : this.items.equals(catalogInventoryDataStockStatusCollectionInterface.items)) &&
        (this.searchCriteria == null ? catalogInventoryDataStockStatusCollectionInterface.searchCriteria == null : this.searchCriteria.equals(catalogInventoryDataStockStatusCollectionInterface.searchCriteria)) &&
        (this.totalCount == null ? catalogInventoryDataStockStatusCollectionInterface.totalCount == null : this.totalCount.equals(catalogInventoryDataStockStatusCollectionInterface.totalCount));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.items == null ? 0: this.items.hashCode());
    result = 31 * result + (this.searchCriteria == null ? 0: this.searchCriteria.hashCode());
    result = 31 * result + (this.totalCount == null ? 0: this.totalCount.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogInventoryDataStockStatusCollectionInterface {\n");
    
    sb.append("  items: ").append(items).append("\n");
    sb.append("  searchCriteria: ").append(searchCriteria).append("\n");
    sb.append("  totalCount: ").append(totalCount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
