package org.cryptodata.service.key;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.service.CoinMarketCapFilter;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;
import org.cryptodata.service.key.info.KeyInfoService;

/**
 * Represents a service for handling key-related operations using CoinMarketCap API.
 *
 * @param coinMarketCap     The CoinMarketCap instance for API communication.
 * @param cryptocurrencyUrl The CoinMarketCapUrlBuilder instance for building related URLs.
 */
public record KeyService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {

    /**
     * Creates a CoinMarketCapFilter for MapService operations.
     *
     * @return CoinMarketCapFilter for MapService.
     */
    public CoinMarketCapFilter<KeyInfoService> info() {
        return new CoinMarketCapFilter<>(new KeyInfoService(coinMarketCap, cryptocurrencyUrl));
    }
}