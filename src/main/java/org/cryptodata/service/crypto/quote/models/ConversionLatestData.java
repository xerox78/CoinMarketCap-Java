package org.cryptodata.service.crypto.quote.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public record ConversionLatestData(
        @JsonProperty("percent_change_1h") Double percentChange1h,

        @JsonProperty("percent_change_24h") Double percentChange24h,

        @JsonProperty("percent_change_7d") Double percentChange7d,

        @JsonProperty("percent_change_30d") Double percentChange30d,

        @JsonProperty("percent_change_60d") Double percentChange60d,

        @JsonProperty("percent_change_90d") Double percentChange90d,

        @JsonProperty("price") Double price,

        @JsonProperty("volume_24h") Double volume24h,

        @JsonProperty("volume_change_24h") Double volumeChange24h,

        @JsonProperty("market_cap") Double marketCap,

        @JsonProperty("market_cap_dominance") Double marketCapDominance,

        @JsonProperty("fully_diluted_market_cap") Double fullyDilutedMarketCap,

        @JsonProperty("tvl") Double tvl,

        @JsonProperty("last_updated") Date lastUpdated
) {
}
