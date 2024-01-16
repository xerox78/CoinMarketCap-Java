package org.cryptodata.service.crypto.marketPairs.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class MarketPairsData {

    private Integer id;
    private String name;
    private String symbol;

    @JsonProperty("num_market_pairs")
    private Integer numMarketPairs;

    @JsonProperty("market_pairs")
    private List<MarketPairsPairs> marketPairs;
}
