package org.cryptodata.service.exchange;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.service.CoinMarketCapFilter;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;
import org.cryptodata.service.exchange.asset.AssetService;
import org.cryptodata.service.exchange.listing.ListingService;
import org.cryptodata.service.exchange.market.MarketPairService;
import org.cryptodata.service.exchange.metadata.MetadataService;
import org.cryptodata.service.exchange.quote.QuoteService;

/**
 * Represents a service for handling Exchange-related operations using CoinMarketCap API.
 *
 * @param coinMarketCap The CoinMarketCap instance for API communication.
 * @param exchangeUrl   The CoinMarketCapUrlBuilder instance for building related URLs.
 */
public record ExchangeService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder exchangeUrl) {

    /**
     * Creates a CoinMarketCapFilter for MetadataService operations.
     *
     * @return CoinMarketCapFilter for MetadataService.
     */
    public CoinMarketCapFilter<MetadataService> metadata() {
        return new CoinMarketCapFilter<>(new MetadataService(coinMarketCap, exchangeUrl));
    }

    /**
     * Creates a CoinMarketCapFilter for AssetService operations.
     *
     * @return CoinMarketCapFilter for MetadataService.
     */
    public CoinMarketCapFilter<AssetService> assets() {
        return new CoinMarketCapFilter<>(new AssetService(coinMarketCap, exchangeUrl));
    }


    /**
     * Creates a CoinMarketCapFilter for ListingService operations.
     *
     * @return CoinMarketCapFilter for ListingService.
     */
    public CoinMarketCapFilter<ListingService> listing() {
        return new CoinMarketCapFilter<>(new ListingService(coinMarketCap, exchangeUrl));
    }

    /**
     * Creates a CoinMarketCapFilter for QuoteService operations.
     *
     * @return CoinMarketCapFilter for QuoteService.
     */
    public CoinMarketCapFilter<QuoteService> quote() {
        return new CoinMarketCapFilter<>(new QuoteService(coinMarketCap, exchangeUrl));
    }

    /**
     * Creates a CoinMarketCapFilter for MarketPairService operations.
     *
     * @return CoinMarketCapFilter for MarketPairService.
     */
    public CoinMarketCapFilter<MarketPairService> marketPairs() {
        return new CoinMarketCapFilter<>(new MarketPairService(coinMarketCap, exchangeUrl));
    }
}