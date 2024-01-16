package org.cryptodata.service;

import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.core5.http.message.BasicNameValuePair;
import org.apache.hc.core5.net.URIBuilder;
import org.cryptodata.exception.CoinMarketCapException;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class CoinMarketCapUrl {

    public static class CoinMarketCapUrlBuilder {

        private StringBuilder url;

        private List<NameValuePair> parameterList = new ArrayList<>();

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

        public CoinMarketCapUrlBuilder() {
            url = new StringBuilder("https://pro-api.coinmarketcap.com");
        }

        protected void addParameter(String key, String value) {
            parameterList.add(new BasicNameValuePair(key, value));
        }

        public CoinMarketCapUrlBuilder v3() {
            url.append("/v3");
            return this;
        }

        public CoinMarketCapUrlBuilder v2() {
            url.append("/v2");
            return this;
        }

        public CoinMarketCapUrlBuilder v1() {
            url.append("/v1");
            return this;
        }

        public CoinMarketCapUrlBuilder cryptocurrency() {
            url.append("/cryptocurrency");
            return this;

        }

        public CoinMarketCapUrlBuilder quotes() {
            url.append("/quotes");
            return this;
        }

        public CoinMarketCapUrlBuilder listings() {
            url.append("/listings");
            return this;
        }

        public CoinMarketCapUrlBuilder airdrop() {
            url.append("/airdrop");
            return this;
        }

        public CoinMarketCapUrlBuilder airdrops() {
            url.append("/airdrops");
            return this;
        }

        public CoinMarketCapUrlBuilder categories() {
            url.append("/categories");
            return this;
        }

        public CoinMarketCapUrlBuilder category() {
            url.append("/category");
            return this;
        }

        public CoinMarketCapUrlBuilder map() {
            url.append("/map");
            return this;
        }

        public CoinMarketCapUrlBuilder info() {
            url.append("/info");
            return this;
        }

        public CoinMarketCapUrlBuilder historical() {
            url.append("/historical");
            return this;
        }

        public CoinMarketCapUrlBuilder latest() {
            url.append("/latest");
            return this;
        }

        public CoinMarketCapUrlBuilder newPath() {
            url.append("/new");
            return this;
        }

        public CoinMarketCapUrlBuilder trending() {
            url.append("/trending");
            return this;
        }

        public CoinMarketCapUrlBuilder gainersLosers() {
            url.append("/gainers-losers");
            return this;
        }

        public CoinMarketCapUrlBuilder mostVisited() {
            url.append("/most-visited");
            return this;
        }

        public CoinMarketCapUrlBuilder marketPairs() {
            url.append("/market-pairs");
            return this;
        }

        public CoinMarketCapUrlBuilder ohlcv() {
            url.append("/ohlcv");
            return this;
        }

        public CoinMarketCapUrlBuilder pricePerformanceStats() {
            url.append("/price-performance-stats");
            return this;
        }

        public CoinMarketCapUrlBuilder exchange() {
            url.append("/exchange");
            return this;
        }

        public CoinMarketCapUrlBuilder assets() {
            url.append("/assets");
            return this;
        }
    }

}