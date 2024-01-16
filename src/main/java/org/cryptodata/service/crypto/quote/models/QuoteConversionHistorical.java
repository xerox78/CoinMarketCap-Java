package org.cryptodata.service.crypto.quote.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public record QuoteConversionHistorical(
        @JsonProperty("percent_change_1h") Double percentChange1h,

        @JsonProperty("percent_change_24h") Double percentChange24h,

        @JsonProperty("percent_change_7d") Double percentChange7d,

        @JsonProperty("percent_change_30d") Double percentChange30d,

        @JsonProperty("price") Double price,

        @JsonProperty("volume_24h") Double volume24h,

        @JsonProperty("market_cap") Double marketCap,

        @JsonProperty("total_supply") Double totalSupply,

        @JsonProperty("circulating_supply") Double circulatingSupply,

        @JsonProperty("timestamp") Date timestamp
) {
}
