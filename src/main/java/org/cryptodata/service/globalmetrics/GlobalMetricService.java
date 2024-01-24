package org.cryptodata.service.globalmetrics;


import org.cryptodata.CoinMarketCap;
import org.cryptodata.service.CoinMarketCapFilter;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;
import org.cryptodata.service.globalmetrics.quote.QuoteService;

/**
 * Represents a service for handling GlobalMetrics-related operations using CoinMarketCap API.
 *
 * @param coinMarketCap     The CoinMarketCap instance for API communication.
 * @param cryptocurrencyUrl The CoinMarketCapUrlBuilder instance for building related URLs.
 */
public record GlobalMetricService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {

    /**
     * Creates a CoinMarketCapFilter for QuoteService operations.
     *
     * @return CoinMarketCapFilter for QuoteService.
     */
    public CoinMarketCapFilter<QuoteService> quote() {
        return new CoinMarketCapFilter<>(new QuoteService(coinMarketCap, cryptocurrencyUrl));
    }
}