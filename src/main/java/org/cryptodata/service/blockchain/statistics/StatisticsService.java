package org.cryptodata.service.blockchain.statistics;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.service.blockchain.statistics.models.StatisticsData;

import java.util.Map;

public class StatisticsService extends ServiceOperation {

    private final CoinMarketCapUrlBuilder cryptocurrencyUrl;

    public StatisticsService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        super(coinMarketCap, cryptocurrencyUrl);
        this.cryptocurrencyUrl = cryptocurrencyUrl;
    }

    public Map<String, StatisticsData> latest() throws CoinMarketCapException {
        return sendHttpRequest(cryptocurrencyUrl.statistics().latest().build(), getJavaTypeMap(StatisticsData.class));
    }
}
