package org.cryptodata.service.exchange.asset.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record AssetCurrency
        (
                @JsonProperty("crypto_id") Integer cryptoId,
                @JsonProperty("price_usd") Double priceUsd,
                String symbol,
                String name
        ) {
}
