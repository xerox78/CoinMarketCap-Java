package org.cryptodata.models;

import lombok.Builder;
import lombok.Data;
import org.cryptodata.dto.DataDTO;
import org.cryptodata.dto.QuoteDTO;
import org.cryptodata.dto.ResponseDTO;

@Data
@Builder
public class Ticker {

    private Integer id;
    private String symbol;
    private Double price;
    private Double volume24h;
    private Double volumeChange24h;
    private Double change1h;
    private Double change24h;
    private Double change7d;
    private Double change30d;
    private Integer marketCap;
    private Double fullyDilutedMarketCap;

    public static Ticker fromDto(ResponseDTO body) {
        DataDTO dataDTO = body.getData().firstEntry().getValue();
        QuoteDTO quoteDTO = dataDTO.getQuote().firstEntry().getValue();
        return new TickerBuilder()
                .id(dataDTO.getId())
                .symbol(dataDTO.getSymbol())
                .price(quoteDTO.getPrice())
                .volume24h(quoteDTO.getVolume24h())
                .volumeChange24h(quoteDTO.getVolumeChange24h())
                .change1h(quoteDTO.getPercentChange1h())
                .change24h(quoteDTO.getPercentChange24h())
                .change7d(quoteDTO.getPercentChange7d())
                .change30d(quoteDTO.getPercentChange30d())
                .marketCap(quoteDTO.getMarketCap())
                .fullyDilutedMarketCap(quoteDTO.getFullyDilutedMarketCap())
                .build();
    }
}
