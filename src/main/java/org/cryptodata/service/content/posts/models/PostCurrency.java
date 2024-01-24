package org.cryptodata.service.content.posts.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record PostCurrency(
        @JsonProperty("id") int id,
        @JsonProperty("symbol") String symbol,
        @JsonProperty("slug") String slug
) {
}
