package org.cryptodata.service;

import org.cryptodata.api.CoinMarketCapClient;
import org.cryptodata.api.ICoinMarketCapService;
import org.cryptodata.dto.ResponseDTO;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.models.Listing;

import java.io.IOException;

public class ListingService extends CoinMarketCapClient {
    private final ICoinMarketCapService service;

    public ListingService(String apiKey) {
        super(apiKey);

        service = getRetrofit().create(ICoinMarketCapService.class);
    }

    public Listing getListing(int id) throws CoinMarketCapException {
        ResponseDTO body;
        try {
            body = service.latestQuotes(id, getApiKey()).execute().body();

            if (body == null || body.getData() == null || body.getData().isEmpty()) {
                throw new CoinMarketCapException("No data found for the requested ID");
            }

        } catch (IOException e) {
            throw new CoinMarketCapException(e.getMessage());
        }

        return Listing.from(body);
    }
}
