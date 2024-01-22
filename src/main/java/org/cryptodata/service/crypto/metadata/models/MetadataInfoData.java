package org.cryptodata.service.crypto.metadata.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public record MetadataInfoData(
        @JsonProperty("id") int id,

        @JsonProperty("name") String name,

        @JsonProperty("symbol") String symbol,

        @JsonProperty("slug") String slug,

        @JsonProperty("category") String category,

        @JsonProperty("description") String description,

        @JsonProperty("logo") String logo,

        @JsonProperty("subreddit") String subreddit,

        @JsonProperty("notice") String notice,

        @JsonProperty("tags") List<String> tags,

        @JsonProperty("tag-groups") List<String> tagGroups,

        @JsonProperty("tag-names") List<String> tagNames,

        @JsonProperty("urls") Map<String, List<String>> urls,

        @JsonProperty("platform") MetadataPlatform platform,

        @JsonProperty("date_added") String dateAdded,

        @JsonProperty("twitter_username") String twitterUsername,

        @JsonProperty("date_launched") String dateLaunched,

        @JsonProperty("contract_address") List<MetadataContractAddressData> contractAddress,

        @JsonProperty("self_reported_circulating_supply") Double selfReportedCirculatingSupply,

        @JsonProperty("self_reported_market_cap") Double selfReportedMarketCap,

        @JsonProperty("self_reported_tags") List<String> selfReportedTags,

        @JsonProperty("infinite_supply") Boolean infiniteSupply
) {
}
