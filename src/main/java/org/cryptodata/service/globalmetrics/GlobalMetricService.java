package org.cryptodata.service.globalmetrics;


import org.cryptodata.CoinMarketCap;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;

/**
 * Represents a service for handling GlobalMetrics-related operations using CoinMarketCap API.
 *
 * @param coinMarketCap     The CoinMarketCap instance for API communication.
 * @param cryptocurrencyUrl The CoinMarketCapUrlBuilder instance for building related URLs.
 */
public record GlobalMetricService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {
    //TODO need to implement
    // v1/global-metrics/quotes/latest - Latest global metrics
    // v1/global-metrics/quotes/historical - Historical global metrics
}