package org.cryptodata.service.globalmetrics.quote.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record QuoteHistoricalConverted(
        @JsonProperty("total_market_cap") double totalMarketCap,
        @JsonProperty("total_volume_24h") double totalVolume24h,
        @JsonProperty("total_volume_24h_reported") double totalVolume24hReported,
        @JsonProperty("altcoin_market_cap") double altcoinMarketCap,
        @JsonProperty("altcoin_volume_24h") double altcoinVolume24h,
        @JsonProperty("altcoin_volume_24h_reported") double altcoinVolume24hReported,
        @JsonProperty("timestamp") String timestamp
) {
}
