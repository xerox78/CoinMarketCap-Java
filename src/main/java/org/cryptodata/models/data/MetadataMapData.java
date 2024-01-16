package org.cryptodata.models.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class MetadataMapData {
    @JsonProperty("id")
    public int id;

    @JsonProperty("rank")
    public int rank;

    @JsonProperty("name")
    public String name;

    @JsonProperty("symbol")
    public String symbol;

    @JsonProperty("slug")
    public String slug;

    @JsonProperty("is_active")
    public Boolean isActive;

    @JsonProperty("first_historical_data")
    public Date firstHistoricalData;

    @JsonProperty("last_historical_data")
    public Date lastHistoricalData;

    @JsonProperty("platform")
    public PlatformData platform;
}
