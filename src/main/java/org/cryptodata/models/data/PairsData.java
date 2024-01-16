package org.cryptodata.models.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Map;

@Data
public class PairsData {

    private ExchangeData exchange;

    @JsonProperty("market_id")
    private Integer marketId;

    @JsonProperty("market_pair")
    private String marketPair;

    @JsonProperty("category")
    private String category;

    @JsonProperty("fee_type")
    private String feeType;

    @JsonProperty("market_pair_base")
    private MarketPairBaseData marketPairBase;

    @JsonProperty("market_pair_quote")
    private MarketPairBaseData marketPairQuote;

    @JsonProperty("quote")
    private Map<String, QuoteMarketPair> quote;
}
