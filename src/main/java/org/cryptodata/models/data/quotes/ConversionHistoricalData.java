package org.cryptodata.models.data.quotes;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class ConversionHistoricalData {

    @JsonProperty("percent_change_1h")
    private Double percentChange1h;

    @JsonProperty("percent_change_24h")
    private Double percentChange24h;

    @JsonProperty("percent_change_7d")
    private Double percentChange7d;

    @JsonProperty("percent_change_30d")
    private Double percentChange30d;

    @JsonProperty("price")
    private Double price;

    @JsonProperty("volume_24h")
    private Double volume24h;

    @JsonProperty("market_cap")
    private Double marketCap;

    @JsonProperty("total_supply")
    private Double totalSupply;

    @JsonProperty("circulating_supply")
    private Double circulatingSupply;

    @JsonProperty("timestamp")
    private Date timestamp;
}
