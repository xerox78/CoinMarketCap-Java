package org.cryptodata.service.crypto.marketpairs.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record MarketPairsData(
        Integer id,
        String name,
        String symbol,
        @JsonProperty("num_market_pairs") Integer numMarketPairs,
        @JsonProperty("market_pairs") List<MarketPairsPairs> marketPairs
) {


}
