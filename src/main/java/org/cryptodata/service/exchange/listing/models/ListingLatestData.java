package org.cryptodata.service.exchange.listing.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;
import java.util.Map;

public record ListingLatestData(
        Integer id,
        String name,
        String slug,
        @JsonProperty("num_market_pairs") Integer numMarketPairs,
        List<String> fiats,
        @JsonProperty("traffic_score") Integer trafficScore,
        Integer rank,
        @JsonProperty("exchange_score") Double exchangeScore,
        @JsonProperty("liquidity_score") Double liquidityScore,
        @JsonProperty("last_updated") Date lastUpdated,
        Map<String, ListingQuote> quote
) {
}
