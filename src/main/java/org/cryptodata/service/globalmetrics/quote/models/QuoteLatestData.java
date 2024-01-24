package org.cryptodata.service.globalmetrics.quote.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public record QuoteLatestData(
        @JsonProperty("btc_dominance") double btcDominance,
        @JsonProperty("eth_dominance") double ethDominance,
        @JsonProperty("active_cryptocurrencies") int activeCryptocurrencies,
        @JsonProperty("total_cryptocurrencies") int totalCryptocurrencies,
        @JsonProperty("active_market_pairs") int activeMarketPairs,
        @JsonProperty("active_exchanges") int activeExchanges,
        @JsonProperty("total_exchanges") int totalExchanges,
        @JsonProperty("last_updated") String lastUpdated,
        @JsonProperty("quote") Map<String, QuoteLatest> quote
) {
}
