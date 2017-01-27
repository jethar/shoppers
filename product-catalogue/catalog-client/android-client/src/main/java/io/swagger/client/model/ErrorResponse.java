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

import io.swagger.client.model.ErrorErrors;
import io.swagger.client.model.ErrorParameters;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ErrorResponse {
  
  @SerializedName("message")
  private String message = null;
  @SerializedName("errors")
  private ErrorErrors errors = null;
  @SerializedName("code")
  private Integer code = null;
  @SerializedName("parameters")
  private ErrorParameters parameters = null;
  @SerializedName("trace")
  private String trace = null;

  /**
   * Error message
   **/
  @ApiModelProperty(required = true, value = "Error message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ErrorErrors getErrors() {
    return errors;
  }
  public void setErrors(ErrorErrors errors) {
    this.errors = errors;
  }

  /**
   * Error code
   **/
  @ApiModelProperty(value = "Error code")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
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

  /**
   * Stack trace
   **/
  @ApiModelProperty(value = "Stack trace")
  public String getTrace() {
    return trace;
  }
  public void setTrace(String trace) {
    this.trace = trace;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return (this.message == null ? errorResponse.message == null : this.message.equals(errorResponse.message)) &&
        (this.errors == null ? errorResponse.errors == null : this.errors.equals(errorResponse.errors)) &&
        (this.code == null ? errorResponse.code == null : this.code.equals(errorResponse.code)) &&
        (this.parameters == null ? errorResponse.parameters == null : this.parameters.equals(errorResponse.parameters)) &&
        (this.trace == null ? errorResponse.trace == null : this.trace.equals(errorResponse.trace));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.message == null ? 0: this.message.hashCode());
    result = 31 * result + (this.errors == null ? 0: this.errors.hashCode());
    result = 31 * result + (this.code == null ? 0: this.code.hashCode());
    result = 31 * result + (this.parameters == null ? 0: this.parameters.hashCode());
    result = 31 * result + (this.trace == null ? 0: this.trace.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    
    sb.append("  message: ").append(message).append("\n");
    sb.append("  errors: ").append(errors).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  parameters: ").append(parameters).append("\n");
    sb.append("  trace: ").append(trace).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
