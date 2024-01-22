package org.cryptodata.service.crypto.category.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public record CategoryData(

        @JsonProperty("id") String id,

        @JsonProperty("name") String name,

        @JsonProperty("title") String title,

        @JsonProperty("description") String description,

        @JsonProperty("num_tokens") Integer numTokens,

        @JsonProperty("avg_price_change") Double avgPriceChange,

        @JsonProperty("market_cap") Double marketCap,

        @JsonProperty("market_cap_change") Double marketCapChange,

        @JsonProperty("volume") Double volume,

        @JsonProperty("volume_change") Double volumeChange,

        @JsonProperty("last_updated") Date lastUpdated
) {
}
