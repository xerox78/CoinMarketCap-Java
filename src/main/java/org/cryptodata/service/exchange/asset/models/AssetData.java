package org.cryptodata.service.exchange.asset.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record AssetData(
        @JsonProperty("wallet_address") String walletAddress,
        Integer balance,
        AssetPlatform platform,
        AssetCurrency currency
) {
}
