package org.cryptodata.models.data.quotes;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.cryptodata.models.data.PlatformData;
import org.cryptodata.models.data.TagsData;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
public class QuoteLatestData
{
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("symbol")
    private String symbol;

    @JsonProperty("slug")
    private String slug;

    @JsonProperty("num_market_pairs")
    private Integer numMarketPairs;

    @JsonProperty("date_added")
    private Date dateAdded;

    @JsonProperty("tags")
    private List<TagsData> tags;

    @JsonProperty("max_supply")
    private Long maxSupply;

    @JsonProperty("circulating_supply")
    private Double circulatingSupply;

    @JsonProperty("total_supply")
    private Double totalSupply;

    @JsonProperty("is_active")
    private boolean isActive;

    @JsonProperty("infinite_supply")
    private boolean infiniteSupply;

    @JsonProperty("platform")
    private PlatformData platform;

    @JsonProperty("cmc_rank")
    private Integer cmcRank;

    @JsonProperty("is_fiat")
    private boolean isFiat;

    @JsonProperty("self_reported_circulating_supply")
    private Double selfReportedCirculatingSupply;

    @JsonProperty("self_reported_market_cap")
    private Double selfReportedMarketCap;

    @JsonProperty("tvl_ratio")
    private Double tvlRatio;

    @JsonProperty("last_updated")
    private Date lastUpdated;

    @JsonProperty("quote")
    private Map<String, ConversionLatestData> quote;
}
