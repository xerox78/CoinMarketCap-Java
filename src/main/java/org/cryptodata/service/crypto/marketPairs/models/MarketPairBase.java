package org.cryptodata.service.crypto.marketPairs.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MarketPairBase {
    @JsonProperty("currency_id")
    private Integer currencyId;

    @JsonProperty("currency_symbol")
    private String currencySymbol;

    @JsonProperty("exchange_symbol")
    private String exchangeSymbol;

    @JsonProperty("currency_type")
    private String currencyType;
}
