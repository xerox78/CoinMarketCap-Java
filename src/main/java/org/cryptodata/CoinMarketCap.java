package org.cryptodata;

import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.models.Listing;
import org.cryptodata.service.ListingService;

public class CoinMarketCap {
    private final ListingService listingService;

    public CoinMarketCap(String apiKey) {
        this.listingService = new ListingService(apiKey);
    }


    /**
     * Get listing with corresponding ID
     *
     * @param id CoinMarketCap id
     * @return Listing
     * @throws CoinMarketCapException on error.
     */
    public Listing getListings(int id) throws CoinMarketCapException {
        return listingService.getListing(id);
    }
}
