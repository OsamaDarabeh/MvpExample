/**
 * NANA Store API
 * API for NANA Store app
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.client.model;

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InlineResponse401 {
  
  @SerializedName("result")
  private List<?> result = null;
  @SerializedName("success")
  private Boolean success = null;
  @SerializedName("action")
  private String action = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<?> getResult() {
    return result;
  }
  public void setResult(List<?> result) {
    this.result = result;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse401 inlineResponse401 = (InlineResponse401) o;
    return (this.result == null ? inlineResponse401.result == null : this.result.equals(inlineResponse401.result)) &&
        (this.success == null ? inlineResponse401.success == null : this.success.equals(inlineResponse401.success)) &&
        (this.action == null ? inlineResponse401.action == null : this.action.equals(inlineResponse401.action));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.result == null ? 0: this.result.hashCode());
    result = 31 * result + (this.success == null ? 0: this.success.hashCode());
    result = 31 * result + (this.action == null ? 0: this.action.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse401 {\n");
    
    sb.append("  result: ").append(result).append("\n");
    sb.append("  success: ").append(success).append("\n");
    sb.append("  action: ").append(action).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}