package org.cryptodata.service.crypto.marketPairs.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public record MarketPairsQuote(
        Integer price,
        @JsonProperty("volume_24h_base") @JsonAlias("volume_24h") Double volume24h,
        @JsonProperty("volume_24h_quote") Double volume24hQuote,
        @JsonProperty("last_updated") Date lastUpdated
) {
}
