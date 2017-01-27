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
 * Interface AttributeValidationRuleInterface
 **/
@ApiModel(description = "Interface AttributeValidationRuleInterface")
public class EavDataAttributeValidationRuleInterface {
  
  @SerializedName("key")
  private String key = null;
  @SerializedName("value")
  private String value = null;

  /**
   * Object key
   **/
  @ApiModelProperty(required = true, value = "Object key")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  /**
   * Object value
   **/
  @ApiModelProperty(required = true, value = "Object value")
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
    EavDataAttributeValidationRuleInterface eavDataAttributeValidationRuleInterface = (EavDataAttributeValidationRuleInterface) o;
    return (this.key == null ? eavDataAttributeValidationRuleInterface.key == null : this.key.equals(eavDataAttributeValidationRuleInterface.key)) &&
        (this.value == null ? eavDataAttributeValidationRuleInterface.value == null : this.value.equals(eavDataAttributeValidationRuleInterface.value));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.key == null ? 0: this.key.hashCode());
    result = 31 * result + (this.value == null ? 0: this.value.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EavDataAttributeValidationRuleInterface {\n");
    
    sb.append("  key: ").append(key).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}