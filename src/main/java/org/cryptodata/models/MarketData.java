package org.cryptodata.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MarketData {

    private String symbol;
    private Double currentPrice;
    private Double priceChange24H;
    private Double priceChangePercentage24H;
    private Double highPrice24H;
    private Double lowPrice24H;
    private Double volume24H;
    private Double marketCap;
    private String lastUpdated;
}
