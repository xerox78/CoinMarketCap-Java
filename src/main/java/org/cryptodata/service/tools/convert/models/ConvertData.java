package org.cryptodata.service.tools.convert.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.Map;

public record ConvertData(
        String symbol,
        String id,
        String name,
        Double amount,
        @JsonProperty("last_updated") Date lastUpdated,
        Map<String, ConvertQuote> quote
) {
}
