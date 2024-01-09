package org.cryptodata.api;

import org.cryptodata.dto.ResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface ICoinMarketCapService {

    String CMC_PRO_API_KEY = "X-CMC_PRO_API_KEY";

    String PARAM_ID = "id";

    @GET("/v2/cryptocurrency/quotes/latest")
    Call<ResponseDTO> latestQuotes(@Query(PARAM_ID) int id, @Header(CMC_PRO_API_KEY) String apiKey);
}
