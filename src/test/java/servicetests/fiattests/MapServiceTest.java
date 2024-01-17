package servicetests.fiattests;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapUrl;
import org.cryptodata.service.crypto.airdrop.AirdropService;
import org.cryptodata.service.crypto.airdrop.models.AirdropData;
import org.cryptodata.service.fiat.map.MapService;
import org.cryptodata.service.fiat.map.models.FiatMapData;
import org.junit.Test;
import org.mockito.Mockito;
import servicetests.ServiceTestHelper;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class MapServiceTest {


    @Test
    public void test_map_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/results/fiat/map/mapResponseOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        MapService myHttpClientWrapper = new MapService(new CoinMarketCap(""), new CoinMarketCapUrl.CoinMarketCapUrlBuilder());
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        List<FiatMapData> result = myHttpClientWrapper.map();

        // Verify the result
        assertEquals("United States Dollar", result.get(0).name());
    }
}
