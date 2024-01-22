package org.cryptodata.service.key.info.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public record KeyPlanData(
        @JsonProperty("credit_limit_monthly") Integer creditLimitMonthly,
        @JsonProperty("credit_limit_monthly_reset") String creditLimitMonthlyReset,
        @JsonProperty("credit_limit_monthly_reset_timestamp") Date creditLimitMonthlyResetTimestamp,
        @JsonProperty("rate_limit_minute") Integer rateLimitMinute
) {
}
