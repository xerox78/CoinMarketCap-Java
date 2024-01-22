package org.cryptodata.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ResponseAPI<T>(
        @JsonProperty("status") ResponseStatus status,

        @JsonProperty("data") T data
) {
}
