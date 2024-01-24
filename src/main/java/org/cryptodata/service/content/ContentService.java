package org.cryptodata.service.content;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.service.CoinMarketCapFilter;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;
import org.cryptodata.service.content.data.ContentDataService;
import org.cryptodata.service.content.posts.PostsService;

/**
 * Represents a service for handling Content-related operations using CoinMarketCap API.
 *
 * @param coinMarketCap     The CoinMarketCap instance for API communication.
 * @param cryptocurrencyUrl The CoinMarketCapUrlBuilder instance for building related URLs.
 */
public record ContentService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {

    /**
     * Creates a CoinMarketCapFilter for PostsService operations.
     *
     * @return CoinMarketCapFilter for PostsService.
     */
    public CoinMarketCapFilter<PostsService> posts() {
        return new CoinMarketCapFilter<>(new PostsService(coinMarketCap, cryptocurrencyUrl));
    }

    /**
     * Creates a CoinMarketCapFilter for ContentDataService operations.
     *
     * @return CoinMarketCapFilter for ContentDataService.
     */
    public CoinMarketCapFilter<ContentDataService> data() {
        return new CoinMarketCapFilter<>(new ContentDataService(coinMarketCap, cryptocurrencyUrl));
    }
}
