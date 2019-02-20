package io.swagger.model;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 
 */
@ApiModel(description = "")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-19T13:22:33.560Z")

public class SendAlertEventPOSTRequest   {

  @JsonFormat(shape = JsonFormat.Shape.STRING, timezone = "GMT")
  private Date alertDateTime = new Date();
  private List<SMSAlertRequestItem> alertList;

  private String alertType;
  private String alertItemId;

  public String getAlertItemId() {
    return alertItemId;
  }

  public void setAlertItemId(String alertItemId) {
    this.alertItemId = alertItemId;
  }



  public Date getAlertDateTime()
  {
    return alertDateTime;
  }

  public void setAlertDateTime(Date alertDateTime)
  {
    this.alertDateTime = alertDateTime;
  }

  public List<SMSAlertRequestItem> getAlertList()
  {
    return alertList;
  }

  public void setAlertList(List<SMSAlertRequestItem> alertList)
  {
    this.alertList = alertList;
  }

  public String getAlertType()
  {
    return alertType;
  }

  public void setAlertType(String alertType)
  {
    this.alertType = alertType;
  }











}

