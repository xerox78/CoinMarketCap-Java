package org.cryptodata.models.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class MetadataData {
        @JsonProperty("urls")
        public Map<String, List<String>> urls;

        @JsonProperty("logo")
        public String logo;

        @JsonProperty("id")
        public int id;

        @JsonProperty("name")
        public String name;

        @JsonProperty("symbol")
        public String symbol;

        @JsonProperty("slug")
        public String slug;

        @JsonProperty("description")
        public String description;

        @JsonProperty("notice")
        public String notice;

        @JsonProperty("date_added")
        public String dateAdded;

        @JsonProperty("date_launched")
        public String dateLaunched;

        @JsonProperty("tags")
        public List<String> tags;

        @JsonProperty("platform")
        public PlatformData platform;

        @JsonProperty("category")
        public String category;

        @JsonProperty("self_reported_circulating_supply")
        public Double selfReportedCirculatingSupply;

        @JsonProperty("self_reported_market_cap")
        public Double selfReportedMarketCap;

        @JsonProperty("self_reported_tags")
        public List<String> selfReportedTags;

        @JsonProperty("infinite_supply")
        public boolean infiniteSupply;


}
