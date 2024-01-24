package org.cryptodata.service.community;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.service.CoinMarketCapFilter;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;
import org.cryptodata.service.community.trending.TrendingService;

/**
 * Represents a service for handling community-related operations using CoinMarketCap API.
 *
 * @param coinMarketCap     The CoinMarketCap instance for API communication.
 * @param cryptocurrencyUrl The CoinMarketCapUrlBuilder instance for building related URLs.
 */
public record CommunityService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {

    /**
     * Creates a CoinMarketCapFilter for TrendingService operations.
     *
     * @return CoinMarketCapFilter for TrendingService.
     */
    public CoinMarketCapFilter<TrendingService> trending() {
        return new CoinMarketCapFilter<>(new TrendingService(coinMarketCap, cryptocurrencyUrl));
    }
}
