package org.cryptodata.service.crypto.marketPairs.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class MarketPairsQuote {
    private Integer price;

    @JsonProperty("volume_24h_base")
    @JsonAlias("volume_24h")
    private Double volume24h;

    @JsonProperty("volume_24h_quote")
    private Double volume24hQuote;

    @JsonProperty("last_updated")
    private Date lastUpdated;
}
