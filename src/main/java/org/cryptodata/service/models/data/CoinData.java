package org.cryptodata.service.models.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CoinData {
    @JsonProperty("id")
    private int id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("slug")
    private String slug;

    @JsonProperty("symbol")
    private String symbol;
}
