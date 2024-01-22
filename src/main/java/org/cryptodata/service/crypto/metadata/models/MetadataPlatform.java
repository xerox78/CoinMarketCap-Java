package org.cryptodata.service.crypto.metadata.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record MetadataPlatform(
        Integer id,
        String name,
        String symbol,
        String slug,
        @JsonProperty("token_address") String tokenAddress
) {
}
