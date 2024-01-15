package org.cryptodata.service.crypto;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.service.models.data.ListingData;

import java.util.List;

public class ListingService extends ServiceOperation {

    public ListingService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        this.coinMarketCap = coinMarketCap;
        this.urlBuilder = cryptocurrencyUrl;
    }


    /**
     * Returns a paginated list of all active cryptocurrencies with latest market data.
     *
     * @return list of ListingData
     */
    public List<ListingData> latest() throws CoinMarketCapException {
        return sendRequest(urlBuilder.listings().latest().build(), coinMarketCap.getApiKey(), getJavaTypeList(ListingData.class));
    }


    /**
     * Returns a ranked and sorted list of all cryptocurrencies for a historical UTC date.
     *
     * @return list of ListingData
     */
    public List<ListingData> historical() throws CoinMarketCapException {
        return sendRequest(urlBuilder.listings().historical().build(), coinMarketCap.getApiKey(), getJavaTypeList(ListingData.class));
    }


    /**
     * Returns a paginated list of most recently added cryptocurrencies.
     *
     * @return list of ListingData
     */
    public List<ListingData> listNew() throws CoinMarketCapException {
        return sendRequest(urlBuilder.listings().newPath().build(), coinMarketCap.getApiKey(), getJavaTypeList(ListingData.class));

    }
}
