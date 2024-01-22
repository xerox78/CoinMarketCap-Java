package org.cryptodata.service.exchange.listing;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.service.exchange.listing.models.ListingLatestData;

import java.util.List;

public class ListingService extends ServiceOperation {
    private final CoinMarketCapUrlBuilder urlBuilder;

    public ListingService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        super(coinMarketCap, cryptocurrencyUrl);
        this.urlBuilder = cryptocurrencyUrl;
    }

    /**
     * Returns the exchange assets in the form of token holdings.
     */
    public List<ListingLatestData> latest() throws CoinMarketCapException {
        return sendHttpRequest(urlBuilder.latest().build(), getJavaTypeList(ListingLatestData.class));
    }

}