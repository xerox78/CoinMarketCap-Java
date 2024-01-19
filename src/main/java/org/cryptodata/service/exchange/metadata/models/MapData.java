package org.cryptodata.service.exchange.metadata.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public record MapData(
        int id,
        String name,
        String slug,

        @JsonProperty("is_active") Boolean isActive,
        String status,
        @JsonProperty("first_historical_data") Date firstHistoricalData,
        @JsonProperty("last_historical_data") Date lastHistoricalData
) {
}
