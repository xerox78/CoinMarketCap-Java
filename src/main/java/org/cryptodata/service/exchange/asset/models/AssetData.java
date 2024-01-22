package org.cryptodata.service.exchange.asset.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigInteger;

public record AssetData(
        @JsonProperty("wallet_address") String walletAddress,
        BigInteger balance,
        AssetPlatform platform,
        AssetCurrency currency
) {
}
