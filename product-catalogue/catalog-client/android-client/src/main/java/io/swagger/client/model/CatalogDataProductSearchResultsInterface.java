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

import io.swagger.client.model.FrameworkSearchCriteriaInterface;
import io.swagger.client.model.Product;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * 
 **/
@ApiModel(description = "")
public class CatalogDataProductSearchResultsInterface {
  
  @SerializedName("items")
  private List<Product> items = null;
  @SerializedName("search_criteria")
  private FrameworkSearchCriteriaInterface searchCriteria = null;
  @SerializedName("total_count")
  private Integer totalCount = null;

  /**
   * Attributes list.
   **/
  @ApiModelProperty(required = true, value = "Attributes list.")
  public List<Product> getItems() {
    return items;
  }
  public void setItems(List<Product> items) {
    this.items = items;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FrameworkSearchCriteriaInterface getSearchCriteria() {
    return searchCriteria;
  }
  public void setSearchCriteria(FrameworkSearchCriteriaInterface searchCriteria) {
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
    CatalogDataProductSearchResultsInterface catalogDataProductSearchResultsInterface = (CatalogDataProductSearchResultsInterface) o;
    return (this.items == null ? catalogDataProductSearchResultsInterface.items == null : this.items.equals(catalogDataProductSearchResultsInterface.items)) &&
        (this.searchCriteria == null ? catalogDataProductSearchResultsInterface.searchCriteria == null : this.searchCriteria.equals(catalogDataProductSearchResultsInterface.searchCriteria)) &&
        (this.totalCount == null ? catalogDataProductSearchResultsInterface.totalCount == null : this.totalCount.equals(catalogDataProductSearchResultsInterface.totalCount));
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
    sb.append("class CatalogDataProductSearchResultsInterface {\n");
    
    sb.append("  items: ").append(items).append("\n");
    sb.append("  searchCriteria: ").append(searchCriteria).append("\n");
    sb.append("  totalCount: ").append(totalCount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
