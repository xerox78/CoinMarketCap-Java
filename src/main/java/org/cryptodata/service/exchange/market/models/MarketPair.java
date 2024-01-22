package org.cryptodata.service.exchange.market.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public record MarketPair(
        @JsonProperty("market_id") Integer marketId,
        @JsonProperty("market_pair") String marketPair,
        String category,
        @JsonProperty("fee_type") String feeType,
        @JsonProperty("outlier_detected") Integer outlierDetected,
        @JsonProperty("market_pair_base") MarketPairBase marketPairBase,
        @JsonProperty("market_pair_quote") MarketPairQuote marketPairQuote,
        @JsonProperty("quote") Map<String, MarketQuote> marketQuote

) {
}
