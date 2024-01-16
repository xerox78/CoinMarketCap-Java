package org.cryptodata.service.crypto.quote.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;
import java.util.Map;

public record QuoteLatestData(
        @JsonProperty("id") Integer id,

        @JsonProperty("name") String name,

        @JsonProperty("symbol") String symbol,

        @JsonProperty("slug") String slug,

        @JsonProperty("num_market_pairs") Integer numMarketPairs,

        @JsonProperty("date_added") Date dateAdded,

        @JsonProperty("tags") List<QuoteTags> tags,

        @JsonProperty("max_supply") Long maxSupply,

        @JsonProperty("circulating_supply") Double circulatingSupply,

        @JsonProperty("total_supply") Double totalSupply,

        @JsonProperty("is_active") boolean isActive,

        @JsonProperty("infinite_supply") boolean infiniteSupply,

        @JsonProperty("platform") QuotePlatform platform,

        @JsonProperty("cmc_rank") Integer cmcRank,

        @JsonProperty("is_fiat") boolean isFiat,

        @JsonProperty("self_reported_circulating_supply") Double selfReportedCirculatingSupply,

        @JsonProperty("self_reported_market_cap") Double selfReportedMarketCap,

        @JsonProperty("tvl_ratio") Double tvlRatio,

        @JsonProperty("last_updated") Date lastUpdated,

        @JsonProperty("quote") Map<String, ConversionLatestData> quote
) {
}
