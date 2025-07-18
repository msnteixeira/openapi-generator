/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Must be named &#x60;File&#x60; for test.
 */
@ApiModel(description = "Must be named `File` for test.")
@JsonPropertyOrder({
  ModelFile.JSON_PROPERTY_SOURCE_U_R_I
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", comments = "Generator version: 7.15.0-SNAPSHOT")
public class ModelFile  implements Serializable {
  public static final String JSON_PROPERTY_SOURCE_U_R_I = "sourceURI";
  @JsonProperty(JSON_PROPERTY_SOURCE_U_R_I)
  private String sourceURI;

  public ModelFile sourceURI(String sourceURI) {
    this.sourceURI = sourceURI;
    return this;
  }

  /**
   * Test capitalization
   * @return sourceURI
   **/
  @JsonProperty(value = "sourceURI")
  @ApiModelProperty(value = "Test capitalization")
  
  public String getSourceURI() {
    return sourceURI;
  }

  public void setSourceURI(String sourceURI) {
    this.sourceURI = sourceURI;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelFile _file = (ModelFile) o;
    return Objects.equals(this.sourceURI, _file.sourceURI);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceURI);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelFile {\n");
    
    sb.append("    sourceURI: ").append(toIndentedString(sourceURI)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

