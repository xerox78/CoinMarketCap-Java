package org.cryptodata.service.exchange.quote;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.service.exchange.quote.models.QuoteHistoricalData;
import org.cryptodata.service.exchange.quote.models.QuoteLatestData;

import java.util.Map;

public class QuoteService extends ServiceOperation {
    private final CoinMarketCapUrlBuilder urlBuilder;

    public QuoteService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        super(coinMarketCap, cryptocurrencyUrl);
        this.urlBuilder = cryptocurrencyUrl;
    }

    public Map<String, QuoteLatestData> latest() throws CoinMarketCapException {
        return sendHttpRequest(urlBuilder.latest().build(), getJavaTypeMap(QuoteLatestData.class));
    }

    public Map<String, QuoteHistoricalData> historical() throws CoinMarketCapException {
        return sendHttpRequest(urlBuilder.latest().build(), getJavaTypeMap(QuoteHistoricalData.class));
    }

}