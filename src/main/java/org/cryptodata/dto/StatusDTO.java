package org.cryptodata.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class StatusDTO {

    @SerializedName("error_code")
    private Long errorCode;

    @SerializedName("error_message")
    private String errorMessage;

    @SerializedName("elapsed")
    private Long elapsed;
}
