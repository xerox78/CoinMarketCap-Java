package org.cryptodata;

import org.cryptodata.service.CoinMarketCapFilter;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;
import org.cryptodata.service.crypto.airdrop.AirdropService;
import org.cryptodata.service.crypto.category.CategoryService;
import org.cryptodata.service.crypto.listing.ListingService;
import org.cryptodata.service.crypto.metadata.MetadataService;
import org.cryptodata.service.crypto.ohlcv.OhlcvService;
import org.cryptodata.service.crypto.pricePerformance.PricePerformanceStatsService;
import org.cryptodata.service.crypto.quote.QuoteService;
import org.cryptodata.service.crypto.trending.TrendingService;

public class CryptocurrencyService {

    private final CoinMarketCapUrlBuilder cryptocurrencyUrl;
    private final CoinMarketCap coinMarketCap;

    CryptocurrencyService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        this.coinMarketCap = coinMarketCap;
        this.cryptocurrencyUrl = cryptocurrencyUrl;
    }

    /**
     * CoinMarketCapFilter class
     *
     * @return CoinMarketCapFilter
     */
    CoinMarketCapFilter<AirdropService> airdrop() {
        return new CoinMarketCapFilter<>(new AirdropService(coinMarketCap, cryptocurrencyUrl));
    }


    /**
     * CoinMarketCapFilter class
     *
     * @return CoinMarketCapFilter
     */
    CoinMarketCapFilter<ListingService> listing() {
        return new CoinMarketCapFilter<>(new ListingService(coinMarketCap, cryptocurrencyUrl));
    }

    /**
     * CoinMarketCapFilter class
     *
     * @return CoinMarketCapFilter
     */
    CoinMarketCapFilter<QuoteService> quote() {
        return new CoinMarketCapFilter<>(new QuoteService(coinMarketCap, cryptocurrencyUrl));
    }

    /**
     * CoinMarketCapFilter class
     *
     * @return CoinMarketCapFilter
     */
    CoinMarketCapFilter<CategoryService> category() {
        return new CoinMarketCapFilter<>(new CategoryService(coinMarketCap, cryptocurrencyUrl));
    }

    /**
     * CoinMarketCapFilter class
     *
     * @return CoinMarketCapFilter
     */
    CoinMarketCapFilter<MetadataService> metadata() {
        return new CoinMarketCapFilter<>(new MetadataService(coinMarketCap, cryptocurrencyUrl));
    }

    /**
     * CoinMarketCapFilter class
     *
     * @return CoinMarketCapFilter
     */
    CoinMarketCapFilter<TrendingService> trending() {
        return new CoinMarketCapFilter<>(new TrendingService(coinMarketCap, cryptocurrencyUrl));
    }

    /**
     * CoinMarketCapFilter class
     *
     * @return CoinMarketCapFilter
     */
    CoinMarketCapFilter<OhlcvService> ohlcv() {
        return new CoinMarketCapFilter<>(new OhlcvService(coinMarketCap, cryptocurrencyUrl));
    }

    /**
     * CoinMarketCapFilter class
     *
     * @return CoinMarketCapFilter
     */
    CoinMarketCapFilter<PricePerformanceStatsService> pricePerformanceStats() {
        return new CoinMarketCapFilter<>(new PricePerformanceStatsService(coinMarketCap, cryptocurrencyUrl));
    }

}
