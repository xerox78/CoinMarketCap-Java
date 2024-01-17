package org.cryptodata.service.crypto.ohlcv;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapUrl;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.service.crypto.ohlcv.models.OhlcvHistoricalData;
import org.cryptodata.service.crypto.ohlcv.models.OhlcvLatestData;

import java.util.Map;

public class OhlcvService extends ServiceOperation {

    private final CoinMarketCapUrl.CoinMarketCapUrlBuilder urlBuilder;

    public OhlcvService(CoinMarketCap coinMarketCap, CoinMarketCapUrl.CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        super(coinMarketCap, cryptocurrencyUrl);
        this.urlBuilder = cryptocurrencyUrl;
    }

    /**
     * Returns historical OHLCV (Open, High, Low, Close, Volume) data along with market cap for any cryptocurrency using time interval parameters.
     *
     * @return OhlcvData
     */
    public Map<String, OhlcvHistoricalData> historical() throws CoinMarketCapException {
        return sendHttpRequest(urlBuilder.ohlcv().historical().build(), getJavaTypeMap(OhlcvHistoricalData.class));
    }

    /**
     * Returns the latest OHLCV (Open, High, Low, Close, Volume) market values for one or more cryptocurrencies for the current UTC day.
     *
     * @return OhlcvData
     */
    public Map<String, OhlcvLatestData> latest() throws CoinMarketCapException {
        return sendHttpRequest(urlBuilder.ohlcv().latest().build(), getJavaTypeMap(OhlcvLatestData.class));
    }
}
