package org.cryptodata.service.crypto;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapUrl;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.models.data.MarketPairsData;

public class MarketPairsService extends ServiceOperation {

    public MarketPairsService(CoinMarketCap coinMarketCap, CoinMarketCapUrl.CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        this.coinMarketCap = coinMarketCap;
        this.urlBuilder = cryptocurrencyUrl;
    }

    /**
     * Lists all active market pairs that CoinMarketCap tracks for a given cryptocurrency or fiat currency.
     *
     * @return MarketPairsData
     */
    public MarketPairsData latest() throws CoinMarketCapException {
        return sendRequest(urlBuilder.marketPairs().latest().build(), coinMarketCap.apiKey(), getJavaType(MarketPairsData.class));
    }
}
