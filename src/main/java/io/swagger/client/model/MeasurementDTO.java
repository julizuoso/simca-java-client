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
import io.swagger.client.model.PlaceDTO;
import io.swagger.client.model.PollutantsDTO;
import java.io.IOException;
import org.joda.time.DateTime;

/**
 * MeasurementDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-18T23:27:07.769-05:00")
public class MeasurementDTO {
  @SerializedName("date")
  private DateTime date = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("place")
  private PlaceDTO place = null;

  @SerializedName("pollutants")
  private PollutantsDTO pollutants = null;

  @SerializedName("time")
  private DateTime time = null;

  @SerializedName("userId")
  private String userId = null;

  public MeasurementDTO date(DateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Creation date of the measurement
   * @return date
  **/
  @ApiModelProperty(value = "Creation date of the measurement")
  public DateTime getDate() {
    return date;
  }

  public void setDate(DateTime date) {
    this.date = date;
  }

  public MeasurementDTO id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Autogenerated measurement id
   * @return id
  **/
  @ApiModelProperty(value = "Autogenerated measurement id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MeasurementDTO place(PlaceDTO place) {
    this.place = place;
    return this;
  }

   /**
   * Place where the measurement is made
   * @return place
  **/
  @ApiModelProperty(value = "Place where the measurement is made")
  public PlaceDTO getPlace() {
    return place;
  }

  public void setPlace(PlaceDTO place) {
    this.place = place;
  }

  public MeasurementDTO pollutants(PollutantsDTO pollutants) {
    this.pollutants = pollutants;
    return this;
  }

   /**
   * Pollutants list of the measurement
   * @return pollutants
  **/
  @ApiModelProperty(value = "Pollutants list of the measurement")
  public PollutantsDTO getPollutants() {
    return pollutants;
  }

  public void setPollutants(PollutantsDTO pollutants) {
    this.pollutants = pollutants;
  }

  public MeasurementDTO time(DateTime time) {
    this.time = time;
    return this;
  }

   /**
   * Creation time of the measurement
   * @return time
  **/
  @ApiModelProperty(value = "Creation time of the measurement")
  public DateTime getTime() {
    return time;
  }

  public void setTime(DateTime time) {
    this.time = time;
  }

  public MeasurementDTO userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The user who created the measurement
   * @return userId
  **/
  @ApiModelProperty(value = "The user who created the measurement")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasurementDTO measurementDTO = (MeasurementDTO) o;
    return Objects.equals(this.date, measurementDTO.date) &&
        Objects.equals(this.id, measurementDTO.id) &&
        Objects.equals(this.place, measurementDTO.place) &&
        Objects.equals(this.pollutants, measurementDTO.pollutants) &&
        Objects.equals(this.time, measurementDTO.time) &&
        Objects.equals(this.userId, measurementDTO.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, id, place, pollutants, time, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementDTO {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    pollutants: ").append(toIndentedString(pollutants)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
