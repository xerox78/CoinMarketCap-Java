package org.cryptodata.service.crypto;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.models.data.QuoteData;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;

public class QuoteService extends ServiceOperation {

    public QuoteService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        this.coinMarketCap = coinMarketCap;
        this.urlBuilder = cryptocurrencyUrl;
    }


    /**
     * Returns an interval of historic market quotes for any cryptocurrency based on time and interval parameters.
     *
     * @return QuoteData
     */
    public QuoteData historical() throws CoinMarketCapException {
        return sendRequest(urlBuilder.quotes().historical().build(), coinMarketCap.getApiKey(), getJavaType(QuoteData.class));
    }


    /**
     * Returns the latest market quote for 1 or more cryptocurrencies.
     *
     * @return QuoteData
     */
    public QuoteData latest() throws CoinMarketCapException {
        return sendRequest(urlBuilder.quotes().latest().build(), coinMarketCap.getApiKey(), getJavaType(QuoteData.class));
    }

}
