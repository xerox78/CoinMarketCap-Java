package org.cryptodata;

import org.cryptodata.service.CoinMarketCapFilter;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;
import org.cryptodata.service.crypto.airdrop.AirdropService;
import org.cryptodata.service.crypto.category.CategoryService;
import org.cryptodata.service.crypto.listing.ListingService;
import org.cryptodata.service.crypto.metadata.MetadataService;
import org.cryptodata.service.crypto.ohlcv.OhlcvService;
import org.cryptodata.service.crypto.priceperformance.PricePerformanceStatsService;
import org.cryptodata.service.crypto.quote.QuoteService;
import org.cryptodata.service.crypto.trending.TrendingService;

/**
 * Represents a service for handling cryptocurrency-related operations using CoinMarketCap API.
 *
 * @param coinMarketCap     The CoinMarketCap instance for API communication.
 * @param cryptocurrencyUrl The CoinMarketCapUrlBuilder instance for building related URLs.
 */
public record CryptocurrencyService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {

    /**
     * Creates a CoinMarketCapFilter for AirdropService operations.
     *
     * @return CoinMarketCapFilter for AirdropService.
     */
    CoinMarketCapFilter<AirdropService> airdrop() {
        return new CoinMarketCapFilter<>(new AirdropService(coinMarketCap, cryptocurrencyUrl));
    }


    /**
     * Creates a CoinMarketCapFilter for ListingService operations.
     *
     * @return CoinMarketCapFilter for ListingService.
     */
    CoinMarketCapFilter<ListingService> listing() {
        return new CoinMarketCapFilter<>(new ListingService(coinMarketCap, cryptocurrencyUrl));
    }

    /**
     * Creates a CoinMarketCapFilter for QuoteService operations.
     *
     * @return CoinMarketCapFilter for QuoteService.
     */
    CoinMarketCapFilter<QuoteService> quote() {
        return new CoinMarketCapFilter<>(new QuoteService(coinMarketCap, cryptocurrencyUrl));
    }

    /**
     * Creates a CoinMarketCapFilter for CategoryService operations.
     *
     * @return CoinMarketCapFilter for CategoryService.
     */
    CoinMarketCapFilter<CategoryService> category() {
        return new CoinMarketCapFilter<>(new CategoryService(coinMarketCap, cryptocurrencyUrl));
    }

    /**
     * Creates a CoinMarketCapFilter for MetadataService operations.
     *
     * @return CoinMarketCapFilter for MetadataService.
     */
    CoinMarketCapFilter<MetadataService> metadata() {
        return new CoinMarketCapFilter<>(new MetadataService(coinMarketCap, cryptocurrencyUrl));
    }

    /**
     * Creates a CoinMarketCapFilter for TrendingService operations.
     *
     * @return CoinMarketCapFilter for TrendingService.
     */
    CoinMarketCapFilter<TrendingService> trending() {
        return new CoinMarketCapFilter<>(new TrendingService(coinMarketCap, cryptocurrencyUrl));
    }

    /**
     * Creates a CoinMarketCapFilter for OhlcvService operations.
     *
     * @return CoinMarketCapFilter for OhlcvService.
     */
    CoinMarketCapFilter<OhlcvService> ohlcv() {
        return new CoinMarketCapFilter<>(new OhlcvService(coinMarketCap, cryptocurrencyUrl));
    }

    /**
     * Creates a CoinMarketCapFilter for PricePerformanceStatsService operations.
     *
     * @return CoinMarketCapFilter for PricePerformanceStatsService.
     */
    CoinMarketCapFilter<PricePerformanceStatsService> pricePerformanceStats() {
        return new CoinMarketCapFilter<>(new PricePerformanceStatsService(coinMarketCap, cryptocurrencyUrl));
    }

}
