package org.cryptodata.service;

import org.cryptodata.api.CoinMarketCapClient;
import org.cryptodata.dto.ResponseDTO;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.models.Listing;

import java.net.URI;

public class ListingService {

    private CoinMarketCapClient client;

    public ListingService(CoinMarketCapClient client) {
        this.client = client;
    }

    public ListingService(String key) {
        this(new CoinMarketCapClient(key));
    }

    public Listing getListing(Integer id) throws CoinMarketCapException {

        URI uri = client.buildURI(CoinMarketCapClient.PARAM_ID, String.valueOf(id), CoinMarketCapClient.LATEST_QUOTES_URL);
        ResponseDTO body = client.sendRequest(uri);

        if (body == null || body.getData() == null || body.getData().isEmpty()) {
            throw new CoinMarketCapException("Failed to retrieve listing details");
        }
        return Listing.fromDto(body);

    }
}
