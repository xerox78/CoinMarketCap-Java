package org.cryptodata.service;

import org.cryptodata.api.CoinMarketCapClient;
import org.cryptodata.dto.ResponseDTO;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.models.Listing;

import java.net.URISyntaxException;

public class ListingService extends CoinMarketCapClient {

    public ListingService(String apiKey) {
        super(apiKey);
    }

    public Listing getListing(Integer id) throws CoinMarketCapException {
        ResponseDTO body;

        try {
            body = sendRequest(buildURI(CoinMarketCapClient.PARAM_ID, String.valueOf(id), CoinMarketCapClient.LATEST_QUOTES_URL));
        } catch (URISyntaxException e) {
            throw new CoinMarketCapException("Could not build the URI", e.getCause());
        }

        if (body == null || body.getData() == null || body.getData().isEmpty()) {
            throw new CoinMarketCapException(body.getStatus().getErrorMessage());
        }

        return Listing.from(body);
    }
}
