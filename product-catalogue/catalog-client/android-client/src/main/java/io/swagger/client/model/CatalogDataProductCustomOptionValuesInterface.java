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

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * 
 **/
@ApiModel(description = "")
public class CatalogDataProductCustomOptionValuesInterface {
  
  @SerializedName("title")
  private String title = null;
  @SerializedName("sort_order")
  private Integer sortOrder = null;
  @SerializedName("price")
  private BigDecimal price = null;
  @SerializedName("price_type")
  private String priceType = null;
  @SerializedName("sku")
  private String sku = null;
  @SerializedName("option_type_id")
  private Integer optionTypeId = null;

  /**
   * Option title
   **/
  @ApiModelProperty(required = true, value = "Option title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Sort order
   **/
  @ApiModelProperty(required = true, value = "Sort order")
  public Integer getSortOrder() {
    return sortOrder;
  }
  public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

  /**
   * Price
   **/
  @ApiModelProperty(required = true, value = "Price")
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  /**
   * Price type
   **/
  @ApiModelProperty(required = true, value = "Price type")
  public String getPriceType() {
    return priceType;
  }
  public void setPriceType(String priceType) {
    this.priceType = priceType;
  }

  /**
   * Sku
   **/
  @ApiModelProperty(value = "Sku")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

  /**
   * Option type id
   **/
  @ApiModelProperty(value = "Option type id")
  public Integer getOptionTypeId() {
    return optionTypeId;
  }
  public void setOptionTypeId(Integer optionTypeId) {
    this.optionTypeId = optionTypeId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogDataProductCustomOptionValuesInterface catalogDataProductCustomOptionValuesInterface = (CatalogDataProductCustomOptionValuesInterface) o;
    return (this.title == null ? catalogDataProductCustomOptionValuesInterface.title == null : this.title.equals(catalogDataProductCustomOptionValuesInterface.title)) &&
        (this.sortOrder == null ? catalogDataProductCustomOptionValuesInterface.sortOrder == null : this.sortOrder.equals(catalogDataProductCustomOptionValuesInterface.sortOrder)) &&
        (this.price == null ? catalogDataProductCustomOptionValuesInterface.price == null : this.price.equals(catalogDataProductCustomOptionValuesInterface.price)) &&
        (this.priceType == null ? catalogDataProductCustomOptionValuesInterface.priceType == null : this.priceType.equals(catalogDataProductCustomOptionValuesInterface.priceType)) &&
        (this.sku == null ? catalogDataProductCustomOptionValuesInterface.sku == null : this.sku.equals(catalogDataProductCustomOptionValuesInterface.sku)) &&
        (this.optionTypeId == null ? catalogDataProductCustomOptionValuesInterface.optionTypeId == null : this.optionTypeId.equals(catalogDataProductCustomOptionValuesInterface.optionTypeId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.title == null ? 0: this.title.hashCode());
    result = 31 * result + (this.sortOrder == null ? 0: this.sortOrder.hashCode());
    result = 31 * result + (this.price == null ? 0: this.price.hashCode());
    result = 31 * result + (this.priceType == null ? 0: this.priceType.hashCode());
    result = 31 * result + (this.sku == null ? 0: this.sku.hashCode());
    result = 31 * result + (this.optionTypeId == null ? 0: this.optionTypeId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogDataProductCustomOptionValuesInterface {\n");
    
    sb.append("  title: ").append(title).append("\n");
    sb.append("  sortOrder: ").append(sortOrder).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  priceType: ").append(priceType).append("\n");
    sb.append("  sku: ").append(sku).append("\n");
    sb.append("  optionTypeId: ").append(optionTypeId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
