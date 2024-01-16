package org.cryptodata.service.crypto.trending.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TrendingPlatform {

    private Integer id;

    private String name;

    private String symbol;

    private String slug;

    @JsonProperty("token_address")
    private String tokenAddress;
}
