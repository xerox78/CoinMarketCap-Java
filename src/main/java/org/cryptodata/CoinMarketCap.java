package org.cryptodata;

import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;

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

}
