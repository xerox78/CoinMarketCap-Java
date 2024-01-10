package org.cryptodata.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.TreeMap;


@Data
public class DataDTO {

    private Integer id;

    private String name;

    private String symbol;

    private String slug;

    @JsonProperty("num_market_pairs")
    private Long numMarketPairs;

    @JsonProperty("max_supply")
    private Double maxSupply;

    @JsonProperty("circulating_supply")
    private Double circulatingSupply;

    @JsonProperty("total_supply")
    private Double totalSupply;

    @JsonProperty("is_active")
    private Integer isActive;

    @JsonProperty("infinite_supply")
    private Boolean infiniteSupply;

    private String platform;

    @JsonProperty("cmc_rank")
    private Integer cmcRank;

    @JsonProperty("is_fiat")
    private Integer isFiat;

    @JsonProperty("tvl_ratio")
    private String tvlRatio;

    private TreeMap<String, QuoteDTO> quote;
}
