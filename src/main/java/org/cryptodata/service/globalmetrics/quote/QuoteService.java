package org.cryptodata.service.globalmetrics.quote;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapUrl;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.service.globalmetrics.quote.models.QuoteHistoricalData;
import org.cryptodata.service.globalmetrics.quote.models.QuoteLatestData;

public class QuoteService extends ServiceOperation {

    private final CoinMarketCapUrl.CoinMarketCapUrlBuilder cryptocurrencyUrl;

    public QuoteService(CoinMarketCap coinMarketCap, CoinMarketCapUrl.CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        super(coinMarketCap, cryptocurrencyUrl);
        this.cryptocurrencyUrl = cryptocurrencyUrl;
    }

    public QuoteLatestData latest() throws CoinMarketCapException {
        return sendHttpRequest(cryptocurrencyUrl.quotes().latest().build(), getJavaType(QuoteLatestData.class));
    }

    public QuoteHistoricalData historical() throws CoinMarketCapException {
        return sendHttpRequest(cryptocurrencyUrl.quotes().historical().build(), getJavaType(QuoteHistoricalData.class));
    }
}
