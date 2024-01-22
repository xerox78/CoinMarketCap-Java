package org.cryptodata.service.crypto.quote.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record QuotePlatform(
        Integer id,

        String name,

        String symbol,

        String slug,

        @JsonProperty("token_address") String tokenAddress
) {
}
