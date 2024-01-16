package org.cryptodata.service.crypto.ohlcv.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.Map;

public record OhlcvLatestData(
        Integer id,
        String name,
        String symbol,
        @JsonProperty("last_updated") Date lastUpdated,
        @JsonProperty("time_open") Date timeOpen,
        @JsonProperty("time_close") Date timeClose,
        @JsonProperty("time_high") Date timeHigh,
        @JsonProperty("time_low") Date timeLow,
        @JsonProperty("quote") Map<String, OhlcvQuote> quote
) {
}
