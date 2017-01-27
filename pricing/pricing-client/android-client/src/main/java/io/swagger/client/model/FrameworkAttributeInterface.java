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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Interface for custom attribute value.
 **/
@ApiModel(description = "Interface for custom attribute value.")
public class FrameworkAttributeInterface {
  
  @SerializedName("attribute_code")
  private String attributeCode = null;
  @SerializedName("value")
  private String value = null;

  /**
   * Attribute code
   **/
  @ApiModelProperty(required = true, value = "Attribute code")
  public String getAttributeCode() {
    return attributeCode;
  }
  public void setAttributeCode(String attributeCode) {
    this.attributeCode = attributeCode;
  }

  /**
   * Attribute value
   **/
  @ApiModelProperty(required = true, value = "Attribute value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrameworkAttributeInterface frameworkAttributeInterface = (FrameworkAttributeInterface) o;
    return (this.attributeCode == null ? frameworkAttributeInterface.attributeCode == null : this.attributeCode.equals(frameworkAttributeInterface.attributeCode)) &&
        (this.value == null ? frameworkAttributeInterface.value == null : this.value.equals(frameworkAttributeInterface.value));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.attributeCode == null ? 0: this.attributeCode.hashCode());
    result = 31 * result + (this.value == null ? 0: this.value.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrameworkAttributeInterface {\n");
    
    sb.append("  attributeCode: ").append(attributeCode).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}