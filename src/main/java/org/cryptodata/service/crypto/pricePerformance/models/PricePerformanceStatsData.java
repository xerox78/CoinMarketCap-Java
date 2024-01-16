package org.cryptodata.service.crypto.pricePerformance.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.Map;

@Data
public class PricePerformanceStatsData {
    @JsonProperty("open_timestamp")
    private Date timeOpen;

    @JsonProperty("close_timestamp")
    private Date timeClose;

    @JsonProperty("high_timestamp")
    private Date timeHigh;

    @JsonProperty("low_timestamp")
    private Date timeLow;

    @JsonProperty("quote")
    private Map<String, PricePerformanceStatsQuote> quote;
}
