package org.cryptodata.service.crypto.ohlcv.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.Map;

@Data
public class OhlcvLatestData {
    private Integer id;
    private String name;
    private String symbol;

    @JsonProperty("last_updated")
    private Date lastUpdated;

    @JsonProperty("time_open")
    private Date timeOpen;

    @JsonProperty("time_close")
    private Date timeClose;

    @JsonProperty("time_high")
    private Date timeHigh;

    @JsonProperty("time_low")
    private Date timeLow;

    @JsonProperty("quote")
    private Map<String, OhlcvQuote> quote;
}
