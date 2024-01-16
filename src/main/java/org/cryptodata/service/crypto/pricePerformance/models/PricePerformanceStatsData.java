package org.cryptodata.service.crypto.pricePerformance.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.Map;

public record PricePerformanceStatsData(
        @JsonProperty("open_timestamp") Date timeOpen,

        @JsonProperty("close_timestamp") Date timeClose,

        @JsonProperty("high_timestamp") Date timeHigh,

        @JsonProperty("low_timestamp") Date timeLow,

        @JsonProperty("quote") Map<String, PricePerformanceStatsQuote> quote
) {
}
