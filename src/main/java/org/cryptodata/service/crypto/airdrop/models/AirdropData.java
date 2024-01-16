package org.cryptodata.service.crypto.airdrop.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class AirdropData {
    @JsonProperty("id")
    private String id;

    @JsonProperty("project_name")
    private String projectName;

    @JsonProperty("description")
    private String description;

    @JsonProperty("status")
    private AirdropStatus status;

    @JsonProperty("coin")
    private CoinData coinData;

    @JsonProperty("start_date")
    private Date startDate;

    @JsonProperty("end_date")
    private Date endDate;

    @JsonProperty("total_prize")
    private Long totalPrize;

    @JsonProperty("winner_count")
    private Integer winnerCount;

    @JsonProperty("link")
    private String link;
}
