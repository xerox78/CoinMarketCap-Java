package org.cryptodata.service.globalmetrics.quote.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public record QuoteHistorical(
        @JsonProperty("timestamp") String timestamp,
        @JsonProperty("btc_dominance") double btcDominance,
        @JsonProperty("active_cryptocurrencies") int activeCryptocurrencies,
        @JsonProperty("active_exchanges") int activeExchanges,
        @JsonProperty("active_market_pairs") int activeMarketPairs,
        @JsonProperty("quote") Map<String, QuoteHistoricalConverted> quote
) {
}
