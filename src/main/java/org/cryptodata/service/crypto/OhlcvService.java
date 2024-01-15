package org.cryptodata.service.crypto;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapUrl;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.service.models.data.OhlcvData;

import java.util.List;

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
    public OhlcvData historical() throws CoinMarketCapException {
        return sendRequest(urlBuilder.ohlcv().historical().build(), coinMarketCap.getApiKey(), getJavaType(OhlcvData.class));
    }

    /**
     * Returns the latest OHLCV (Open, High, Low, Close, Volume) market values for one or more cryptocurrencies for the current UTC day.
     *
     * @return OhlcvData
     */
    public List<OhlcvData> latest() throws CoinMarketCapException {
        return sendRequest(urlBuilder.ohlcv().latest().build(), coinMarketCap.getApiKey(), getJavaTypeList(OhlcvData.class));
    }
}
