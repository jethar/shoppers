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

import io.swagger.client.model.FrameworkSearchAggregationInterface;
import io.swagger.client.model.FrameworkSearchDocumentInterface;
import io.swagger.client.model.FrameworkSearchSearchCriteriaInterface;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * 
 **/
@ApiModel(description = "")
public class FrameworkSearchSearchResultInterface {
  
  @SerializedName("items")
  private List<FrameworkSearchDocumentInterface> items = null;
  @SerializedName("aggregations")
  private FrameworkSearchAggregationInterface aggregations = null;
  @SerializedName("search_criteria")
  private FrameworkSearchSearchCriteriaInterface searchCriteria = null;
  @SerializedName("total_count")
  private Integer totalCount = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<FrameworkSearchDocumentInterface> getItems() {
    return items;
  }
  public void setItems(List<FrameworkSearchDocumentInterface> items) {
    this.items = items;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FrameworkSearchAggregationInterface getAggregations() {
    return aggregations;
  }
  public void setAggregations(FrameworkSearchAggregationInterface aggregations) {
    this.aggregations = aggregations;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FrameworkSearchSearchCriteriaInterface getSearchCriteria() {
    return searchCriteria;
  }
  public void setSearchCriteria(FrameworkSearchSearchCriteriaInterface searchCriteria) {
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
    FrameworkSearchSearchResultInterface frameworkSearchSearchResultInterface = (FrameworkSearchSearchResultInterface) o;
    return (this.items == null ? frameworkSearchSearchResultInterface.items == null : this.items.equals(frameworkSearchSearchResultInterface.items)) &&
        (this.aggregations == null ? frameworkSearchSearchResultInterface.aggregations == null : this.aggregations.equals(frameworkSearchSearchResultInterface.aggregations)) &&
        (this.searchCriteria == null ? frameworkSearchSearchResultInterface.searchCriteria == null : this.searchCriteria.equals(frameworkSearchSearchResultInterface.searchCriteria)) &&
        (this.totalCount == null ? frameworkSearchSearchResultInterface.totalCount == null : this.totalCount.equals(frameworkSearchSearchResultInterface.totalCount));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.items == null ? 0: this.items.hashCode());
    result = 31 * result + (this.aggregations == null ? 0: this.aggregations.hashCode());
    result = 31 * result + (this.searchCriteria == null ? 0: this.searchCriteria.hashCode());
    result = 31 * result + (this.totalCount == null ? 0: this.totalCount.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrameworkSearchSearchResultInterface {\n");
    
    sb.append("  items: ").append(items).append("\n");
    sb.append("  aggregations: ").append(aggregations).append("\n");
    sb.append("  searchCriteria: ").append(searchCriteria).append("\n");
    sb.append("  totalCount: ").append(totalCount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
