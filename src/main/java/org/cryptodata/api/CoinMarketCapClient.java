package org.cryptodata.api;

import lombok.Getter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CoinMarketCapClient {
    private static final String COINMARKETCAP_API_BASE_URL = "https://pro-api.coinmarketcap.com";

    @Getter
    private final String apiKey;

    @Getter
    private final Retrofit retrofit;

    public CoinMarketCapClient(String apiKey) {
        this.apiKey = apiKey;

        this.retrofit = new Retrofit.Builder()
                .baseUrl(COINMARKETCAP_API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


}
