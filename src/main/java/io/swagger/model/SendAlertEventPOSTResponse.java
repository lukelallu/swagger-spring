package io.swagger.model;

import java.util.ArrayList;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 
 */
@ApiModel(description = "")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-19T13:22:33.560Z")

public class SendAlertEventPOSTResponse   {

  private String alertEventId;

  public ArrayList<ItemStatus> getItemStatuses() {
    return itemStatuses;
  }

  public void setItemStatuses(ArrayList<ItemStatus> itemStatuses) {
    this.itemStatuses = itemStatuses;
  }

  ArrayList< ItemStatus > itemStatuses = new ArrayList < ItemStatus > ();


  // Getter Methods

  public String getAlertEventId() {
    return alertEventId;
  }

  // Setter Methods

  public void setAlertEventId(String alertEventId) {
    this.alertEventId = alertEventId;
  }



  @JsonProperty("result")
  private String result = null;

  public SendAlertEventPOSTResponse result(String result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendAlertEventPOSTResponse sendAlertEventPOSTResponse = (SendAlertEventPOSTResponse) o;
    return Objects.equals(this.result, sendAlertEventPOSTResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result);
  }

  @Override
  public String toString() {
    return "SendAlertEventPOSTResponse{" +
            "alertEventId='" + alertEventId + '\'' +
            ", itemStatuses=" + itemStatuses +
            ", result='" + result + '\'' +
            '}';
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

