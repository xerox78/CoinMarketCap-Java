package org.cryptodata.service.crypto.trending.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public record TrendingQuote(
        @JsonProperty("percent_change_1h") Double percentChange1h,

        @JsonProperty("percent_change_24h") Double percentChange24h,

        @JsonProperty("percent_change_7d") Double percentChange7d,

        @JsonProperty("price") Double price,

        @JsonProperty("volume_24h") Double volume24h,

        @JsonProperty("market_cap") Double marketCap,

        @JsonProperty("last_updated") Date lastUpdated) {

}
