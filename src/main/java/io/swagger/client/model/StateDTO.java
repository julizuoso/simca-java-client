/*
 * API SIMCA
 * SIMCA API Client
 *
 * OpenAPI spec version: 1.0.4
 * Contact: pdgsimca@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * StateDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-19T00:57:09.000-05:00")
public class StateDTO {
  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("stateType")
  private String stateType = null;

  public StateDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * State&#39;s description
   * @return description
  **/
  @ApiModelProperty(value = "State's description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public StateDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Autogenerated state id
   * @return id
  **/
  @ApiModelProperty(value = "Autogenerated state id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StateDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * State&#39;s name
   * @return name
  **/
  @ApiModelProperty(value = "State's name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StateDTO stateType(String stateType) {
    this.stateType = stateType;
    return this;
  }

   /**
   * State&#39;s type. USER_STATE, PRR_STATE or EMAIL_CONFIRMATION_STATE
   * @return stateType
  **/
  @ApiModelProperty(value = "State's type. USER_STATE, PRR_STATE or EMAIL_CONFIRMATION_STATE")
  public String getStateType() {
    return stateType;
  }

  public void setStateType(String stateType) {
    this.stateType = stateType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StateDTO stateDTO = (StateDTO) o;
    return Objects.equals(this.description, stateDTO.description) &&
        Objects.equals(this.id, stateDTO.id) &&
        Objects.equals(this.name, stateDTO.name) &&
        Objects.equals(this.stateType, stateDTO.stateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, name, stateType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateDTO {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    stateType: ").append(toIndentedString(stateType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

