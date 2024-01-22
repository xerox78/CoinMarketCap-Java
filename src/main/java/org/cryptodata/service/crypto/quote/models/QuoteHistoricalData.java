package org.cryptodata.service.crypto.quote.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record QuoteHistoricalData(
        @JsonProperty("id") Integer id,

        @JsonProperty("name") String name,

        @JsonProperty("symbol") String symbol,

        @JsonProperty("is_active") boolean isActive,

        @JsonProperty("is_fiat") boolean isFiat,

        @JsonProperty("quotes") List<QuoteData> quotes
) {
}
