package org.cryptodata.service.crypto.pricePerformance.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public record PricePerformanceStatsQuote(
        @JsonProperty("open_timestamp") Date openDate,
        @JsonProperty("high_timestamp") Date highDate,
        @JsonProperty("low_timestamp") Date lowDate,
        @JsonProperty("close_timestamp") Date closeDate,
        Double open, Double high, Double low, Double close,
        @JsonProperty("percent_change") Double percentChange,
        @JsonProperty("price_change") Double priceChange
) {
}
