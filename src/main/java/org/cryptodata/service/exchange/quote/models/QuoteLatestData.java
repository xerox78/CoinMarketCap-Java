package org.cryptodata.service.exchange.quote.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.Map;

public record QuoteLatestData(
        Integer id,
        String name,
        String slug,
        @JsonProperty("num_coins") Integer numCoins,
        @JsonProperty("num_market_pairs") Integer numMarketPairs,
        @JsonProperty("last_updated") Date lastUpdated,
        @JsonProperty("traffic_score") Integer trafficScore,
        @JsonProperty("rank") Integer rank,
        @JsonProperty("exchange_score") Double exchangeScore,
        @JsonProperty("liquidity_score") Double liquidityScore,
        @JsonProperty("quote") Map<String, LatestData> quote
) {
}
