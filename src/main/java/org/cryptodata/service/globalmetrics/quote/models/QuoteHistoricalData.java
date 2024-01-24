package org.cryptodata.service.globalmetrics.quote.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record QuoteHistoricalData(
        @JsonProperty("quotes") List<QuoteHistorical> quotes
) {

}
