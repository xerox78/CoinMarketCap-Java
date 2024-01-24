package org.cryptodata.service.fiat;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.service.CoinMarketCapFilter;
import org.cryptodata.service.CoinMarketCapUrl;
import org.cryptodata.service.fiat.map.MetadataService;

/**
 * Represents a service for handling fiat-related operations using CoinMarketCap API.
 *
 * @param coinMarketCap     The CoinMarketCap instance for API communication.
 * @param cryptocurrencyUrl The CoinMarketCapUrlBuilder instance for building related URLs.
 */
public record FiatService(CoinMarketCap coinMarketCap, CoinMarketCapUrl.CoinMarketCapUrlBuilder cryptocurrencyUrl) {

    /**
     * Creates a CoinMarketCapFilter for MapService operations.
     *
     * @return CoinMarketCapFilter for MapService.
     */
    public CoinMarketCapFilter<MetadataService> metadata() {
        return new CoinMarketCapFilter<>(new MetadataService(coinMarketCap, cryptocurrencyUrl));
    }
}