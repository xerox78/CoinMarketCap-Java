package org.cryptodata.service.exchange.market;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.service.exchange.market.models.MarketLatestData;

import java.util.Map;

public class MarketPairService extends ServiceOperation {
    private final CoinMarketCapUrlBuilder urlBuilder;

    public MarketPairService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        super(coinMarketCap, cryptocurrencyUrl);
        this.urlBuilder = cryptocurrencyUrl;
    }

    public Map<String, MarketLatestData> latest() throws CoinMarketCapException {
        return sendHttpRequest(urlBuilder.marketPairs().latest().build(), getJavaTypeMap(MarketLatestData.class));
    }


}