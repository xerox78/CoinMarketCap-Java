package org.cryptodata.models.data.quotes;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.Map;

@Data
public class QuotesData
{
    @JsonProperty("quote")
    private Map<String, ConversionHistoricalData> quote;

    @JsonProperty("timestamp")
    private Date timestamp;
}
