package org.cryptodata.service.crypto.marketpairs;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.service.crypto.marketpairs.models.MarketPairsData;

public class MarketPairsService extends ServiceOperation {

    private final CoinMarketCapUrlBuilder urlBuilder;

    public MarketPairsService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        super(coinMarketCap, cryptocurrencyUrl);
        this.urlBuilder = cryptocurrencyUrl;
    }

    /**
     * Lists all active market pairs that CoinMarketCap tracks for a given cryptocurrency or fiat currency.
     *
     * @return MarketPairsData
     */
    public MarketPairsData latest() throws CoinMarketCapException {
        return sendHttpRequest(urlBuilder.marketPairs().latest().build(), getJavaType(MarketPairsData.class));
    }
}
