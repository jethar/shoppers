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

import io.swagger.client.model.FrameworkFilter;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Groups two or more filters together using a logical OR
 **/
@ApiModel(description = "Groups two or more filters together using a logical OR")
public class FrameworkSearchFilterGroup {
  
  @SerializedName("filters")
  private List<FrameworkFilter> filters = null;

  /**
   * A list of filters in this group
   **/
  @ApiModelProperty(value = "A list of filters in this group")
  public List<FrameworkFilter> getFilters() {
    return filters;
  }
  public void setFilters(List<FrameworkFilter> filters) {
    this.filters = filters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrameworkSearchFilterGroup frameworkSearchFilterGroup = (FrameworkSearchFilterGroup) o;
    return (this.filters == null ? frameworkSearchFilterGroup.filters == null : this.filters.equals(frameworkSearchFilterGroup.filters));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.filters == null ? 0: this.filters.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrameworkSearchFilterGroup {\n");
    
    sb.append("  filters: ").append(filters).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}