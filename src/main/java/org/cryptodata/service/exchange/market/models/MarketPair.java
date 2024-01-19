package org.cryptodata.service.exchange.market.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public record MarketPair(
        Integer marketId,
        String marketPair,
        String category,
        String feeType,
        Integer outlierDetected,
        @JsonProperty("market_pair_base") MarketPairBase marketPairBase,
        @JsonProperty("market_pair_quote") MarketPairQuote marketPairQuote,
        @JsonProperty("quote") Map<String, MarketQuote> marketQuote

) {
}
