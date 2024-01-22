package org.cryptodata.service.crypto.metadata.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record MetadataCoin(
        @JsonProperty("id") int id,

        @JsonProperty("name") String name,

        @JsonProperty("slug") String slug,

        @JsonProperty("symbol") String symbol
) {

}
