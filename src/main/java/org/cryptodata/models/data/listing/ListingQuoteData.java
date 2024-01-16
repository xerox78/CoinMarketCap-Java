package org.cryptodata.models.data.listing;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class ListingQuoteData
{
    @JsonProperty("percent_change_1h")
    private Double percentChange1h;

    @JsonProperty("percent_change_24h")
    private Double percentChange24h;

    @JsonProperty("percent_change_7d")
    private Double percentChange7d;

    @JsonProperty("price")
    private Double price;

    @JsonProperty("volume_24h")
    private Double volume24h;

    @JsonProperty("market_cap")
    private Double marketCap;

    @JsonProperty("last_updated")
    private Date lastUpdated;
}
