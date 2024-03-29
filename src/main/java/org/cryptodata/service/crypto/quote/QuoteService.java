package org.cryptodata.service.crypto.quote;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.crypto.quote.models.QuoteLatestData;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.service.crypto.quote.models.QuoteHistoricalData;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;

import java.util.Map;

public class QuoteService extends ServiceOperation {

    private final CoinMarketCapUrlBuilder urlBuilder;

    public QuoteService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        super(coinMarketCap, cryptocurrencyUrl);
        this.urlBuilder = cryptocurrencyUrl;
    }


    /**
     * Returns an interval of historic market quotes for any cryptocurrency based on time and interval parameters.
     *
     * @return QuoteData
     */
    public Map<String, QuoteHistoricalData> historical() throws CoinMarketCapException {
        return sendHttpRequest(urlBuilder.quotes().historical().build(), getJavaTypeMap(QuoteHistoricalData.class));
    }


    /**
     * Returns the latest market quote for 1 or more cryptocurrencies.
     *
     * @return QuoteData
     */
    public Map<String, QuoteLatestData> latest() throws CoinMarketCapException {
        return sendHttpRequest(urlBuilder.quotes().latest().build(), getJavaTypeMap(QuoteLatestData.class));
    }

}
