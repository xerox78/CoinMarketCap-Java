package org.cryptodata.service.content;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;

/**
 * Represents a service for handling Content-related operations using CoinMarketCap API.
 *
 * @param coinMarketCap     The CoinMarketCap instance for API communication.
 * @param cryptocurrencyUrl The CoinMarketCapUrlBuilder instance for building related URLs.
 */
public record ContentService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {

    //TODO need to implement
    // /v1/content/latest - Content latest
    // /v1/content/posts/top - Content top posts
    // /v1/content/posts/latest - Content latest posts
    // /v1/content/posts/comments - Content post comments
}
