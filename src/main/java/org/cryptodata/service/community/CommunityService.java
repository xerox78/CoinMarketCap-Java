package org.cryptodata.service.community;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;

/**
 * Represents a service for handling community-related operations using CoinMarketCap API.
 *
 * @param coinMarketCap     The CoinMarketCap instance for API communication.
 * @param cryptocurrencyUrl The CoinMarketCapUrlBuilder instance for building related URLs.
 */
public record CommunityService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {

    //TODO need to implement
    // /v1/community/trending/topic - Community Trending Topics
    // /v1/community/trending/token - Community Trending Tokens
}
