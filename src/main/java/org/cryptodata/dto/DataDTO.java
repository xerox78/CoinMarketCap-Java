package org.cryptodata.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.Map;


@Data
public class DataDTO {

    private long id;

    private String name;

    private String symbol;

    private String slug;

    @SerializedName("num_market_pairs")
    private Long numMarketPairs;

    @SerializedName("max_supply")
    private Double maxSupply;

    @SerializedName("circulating_supply")
    private Double circulatingSupply;

    @SerializedName("total_supply")
    private Double totalSupply;

    @SerializedName("is_active")
    private Integer isActive;

    @SerializedName("infinite_supply")
    private boolean infiniteSupply;

    private String platform;

    @SerializedName("cmc_rank")
    private Integer cmcRank;

    @SerializedName("is_fiat")
    private Integer isFiat;

    @SerializedName("tvl_ratio")
    private String tvlRatio;

    private Map<String, QuoteDTO> quote;
}
