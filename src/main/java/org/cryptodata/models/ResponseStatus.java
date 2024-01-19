package org.cryptodata.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public record ResponseStatus(
        @JsonProperty("error_code") Long errorCode,

        @JsonProperty("error_message") String errorMessage,

        @JsonProperty("elapsed") Long elapsed,

        @JsonProperty("timestamp") Date timestamp,

        @JsonProperty("notice") String notice,

        @JsonProperty("credit_count") Integer creditCount
) {

}
