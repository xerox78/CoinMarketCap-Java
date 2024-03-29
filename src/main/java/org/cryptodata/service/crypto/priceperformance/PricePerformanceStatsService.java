package org.cryptodata.service.crypto.priceperformance;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapUrl;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.service.crypto.priceperformance.models.PricePerformanceStatsData;

import java.util.Map;

public class PricePerformanceStatsService extends ServiceOperation {

    private final CoinMarketCapUrl.CoinMarketCapUrlBuilder urlBuilder;

    public PricePerformanceStatsService(CoinMarketCap coinMarketCap, CoinMarketCapUrl.CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        super(coinMarketCap, cryptocurrencyUrl);
        this.urlBuilder = cryptocurrencyUrl;
    }

    /**
     * Returns price performance statistics for one or more cryptocurrencies including launch price ROI and all-time high / all-time low.
     *
     * @return PricePerformanceStatsData
     */
    public Map<String, PricePerformanceStatsData> latest() throws CoinMarketCapException {
        return sendHttpRequest(urlBuilder.pricePerformanceStats().latest().build(), getJavaTypeMap(PricePerformanceStatsData.class));

    }
}
