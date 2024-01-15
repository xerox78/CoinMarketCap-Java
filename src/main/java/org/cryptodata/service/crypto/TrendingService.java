package org.cryptodata.service.crypto;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapUrl;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.service.models.data.AirdropData;
import org.cryptodata.service.models.data.ListingData;

import java.util.List;

public class TrendingService extends ServiceOperation
{
    public TrendingService(CoinMarketCap coinMarketCap, CoinMarketCapUrl.CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        this.coinMarketCap = coinMarketCap;
        this.urlBuilder = cryptocurrencyUrl;
    }

    /**
     * Returns a paginated list of all trending cryptocurrencies, determined and sorted by the largest price gains or losses.
     *
     * @return instance of CoinMarketCapFilter
     */
    public List<ListingData> gainersLosers() throws CoinMarketCapException {
        return sendRequest(urlBuilder.trending().gainersLosers().build(), coinMarketCap.getApiKey(), getJavaTypeList(ListingData.class));

    }

    /**
     * Returns a paginated list of all trending cryptocurrency market data, determined and sorted by CoinMarketCap search volume.
     *
     * @return instance of CoinMarketCapFilter
     */
    public List<AirdropData> latest() throws CoinMarketCapException {
        return sendRequest(urlBuilder.trending().latest().build(), coinMarketCap.getApiKey(), getJavaTypeList(ListingData.class));
    }

    /**
     * Returns a paginated list of all trending cryptocurrency market data, determined and sorted by traffic to coin detail pages.
     *
     * @return instance of CoinMarketCapFilter
     */
    public List<AirdropData> mostVisited() throws CoinMarketCapException {
        return sendRequest(urlBuilder.trending().mostVisited().build(), coinMarketCap.getApiKey(), getJavaTypeList(ListingData.class));
    }
}
