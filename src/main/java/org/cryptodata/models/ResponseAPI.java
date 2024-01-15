package org.cryptodata.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ResponseAPI<T> {


    @JsonProperty("status")
    private ResponseStatus status;

    @JsonProperty("data")
    private T data;
}
