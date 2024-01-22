package org.cryptodata.service.key.info;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.service.key.info.models.KeyInfoData;

public class KeyInfoService extends ServiceOperation {
    private final CoinMarketCapUrlBuilder cryptocurrencyUrl;

    public KeyInfoService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        super(coinMarketCap, cryptocurrencyUrl);
        this.cryptocurrencyUrl = cryptocurrencyUrl;
    }

    public KeyInfoData info() throws CoinMarketCapException {
        return sendHttpRequest(cryptocurrencyUrl.map().build(), getJavaType(KeyInfoData.class));
    }
}
