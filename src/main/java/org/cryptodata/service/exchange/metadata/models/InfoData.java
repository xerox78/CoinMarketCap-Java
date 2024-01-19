package org.cryptodata.service.exchange.metadata.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;
import java.util.Map;

public record InfoData(
        int id,
        String name,
        String slug,
        String logo,
        String description,
        @JsonProperty("date_launched") Date dateLaunched,
        String notice,
        List<String> countries,
        List<String> fiats,
        List<String> tags,
        String type,
        @JsonProperty("maker_fee") Double markerFee,
        @JsonProperty("taker_fee") Double takerFee,
        @JsonProperty("weekly_visits") Integer weeklyVisitors,
        @JsonProperty("spot_volume_usd") Double spotVolumeUsd,
        @JsonProperty("spot_volume_last_updated") Date spotVolumeLastUpdated,
        @JsonProperty("spot_volume_last_updated") Map<String, List<String>> urls
) {
}