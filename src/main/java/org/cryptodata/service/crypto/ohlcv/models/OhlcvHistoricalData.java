package org.cryptodata.service.crypto.ohlcv.models;

import lombok.Data;

import java.util.List;

@Data
public class OhlcvHistoricalData {

    private Integer id;
    private String name;
    private String symbol;
    private List<OhlcvQuotes> quotes;

}
