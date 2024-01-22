package org.cryptodata.service.crypto.trending.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record TrendingPlatform(
        Integer id,

        String name,

        String symbol,

        String slug,

        @JsonProperty("token_address") String tokenAddress
) {
}
