package org.cryptodata.service.crypto.listing.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ListingPlatform {
    private Integer id;

    private String name;

    private String symbol;

    private String slug;

    @JsonProperty("token_address")
    private String tokenAddress;
}
