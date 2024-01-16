package org.cryptodata.service.crypto.metadata.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class MetadataInfoData {

    @JsonProperty("id")
    public int id;

    @JsonProperty("name")
    public String name;

    @JsonProperty("symbol")
    public String symbol;

    @JsonProperty("slug")
    public String slug;

    @JsonProperty("category")
    public String category;

    @JsonProperty("description")
    public String description;

    @JsonProperty("logo")
    public String logo;

    @JsonProperty("subreddit")
    public String subreddit;

    @JsonProperty("notice")
    public String notice;

    @JsonProperty("tags")
    public List<String> tags;

    @JsonProperty("tag-groups")
    public List<String> tagGroups;

    @JsonProperty("tag-names")
    public List<String> tagNames;

    @JsonProperty("urls")
    public Map<String, List<String>> urls;

    @JsonProperty("platform")
    public MetadataPlatform platform;

    @JsonProperty("date_added")
    public String dateAdded;

    @JsonProperty("twitter_username")
    public String twitterUsername;

    @JsonProperty("date_launched")
    public String dateLaunched;

    @JsonProperty("contract_address")
    public List<MetadataContractAddressData> contractAddress;

    @JsonProperty("self_reported_circulating_supply")
    public Double selfReportedCirculatingSupply;

    @JsonProperty("self_reported_market_cap")
    public Double selfReportedMarketCap;

    @JsonProperty("self_reported_tags")
    public List<String> selfReportedTags;

    @JsonProperty("infinite_supply")
    public Boolean infiniteSupply;


}
