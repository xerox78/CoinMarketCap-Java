package org.cryptodata;

import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;
import org.cryptodata.service.crypto.CryptocurrencyService;
import org.cryptodata.service.fiat.FiatService;

/*
 * This class provides methods to create instances of services groups.
 */
public record CoinMarketCap(String apiKey) {

    /**
     * Creates an instance of CryptocurrencyService for version 1 of the CoinMarketCap API.
     *
     * @return CryptocurrencyService instance for version 1.
     */
    public CryptocurrencyService cryptocurrencyV1() {
        return new CryptocurrencyService(this, new CoinMarketCapUrlBuilder().v1().cryptocurrency());
    }

    /**
     * Creates an instance of CryptocurrencyService for version 2 of the CoinMarketCap API.
     *
     * @return CryptocurrencyService instance for version 2.
     */
    public CryptocurrencyService cryptocurrencyV2() {
        return new CryptocurrencyService(this, new CoinMarketCapUrlBuilder().v2().cryptocurrency());
    }

    /**
     * Creates an instance of CryptocurrencyService for version 3 of the CoinMarketCap API.
     *
     * @return CryptocurrencyService instance for version 3.
     */
    public CryptocurrencyService cryptocurrencyV3() {
        return new CryptocurrencyService(this, new CoinMarketCapUrlBuilder().v3().cryptocurrency());
    }

    /**
     * Creates an instance of FiatService for version 1 of the CoinMarketCap API.
     *
     * @return FiatService instance for version 1.
     */
    public FiatService fiatV1() {
        return new FiatService(this, new CoinMarketCapUrlBuilder().v1().fiat());
    }

}
