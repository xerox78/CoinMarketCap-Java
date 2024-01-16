package org.cryptodata.service.crypto.quote.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.Map;

@Data
public class QuoteData {
    @JsonProperty("quote")
    private Map<String, QuoteConversionHistorical> quote;

    @JsonProperty("timestamp")
    private Date timestamp;
}
