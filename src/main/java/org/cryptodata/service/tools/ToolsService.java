package org.cryptodata.service.tools;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.service.CoinMarketCapFilter;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;
import org.cryptodata.service.tools.convert.ConvertService;

/**
 * Represents a service for handling tools-related operations using CoinMarketCap API.
 *
 * @param coinMarketCap     The CoinMarketCap instance for API communication.
 * @param cryptocurrencyUrl The CoinMarketCapUrlBuilder instance for building related URLs.
 */
public record ToolsService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {

    /**
     * Creates a CoinMarketCapFilter for ConvertService operations.
     *
     * @return CoinMarketCapFilter for ConvertService.
     */
    public CoinMarketCapFilter<ConvertService> convert() {
        return new CoinMarketCapFilter<>(new ConvertService(coinMarketCap, cryptocurrencyUrl));
    }
}
