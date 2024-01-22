package org.cryptodata.service.exchange.market.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public record MarketQuote(
        Double price,
        @JsonProperty("volume_24h_base") Double volume24hBase,
        @JsonProperty("volume_24h_quote") Double volume24hQuote,
        @JsonProperty("volume_percentage") Double volumePercentage,
        @JsonProperty("depth_negative_two") Double depthNegativeTwo,
        @JsonProperty("depth_positive_two") Double depthPositiveTwo,
        @JsonProperty("last_updated") Date lastUpdated
) {
}
