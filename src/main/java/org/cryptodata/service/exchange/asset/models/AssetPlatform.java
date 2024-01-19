package org.cryptodata.service.exchange.asset.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record AssetPlatform(
        @JsonProperty("crypto_id") Integer cryptoId,
        String symbol,
        String name
) {
}
