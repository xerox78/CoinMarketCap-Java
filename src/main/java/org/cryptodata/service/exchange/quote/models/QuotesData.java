package org.cryptodata.service.exchange.quote.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.Map;

public record QuotesData(
        Date timestamp,
        Map<String, QuoteMarketData> quote,
        @JsonProperty("num_market_pairs") Integer numMarketPairs
) {
}
