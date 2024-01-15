package org.cryptodata.service.models.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PlatformData {

    private Integer id;

    private String name;

    private String symbol;

    private String slug;

    @JsonProperty("token_address")
    private String tokenAddress;
}
