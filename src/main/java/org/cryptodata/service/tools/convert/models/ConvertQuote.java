package org.cryptodata.service.tools.convert.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public record ConvertQuote(
        Double price,
        @JsonProperty("last_updated") Date lastUpdated
) {
}
