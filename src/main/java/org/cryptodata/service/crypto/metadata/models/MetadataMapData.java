package org.cryptodata.service.crypto.metadata.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public record MetadataMapData(
        @JsonProperty("id") int id,

        @JsonProperty("rank") int rank,

        @JsonProperty("name") String name,

        @JsonProperty("symbol") String symbol,

        @JsonProperty("slug") String slug,

        @JsonProperty("is_active") Boolean isActive,

        @JsonProperty("first_historical_data") Date firstHistoricalData,

        @JsonProperty("last_historical_data") Date lastHistoricalData,

        @JsonProperty("platform") MetadataPlatform platform
) {
}
