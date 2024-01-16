package org.cryptodata.service.crypto.ohlcv.models;

import java.util.List;

public record OhlcvHistoricalData(
        Integer id,
        String name,
        String symbol,
        List<OhlcvQuotes> quotes
) {


}
