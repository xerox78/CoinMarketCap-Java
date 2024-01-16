package org.cryptodata.service.crypto.airdrop.models;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public record AirdropData(
        @JsonProperty("id") String id,
        @JsonProperty("project_name") String projectName,
        @JsonProperty("description") String description,
        @JsonProperty("status") AirdropStatus status,
        @JsonProperty("coin") AirdropCoin airdropCoin,
        @JsonProperty("start_date") Date startDate,
        @JsonProperty("end_date") Date endDate,
        @JsonProperty("total_prize") Long totalPrize,
        @JsonProperty("winner_count") Integer winnerCount,
        @JsonProperty("link") String link

) {
}
