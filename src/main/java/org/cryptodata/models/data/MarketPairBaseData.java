package org.cryptodata.models.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MarketPairBaseData {
    @JsonProperty("currency_id")
    private Integer currencyId;

    @JsonProperty("currency_symbol")
    private String currencySymbol;

    @JsonProperty("exchange_symbol")
    private String exchangeSymbol;

    @JsonProperty("currency_type")
    private String currencyType;
}
