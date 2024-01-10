package org.cryptodata.service;

import org.cryptodata.api.CoinMarketCapClient;
import org.cryptodata.dto.ResponseDTO;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.models.Listing;
import org.cryptodata.models.Ticker;

import java.net.URI;

public class TickerService {

    private CoinMarketCapClient client;

    public TickerService(CoinMarketCapClient client) {
        this.client = client;
    }
    public TickerService(String apiKey) {
        this(new CoinMarketCapClient(apiKey));
    }

    public Ticker getTicker(Integer id) throws CoinMarketCapException
    {
        URI uri = client.buildURI(CoinMarketCapClient.PARAM_ID, String.valueOf(id), CoinMarketCapClient.LATEST_QUOTES_URL);

        ResponseDTO body = client.sendRequest(uri);

        if (body == null || body.getData() == null || body.getData().isEmpty()) {
            throw new CoinMarketCapException("Failed to retrieve ticker details");
        }

        return Ticker.fromDto(body);

    }

}
