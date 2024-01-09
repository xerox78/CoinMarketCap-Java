package org.cryptodata.api;

import lombok.Getter;
import org.apache.http.HttpHeaders;
import org.apache.http.client.utils.URIBuilder;
import org.cryptodata.dto.ResponseDTO;
import org.cryptodata.exception.CoinMarketCapException;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CoinMarketCapClient {
    public static final String COINMARKETCAP_V2_BASE_URL = "https://pro-api.coinmarketcap.com/v2";
    public static final String LATEST_QUOTES_URL = "/cryptocurrency/quotes/latest";
    public static final String PARAM_ID = "id";

    @Getter
    private final String apiKey;

    public CoinMarketCapClient(String apiKey) {
        this.apiKey = apiKey;
    }

    public URI buildURI(String queryParameter, String queryValue, String methodPath)  {
        try {
            return new URIBuilder(URI.create(COINMARKETCAP_V2_BASE_URL + methodPath))
                    .addParameter(queryParameter, queryValue)
                    .build();
        } catch (URISyntaxException e) {
            return null;
        }
    }

    public ResponseDTO sendRequest(URI uri) throws CoinMarketCapException {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .header("X-CMC_PRO_API_KEY", apiKey)
                .header(HttpHeaders.ACCEPT, "application/json")
                .GET()
                .build();
        HttpResponse<String> response;
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (InterruptedException | IOException e) {
            throw new CoinMarketCapException("Connection Error", e.getCause());
        }

        try {
            return ResponseDTO.fromJson(response.body());
        } catch (Exception e) {
            throw new CoinMarketCapException("Couldn't parse Json", e.getCause());
        }


    }


}
