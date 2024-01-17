package org.cryptodata.service;

import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.core5.http.message.BasicNameValuePair;
import org.apache.hc.core5.net.URIBuilder;
import org.cryptodata.exception.CoinMarketCapException;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/**
 * Utility class for building CoinMarketCap API URLs.
 */
public class CoinMarketCapUrl {

    /**
     * Builder class for constructing CoinMarketCap API URLs with various endpoints and parameters.
     */
    public static class CoinMarketCapUrlBuilder {

        private StringBuilder url;

        private List<NameValuePair> parameterList = new ArrayList<>();

        /**
         * Constructs a new CoinMarketCapUrlBuilder with the base URL.
         */
        public CoinMarketCapUrlBuilder() {
            url = new StringBuilder("https://pro-api.coinmarketcap.com");
        }

        /**
         * Builds and returns a URI for the constructed CoinMarketCap API URL.
         *
         * @return URI representing the CoinMarketCap API URL.
         * @throws CoinMarketCapException If there is an issue building the URI.
         */
        public URI build() throws CoinMarketCapException {
            URIBuilder builder;
            try {
                builder = new URIBuilder(url.toString());
            } catch (URISyntaxException e) {
                throw new CoinMarketCapException(e.getMessage());
            }
            builder.addParameters(parameterList);
            try {
                return builder.build();
            } catch (URISyntaxException e) {
                throw new CoinMarketCapException(e.getMessage());
            }
        }

        /**
         * Adds a parameter with the specified key and value to the URL.
         *
         * @param key   The key of the parameter.
         * @param value The value of the parameter.
         */
        protected void addParameter(String key, String value) {
            parameterList.add(new BasicNameValuePair(key, value));
        }

        /**
         * Appends the "/v3" path to the URL.
         *
         * @return This CoinMarketCapUrlBuilder instance for method chaining.
         */
        public CoinMarketCapUrlBuilder v3() {
            url.append("/v3");
            return this;
        }

        /**
         * Appends the "/v2" path to the URL.
         *
         * @return This CoinMarketCapUrlBuilder instance for method chaining.
         */
        public CoinMarketCapUrlBuilder v2() {
            url.append("/v2");
            return this;
        }

        /**
         * Appends the "/v1" path to the URL.
         *
         * @return This CoinMarketCapUrlBuilder instance for method chaining.
         */
        public CoinMarketCapUrlBuilder v1() {
            url.append("/v1");
            return this;
        }

        /**
         * Appends the "/cryptocurrency" path to the URL.
         *
         * @return This CoinMarketCapUrlBuilder instance for method chaining.
         */
        public CoinMarketCapUrlBuilder cryptocurrency() {
            url.append("/cryptocurrency");
            return this;
        }

        /**
         * Appends the "/quotes" path to the URL.
         *
         * @return This CoinMarketCapUrlBuilder instance for method chaining.
         */
        public CoinMarketCapUrlBuilder quotes() {
            url.append("/quotes");
            return this;
        }

        /**
         * Appends the "/listings" path to the URL.
         *
         * @return This CoinMarketCapUrlBuilder instance for method chaining.
         */
        public CoinMarketCapUrlBuilder listings() {
            url.append("/listings");
            return this;
        }

        /**
         * Appends the "/airdrop" path to the URL.
         *
         * @return This CoinMarketCapUrlBuilder instance for method chaining.
         */
        public CoinMarketCapUrlBuilder airdrop() {
            url.append("/airdrop");
            return this;
        }

        /**
         * Appends the "/airdrops" path to the URL.
         *
         * @return This CoinMarketCapUrlBuilder instance for method chaining.
         */
        public CoinMarketCapUrlBuilder airdrops() {
            url.append("/airdrops");
            return this;
        }

        /**
         * Appends the "/categories" path to the URL.
         *
         * @return This CoinMarketCapUrlBuilder instance for method chaining.
         */
        public CoinMarketCapUrlBuilder categories() {
            url.append("/categories");
            return this;
        }

        /**
         * Appends the "/category" path to the URL.
         *
         * @return This CoinMarketCapUrlBuilder instance for method chaining.
         */
        public CoinMarketCapUrlBuilder category() {
            url.append("/category");
            return this;
        }

        /**
         * Appends the "/map" path to the URL.
         *
         * @return This CoinMarketCapUrlBuilder instance for method chaining.
         */
        public CoinMarketCapUrlBuilder map() {
            url.append("/map");
            return this;
        }

        /**
         * Appends the "/info" path to the URL.
         *
         * @return This CoinMarketCapUrlBuilder instance for method chaining.
         */
        public CoinMarketCapUrlBuilder info() {
            url.append("/info");
            return this;
        }

        /**
         * Appends the "/historical" path to the URL.
         *
         * @return This CoinMarketCapUrlBuilder instance for method chaining.
         */
        public CoinMarketCapUrlBuilder historical() {
            url.append("/historical");
            return this;
        }

        /**
         * Appends the "/latest" path to the URL.
         *
         * @return This CoinMarketCapUrlBuilder instance for method chaining.
         */
        public CoinMarketCapUrlBuilder latest() {
            url.append("/latest");
            return this;
        }

        /**
         * Appends the "/new" path to the URL.
         *
         * @return This CoinMarketCapUrlBuilder instance for method chaining.
         */
        public CoinMarketCapUrlBuilder newPath() {
            url.append("/new");
            return this;
        }

        /**
         * Appends the "/trending" path to the URL.
         *
         * @return This CoinMarketCapUrlBuilder instance for method chaining.
         */
        public CoinMarketCapUrlBuilder trending() {
            url.append("/trending");
            return this;
        }

        /**
         * Appends the "/gainers-losers" path to the URL.
         *
         * @return This CoinMarketCapUrlBuilder instance for method chaining.
         */
        public CoinMarketCapUrlBuilder gainersLosers() {
            url.append("/gainers-losers");
            return this;
        }

        /**
         * Appends the "/most-visited" path to the URL.
         *
         * @return This CoinMarketCapUrlBuilder instance for method chaining.
         */
        public CoinMarketCapUrlBuilder mostVisited() {
            url.append("/most-visited");
            return this;
        }

        /**
         * Appends the "/market-pairs" path to the URL.
         *
         * @return This CoinMarketCapUrlBuilder instance for method chaining.
         */
        public CoinMarketCapUrlBuilder marketPairs() {
            url.append("/market-pairs");
            return this;
        }

        /**
         * Appends the "/ohlcv" path to the URL.
         *
         * @return This CoinMarketCapUrlBuilder instance for method chaining.
         */
        public CoinMarketCapUrlBuilder ohlcv() {
            url.append("/ohlcv");
            return this;
        }

        /**
         * Appends the "/price-performance-stats" path to the URL.
         *
         * @return This CoinMarketCapUrlBuilder instance for method chaining.
         */
        public CoinMarketCapUrlBuilder pricePerformanceStats() {
            url.append("/price-performance-stats");
            return this;
        }

        /**
         * Appends the "/exchange" path to the URL.
         *
         * @return This CoinMarketCapUrlBuilder instance for method chaining.
         */
        public CoinMarketCapUrlBuilder exchange() {
            url.append("/exchange");
            return this;
        }

        /**
         * Appends the "/assets" path to the URL.
         *
         * @return This CoinMarketCapUrlBuilder instance for method chaining.
         */
        public CoinMarketCapUrlBuilder assets() {
            url.append("/assets");
            return this;
        }
    }
}
