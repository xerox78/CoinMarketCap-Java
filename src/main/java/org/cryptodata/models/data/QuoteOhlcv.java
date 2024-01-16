package org.cryptodata.models.data;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class QuoteOhlcv {

    private Double open;
    private Double high;
    private Double low;
    private Double close;
    private Double volume;
    @JsonProperty("market_cap")
    private Double marketCap;

    @JsonProperty("timestamp")
    @JsonAlias("last_updated")
    private Date timestamp;
}
