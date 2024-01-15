package org.cryptodata.models.data;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class MapData {
    @JsonProperty("id")
    private int id;

    @JsonProperty("rank")
    private int rank;

    @JsonProperty("name")
    private String name;

    @JsonProperty("symbol")
    private String symbol;

    @JsonProperty("slug")
    private String slug;

    @JsonProperty("is_active")
    private int isActive;

    @JsonProperty("first_historical_data")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private Date firstHistoricalData;

    @JsonProperty("last_historical_data")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private Date lastHistoricalData;

    @JsonProperty("platform")
    private PlatformData platform;
}
