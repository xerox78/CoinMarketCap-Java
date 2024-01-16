package org.cryptodata.service.crypto;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapUrl;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.models.data.OhlcvHistoricalData;

import java.util.Map;

public class OhlcvService extends ServiceOperation {

    public OhlcvService(CoinMarketCap coinMarketCap, CoinMarketCapUrl.CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        this.coinMarketCap = coinMarketCap;
        this.urlBuilder = cryptocurrencyUrl;
    }

    /**
     * Returns historical OHLCV (Open, High, Low, Close, Volume) data along with market cap for any cryptocurrency using time interval parameters.
     *
     * @return OhlcvData
     */
    public Map<String, OhlcvHistoricalData> historical() throws CoinMarketCapException {
        return sendRequest(urlBuilder.ohlcv().historical().build(), coinMarketCap.apiKey(), getJavaTypeMap(OhlcvHistoricalData.class));
    }

    /**
     * Returns the latest OHLCV (Open, High, Low, Close, Volume) market values for one or more cryptocurrencies for the current UTC day.
     *
     * @return OhlcvData
     */
    public Map<String, OhlcvLatestData> latest() throws CoinMarketCapException {
        return sendRequest(urlBuilder.ohlcv().latest().build(), coinMarketCap.apiKey(), getJavaTypeMap(OhlcvLatestData.class));
    }
}
