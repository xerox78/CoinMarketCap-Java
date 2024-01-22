package org.cryptodata.service.key.info.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public record CurrentInfo(
        @JsonProperty("credits_used") @JsonAlias("requests_made") Integer made,
        @JsonProperty("credits_left") @JsonAlias("requests_left") Integer left
) {
}
