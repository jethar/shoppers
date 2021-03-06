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

import io.swagger.client.model.ErrorParameters;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Error details
 **/
@ApiModel(description = "Error details")
public class ErrorErrorsItem {
  
  @SerializedName("message")
  private String message = null;
  @SerializedName("parameters")
  private ErrorParameters parameters = null;

  /**
   * Error message
   **/
  @ApiModelProperty(value = "Error message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ErrorParameters getParameters() {
    return parameters;
  }
  public void setParameters(ErrorParameters parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorErrorsItem errorErrorsItem = (ErrorErrorsItem) o;
    return (this.message == null ? errorErrorsItem.message == null : this.message.equals(errorErrorsItem.message)) &&
        (this.parameters == null ? errorErrorsItem.parameters == null : this.parameters.equals(errorErrorsItem.parameters));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.message == null ? 0: this.message.hashCode());
    result = 31 * result + (this.parameters == null ? 0: this.parameters.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorErrorsItem {\n");
    
    sb.append("  message: ").append(message).append("\n");
    sb.append("  parameters: ").append(parameters).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
