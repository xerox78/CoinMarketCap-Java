package org.cryptodata.service.content.data.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record ContentLatestData(
        @JsonProperty("cover") String cover,
        @JsonProperty("assets") List<ContentAsset> assets,
        @JsonProperty("created_at") String createdAt,
        @JsonProperty("released_at") String releasedAt,
        @JsonProperty("title") String title,
        @JsonProperty("subtitle") String subtitle,
        @JsonProperty("type") String type,
        @JsonProperty("source_name") String sourceName,
        @JsonProperty("source_url") String sourceUrl
) {
}
