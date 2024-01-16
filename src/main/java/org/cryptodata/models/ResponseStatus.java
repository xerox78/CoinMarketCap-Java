package org.cryptodata.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ResponseStatus(
        @JsonProperty("error_code") Long errorCode,

        @JsonProperty("error_message") String errorMessage,

        @JsonProperty("elapsed") Long elapsed
) {

}
