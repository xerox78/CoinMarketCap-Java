package org.cryptodata.service.crypto.trending.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
public class TrendingData {

    private Integer id;
    private String name;
    private String symbol;
    private String slug;

    @JsonProperty("num_market_pairs")
    private Integer numMarketPairs;

    @JsonProperty("date_added")
    private Date dateAdded;

    private List<String> tags;

    @JsonProperty("max_supply")
    private Long maxSupply;

    @JsonProperty("circulating_supply")
    private Double circulatingSupply;

    @JsonProperty("total_supply")
    private Double totalSupply;

    @JsonProperty("infinite_supply")
    private boolean infiniteSupply;

    private TrendingPlatform platform;

    @JsonProperty("cmc_rank")
    private Integer cmcRank;

    @JsonProperty("self_reported_circulating_supply")
    private Double selfReportedCirculatingSupply;

    @JsonProperty("self_reported_market_supply")
    private Double selfReportedMarketSupply;

    @JsonProperty("tvl_ratio")
    private Double tvlRatio;

    @JsonProperty("last_update")
    private Date lastUpdate;

    private Map<String, TrendingQuote> quote;
}
