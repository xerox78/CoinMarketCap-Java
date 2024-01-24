package org.cryptodata.service.community.trending.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record TokenData(
        @JsonProperty("id") int id,
        @JsonProperty("name") String name,
        @JsonProperty("symbol") String symbol,
        @JsonProperty("slug") String slug,
        @JsonProperty("cmc_rank") int cmcRank,
        @JsonProperty("rank") int rank
) {
}
