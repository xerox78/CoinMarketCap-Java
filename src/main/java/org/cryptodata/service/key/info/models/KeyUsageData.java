package org.cryptodata.service.key.info.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record KeyUsageData(
        @JsonProperty("current_minute") CurrentInfo currentMinute,
        @JsonProperty("current_day") CurrentInfo currentDay,
        @JsonProperty("current_month") CurrentInfo currentMonth
) {
}
