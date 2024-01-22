package org.cryptodata.service.crypto.marketpairs.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public record MarketPairsPairs(
        MarketPairsExchange exchange,

        @JsonProperty("market_id") Integer marketId,

        @JsonProperty("market_pair") String marketPair,

        @JsonProperty("category") String category,

        @JsonProperty("fee_type") String feeType,

        @JsonProperty("market_pair_base") MarketPairBase marketPairBase,

        @JsonProperty("market_pair_quote") MarketPairBase marketPairQuote,

        @JsonProperty("quote") Map<String, MarketPairsQuote> quote
) {
}
