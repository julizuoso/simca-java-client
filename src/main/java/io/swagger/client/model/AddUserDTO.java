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
import io.swagger.client.model.AddUserProfileDTO;
import java.io.IOException;

/**
 * AddUserDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-18T23:27:07.769-05:00")
public class AddUserDTO {
  @SerializedName("email")
  private String email = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("profile")
  private AddUserProfileDTO profile = null;

  @SerializedName("username")
  private String username = null;

  public AddUserDTO email(String email) {
    this.email = email;
    return this;
  }

   /**
   * User&#39;s email
   * @return email
  **/
  @ApiModelProperty(value = "User's email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AddUserDTO password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Login password in the web and mobile apps
   * @return password
  **/
  @ApiModelProperty(value = "Login password in the web and mobile apps")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public AddUserDTO profile(AddUserProfileDTO profile) {
    this.profile = profile;
    return this;
  }

   /**
   * User&#39;s Profile information
   * @return profile
  **/
  @ApiModelProperty(value = "User's Profile information")
  public AddUserProfileDTO getProfile() {
    return profile;
  }

  public void setProfile(AddUserProfileDTO profile) {
    this.profile = profile;
  }

  public AddUserDTO username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Login name in the web and mobile apps
   * @return username
  **/
  @ApiModelProperty(value = "Login name in the web and mobile apps")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddUserDTO addUserDTO = (AddUserDTO) o;
    return Objects.equals(this.email, addUserDTO.email) &&
        Objects.equals(this.password, addUserDTO.password) &&
        Objects.equals(this.profile, addUserDTO.profile) &&
        Objects.equals(this.username, addUserDTO.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, password, profile, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddUserDTO {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
