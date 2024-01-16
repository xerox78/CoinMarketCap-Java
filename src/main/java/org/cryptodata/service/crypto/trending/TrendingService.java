package org.cryptodata.service.crypto.trending;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapUrl;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.service.crypto.trending.models.TrendingData;

import java.util.List;

public class TrendingService extends ServiceOperation {
    public TrendingService(CoinMarketCap coinMarketCap, CoinMarketCapUrl.CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        this.coinMarketCap = coinMarketCap;
        this.urlBuilder = cryptocurrencyUrl;
    }

    /**
     * Returns a paginated list of all trending cryptocurrencies, determined and sorted by the largest price gains or losses.
     *
     * @return instance of CoinMarketCapFilter
     */
    public List<TrendingData> gainersLosers() throws CoinMarketCapException {
        return sendRequest(urlBuilder.trending().gainersLosers().build(), coinMarketCap.apiKey(), getJavaTypeList(TrendingData.class));

    }

    /**
     * Returns a paginated list of all trending cryptocurrency market data, determined and sorted by CoinMarketCap search volume.
     *
     * @return instance of CoinMarketCapFilter
     */
    public List<TrendingData> latest() throws CoinMarketCapException {
        return sendRequest(urlBuilder.trending().latest().build(), coinMarketCap.apiKey(), getJavaTypeList(TrendingData.class));
    }

    /**
     * Returns a paginated list of all trending cryptocurrency market data, determined and sorted by traffic to coin detail pages.
     *
     * @return instance of CoinMarketCapFilter
     */
    public List<TrendingData> mostVisited() throws CoinMarketCapException {
        return sendRequest(urlBuilder.trending().mostVisited().build(), coinMarketCap.apiKey(), getJavaTypeList(TrendingData.class));
    }
}
