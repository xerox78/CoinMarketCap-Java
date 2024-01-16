package org.cryptodata.service.crypto.trending.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;
import java.util.Map;

public record TrendingData(
        Integer id, String name, String symbol, String slug,

        @JsonProperty("num_market_pairs") Integer numMarketPairs,

        @JsonProperty("date_added") Date dateAdded,
        List<String> tags,

        @JsonProperty("max_supply") Long maxSupply,

        @JsonProperty("circulating_supply") Double circulatingSupply,

        @JsonProperty("total_supply") Double totalSupply,

        @JsonProperty("infinite_supply") boolean infiniteSupply,
        TrendingPlatform platform,

        @JsonProperty("cmc_rank") Integer cmcRank,

        @JsonProperty("self_reported_circulating_supply") Double selfReportedCirculatingSupply,

        @JsonProperty("self_reported_market_supply") Double selfReportedMarketSupply,

        @JsonProperty("tvl_ratio") Double tvlRatio,

        @JsonProperty("last_update") Date lastUpdate,
        Map<String, TrendingQuote> quote
) {

}
