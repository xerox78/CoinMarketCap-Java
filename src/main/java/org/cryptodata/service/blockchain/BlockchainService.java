package org.cryptodata.service.blockchain;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.service.CoinMarketCapFilter;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;
import org.cryptodata.service.blockchain.statistics.StatisticsService;

/**
 * Represents a service for handling blockchain-related operations using CoinMarketCap API.
 *
 * @param coinMarketCap     The CoinMarketCap instance for API communication.
 * @param cryptocurrencyUrl The CoinMarketCapUrlBuilder instance for building related URLs.
 */
public record BlockchainService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {

    /**
     * Creates a CoinMarketCapFilter for Statistics operations.
     *
     * @return CoinMarketCapFilter for StatisticsService.
     */
    public CoinMarketCapFilter<StatisticsService> map() {
        return new CoinMarketCapFilter<>(new StatisticsService(coinMarketCap, cryptocurrencyUrl));
    }
}