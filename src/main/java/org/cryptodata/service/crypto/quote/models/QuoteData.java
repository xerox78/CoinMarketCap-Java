package org.cryptodata.service.crypto.quote.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.Map;

public record QuoteData(
        @JsonProperty("quote") Map<String, QuoteConversionHistorical> quote,
        @JsonProperty("timestamp") Date timestamp
) {
}
