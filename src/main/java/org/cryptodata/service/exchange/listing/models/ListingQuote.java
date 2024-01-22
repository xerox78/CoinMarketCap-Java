package org.cryptodata.service.exchange.listing.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ListingQuote(
        @JsonProperty("volume_24h") Double volume24h,
        @JsonProperty("volume_24h_adjusted") Double volume24hAdjusted,
        @JsonProperty("volume_7d") Double volume7d,
        @JsonProperty("volume_30d") Double volume30d,
        @JsonProperty("percent_change_volume_24h") Double percentChangeVolume24h,
        @JsonProperty("percent_change_volume_7d") Double percentChangeVolume7d,
        @JsonProperty("percent_change_volume_30d") Double percentChangeVolume30d,
        @JsonProperty("effective_liquidity_24h") Double effectiveLiquidity24h,
        @JsonProperty("derivative_volume_usd") Double derivativeVolumeUsd,
        @JsonProperty("spot_volume_usd") Double spotVolumeUsd
) {
}
