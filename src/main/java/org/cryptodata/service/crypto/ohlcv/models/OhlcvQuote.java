package org.cryptodata.service.crypto.ohlcv.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public record OhlcvQuote(
        Double open,
        Double high,
        Double low,
        Double close,
        Double volume,
        @JsonProperty("market_cap") Double marketCap,
        @JsonProperty("timestamp") @JsonAlias("last_updated") Date timestamp
) {
}
