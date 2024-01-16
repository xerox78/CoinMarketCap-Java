package org.cryptodata;

import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;

public record CoinMarketCap(String apiKey) {

    /**
     * AirdropService class
     *
     * @return AirdropService
     */
    public CryptocurrencyService cryptocurrencyV1() {
        return new CryptocurrencyService(this, new CoinMarketCapUrlBuilder().v1().cryptocurrency());
    }

    /**
     * CryptocurrencyService class
     *
     * @return CryptocurrencyService
     */
    public CryptocurrencyService cryptocurrencyV2() {
        return new CryptocurrencyService(this, new CoinMarketCapUrlBuilder().v2().cryptocurrency());
    }

    /**
     * CryptocurrencyService class
     *
     * @return CryptocurrencyService
     */
    public CryptocurrencyService cryptocurrencyV3() {
        return new CryptocurrencyService(this, new CoinMarketCapUrlBuilder().v3().cryptocurrency());
    }

}
