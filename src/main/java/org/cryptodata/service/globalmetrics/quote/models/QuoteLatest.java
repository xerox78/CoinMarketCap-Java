package org.cryptodata.service.globalmetrics.quote.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record QuoteLatest(
        @JsonProperty("total_market_cap") double totalMarketCap,
        @JsonProperty("total_volume_24h") double totalVolume24h,
        @JsonProperty("total_volume_24h_reported") double totalVolume24hReported,
        @JsonProperty("altcoin_volume_24h") double altcoinVolume24h,
        @JsonProperty("altcoin_volume_24h_reported") double altcoinVolume24hReported,
        @JsonProperty("altcoin_market_cap") double altcoinMarketCap,
        @JsonProperty("defi_volume_24h") double defiVolume24h,
        @JsonProperty("defi_volume_24h_reported") double defiVolume24hReported,
        @JsonProperty("defi_24h_percentage_change") double defi24hPercentageChange,
        @JsonProperty("defi_market_cap") double defiMarketCap,
        @JsonProperty("stablecoin_volume_24h") double stablecoinVolume24h,
        @JsonProperty("stablecoin_volume_24h_reported") double stablecoinVolume24hReported,
        @JsonProperty("stablecoin_24h_percentage_change") double stablecoin24hPercentageChange,
        @JsonProperty("stablecoin_market_cap") double stablecoinMarketCap,
        @JsonProperty("derivatives_volume_24h") double derivativesVolume24h,
        @JsonProperty("derivatives_volume_24h_reported") double derivativesVolume24hReported,
        @JsonProperty("derivatives_24h_percentage_change") double derivatives24hPercentageChange,
        @JsonProperty("last_updated") String lastUpdated,
        @JsonProperty("total_market_cap_yesterday") double totalMarketCapYesterday,
        @JsonProperty("total_volume_24h_yesterday") double totalVolume24hYesterday,
        @JsonProperty("total_market_cap_yesterday_percentage_change") double totalMarketCapYesterdayPercentageChange,
        @JsonProperty("total_volume_24h_yesterday_percentage_change") double totalVolume24hYesterdayPercentageChange

) {
}
