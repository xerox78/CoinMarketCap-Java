package org.cryptodata.service.exchange.market.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record MarketPairQuote(
        @JsonProperty("currency_id") Integer currencyId,
        @JsonProperty("currency_symbol") String currencySymbol,
        @JsonProperty("exchange_symbol") String exchangeSymbol,
        @JsonProperty("currency_type") String currencyType
) {
}
