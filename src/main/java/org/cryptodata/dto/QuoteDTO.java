package org.cryptodata.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class QuoteDTO {

    @SerializedName("price")
    private Double price;

    @SerializedName("volume_24h")
    private Double volume24h;

    @SerializedName("volume_change_24h")
    private Double volumeChange24h;

    @SerializedName("percent_change_1h")
    private Double percentChange1h;

    @SerializedName("percent_change_24h")
    private Double percentChange24h;

    @SerializedName("percent_change_7d")
    private Double percentChange7d;

    @SerializedName("percent_change_30d")
    private Double percentChange30d;

    @SerializedName("percent_change_60d")
    private Double percentChange60d;

    @SerializedName("percent_change_90d")
    private Double percentChange90d;

    @SerializedName("market_cap")
    private Double marketCap;

    @SerializedName("market_cap_dominance")
    private Double marketCapDominance;

    @SerializedName("fully_diluted_market_cap")
    private Double fullyDilutedMarketCap;

    @SerializedName("tvl")
    private Double tvl;
}
