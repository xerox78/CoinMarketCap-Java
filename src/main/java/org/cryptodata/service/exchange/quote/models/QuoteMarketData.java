package org.cryptodata.service.exchange.quote.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public record QuoteMarketData(
        @JsonProperty("volume_24h") Double volume24h,
        @JsonProperty("timestamp") Date timestamp
) {
}
