package org.cryptodata.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StatusDTO {

    @JsonProperty("error_code")
    private Long errorCode;

    @JsonProperty("error_message")
    private String errorMessage;

    @JsonProperty("elapsed")
    private Long elapsed;
}
