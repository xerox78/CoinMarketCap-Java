package org.cryptodata.service.crypto.marketPairs.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Map;

@Data
public class MarketPairsPairs {

    private MarketPairsExchange exchange;

    @JsonProperty("market_id")
    private Integer marketId;

    @JsonProperty("market_pair")
    private String marketPair;

    @JsonProperty("category")
    private String category;

    @JsonProperty("fee_type")
    private String feeType;

    @JsonProperty("market_pair_base")
    private MarketPairBase marketPairBase;

    @JsonProperty("market_pair_quote")
    private MarketPairBase marketPairQuote;

    @JsonProperty("quote")
    private Map<String, MarketPairsQuote> quote;
}
