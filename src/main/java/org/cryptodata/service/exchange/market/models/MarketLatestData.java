package org.cryptodata.service.exchange.market.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record MarketLatestData(
        Integer id,
        String name,
        String slug,
        Integer numMarketPairs,
        Double volume24h,
        @JsonProperty("market_pairs") List<MarketPair> marketPairsList
) {
}
