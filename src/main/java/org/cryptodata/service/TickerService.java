package org.cryptodata.service;

import org.cryptodata.api.CoinMarketCapClient;

public class TickerService extends CoinMarketCapClient {
    public TickerService(String apiKey) {
        super(apiKey);
    }
}
