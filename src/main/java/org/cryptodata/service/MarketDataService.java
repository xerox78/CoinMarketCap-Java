package org.cryptodata.service;

import org.cryptodata.api.CoinMarketCapClient;

public class MarketDataService extends CoinMarketCapClient {
    public MarketDataService(String apiKey) {
        super(apiKey);
    }
}
