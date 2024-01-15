package org.cryptodata.models.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CategoryData {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("title")
    private String title;

    @JsonProperty("description")
    private String description;

    @JsonProperty("num_tokens")
    private Integer numTokens;

    @JsonProperty("avg_price_change")
    private Double avgPriceChange;

    @JsonProperty("market_cap")
    private Double marketCap;

    @JsonProperty("market_cap_change")
    private Double marketCapChange;

    @JsonProperty("volume")
    private Double volume;

    @JsonProperty("volume_change")
    private Double volumeChange;

    @JsonProperty("last_updated")
    private Long lastUpdated;
}
