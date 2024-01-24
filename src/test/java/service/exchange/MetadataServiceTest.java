package service.exchange;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.exchange.metadata.MetadataService;
import org.cryptodata.service.exchange.metadata.models.InfoData;
import org.cryptodata.service.exchange.metadata.models.MapData;
import org.junit.Test;
import org.mockito.Mockito;
import service.ServiceTestHelper;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class MetadataServiceTest {
    @Test
    public void test_info_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/results/exchange/metadata/infoOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        MetadataService myHttpClientWrapper = new CoinMarketCap("")
                .exchangeV1()
                .metadata()
                .id("value")
                .build();
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        Map<String, InfoData> result = myHttpClientWrapper.info();

        // Verify the result
        assertEquals(2, result.get("2").id());
        assertEquals(List.of("https://twitter.com/WEXnz"), result.get("2").urls().get("twitter"));

        assertEquals(2, result.size());

        assertEquals("https://pro-api.coinmarketcap.com/v1/exchange/info?id=value", myHttpClientWrapper.getUrlBuilder().build().toString());
    }

    @Test
    public void test_map_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/results/exchange/metadata/mapOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        MetadataService myHttpClientWrapper = new CoinMarketCap("")
                .exchangeV1()
                .metadata()
                .id("value")
                .build();
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        List<MapData> result = myHttpClientWrapper.map();

        // Verify the result
        assertEquals(16, result.get(0).id());
        assertTrue(result.get(0).isActive());
        assertEquals(695, result.size());

        assertEquals("https://pro-api.coinmarketcap.com/v1/exchange/map?id=value", myHttpClientWrapper.getUrlBuilder().build().toString());
    }
}
