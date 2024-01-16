package org.cryptodata.models.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class PricePerformanceStatsQuoteData {

    @JsonProperty("open_timestamp")
    private Date openDate;
    @JsonProperty("high_timestamp")
    private Date highDate;
    @JsonProperty("low_timestamp")
    private Date lowDate;
    @JsonProperty("close_timestamp")
    private Date closeDate;

    private Double open;
    private Double high;
    private Double low;
    private Double close;

    @JsonProperty("percent_change")
    private Double percentChange;

    @JsonProperty("price_change")
    private Double priceChange;


}
