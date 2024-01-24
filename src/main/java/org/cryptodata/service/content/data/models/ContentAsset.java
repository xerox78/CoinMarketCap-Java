package org.cryptodata.service.content.data.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ContentAsset(
        @JsonProperty("id") int id,
        @JsonProperty("name") String name,
        @JsonProperty("symbol") String symbol,
        @JsonProperty("slug") String slug
) {
}
