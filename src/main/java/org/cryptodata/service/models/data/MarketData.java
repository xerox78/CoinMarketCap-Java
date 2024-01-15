package org.cryptodata.service.models.data;

import lombok.Data;

@Data
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
