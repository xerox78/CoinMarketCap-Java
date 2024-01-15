package org.cryptodata.service.crypto;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapUrl;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.models.data.PricePerformanceStatsData;

public class PricePerformanceStatsService extends ServiceOperation {

    public PricePerformanceStatsService(CoinMarketCap coinMarketCap, CoinMarketCapUrl.CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        this.coinMarketCap = coinMarketCap;
        this.urlBuilder = cryptocurrencyUrl;
    }

    /**
     * Returns price performance statistics for one or more cryptocurrencies including launch price ROI and all-time high / all-time low.
     *
     * @return PricePerformanceStatsData
     */
    public PricePerformanceStatsData latest() throws CoinMarketCapException {
        return sendRequest(urlBuilder.pricePerformanceStats().latest().build(), coinMarketCap.getApiKey(), getJavaTypeMap(PricePerformanceStatsData.class));

    }
}
