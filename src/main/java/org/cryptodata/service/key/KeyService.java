package org.cryptodata.service.key;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.service.key.info.models.KeyInfoData;

/**
 * Represents a service for handling key-related operations using CoinMarketCap API.
 */
public class KeyService extends ServiceOperation {
    private final CoinMarketCapUrlBuilder cryptocurrencyUrl;

    public KeyService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        super(coinMarketCap, cryptocurrencyUrl);
        this.cryptocurrencyUrl = cryptocurrencyUrl;
    }

    public KeyInfoData info() throws CoinMarketCapException {
        return sendHttpRequest(cryptocurrencyUrl.info().build(), getJavaType(KeyInfoData.class));
    }
}