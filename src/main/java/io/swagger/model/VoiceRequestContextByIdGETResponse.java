package io.swagger.model;

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

public class VoiceRequestContextByIdGETResponse   {
  @JsonProperty("result")
  private String result = null;

  public VoiceRequestContextByIdGETResponse result(String result) {
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
    VoiceRequestContextByIdGETResponse voiceRequestContextByIdGETResponse = (VoiceRequestContextByIdGETResponse) o;
    return Objects.equals(this.result, voiceRequestContextByIdGETResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoiceRequestContextByIdGETResponse {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

