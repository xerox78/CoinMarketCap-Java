package org.cryptodata.service.crypto.quote.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class QuoteHistoricalData {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("symbol")
    private String symbol;

    @JsonProperty("is_active")
    private boolean isActive;

    @JsonProperty("is_fiat")
    private boolean isFiat;

    @JsonProperty("quotes")
    private List<QuoteData> quotes;
}
