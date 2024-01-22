package org.cryptodata.service.crypto.airdrop.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record AirdropCoin(
        @JsonProperty("id") int id,
        @JsonProperty("name") String name,
        @JsonProperty("slug") String slug,
        @JsonProperty("symbol") String symbol
) {
}
