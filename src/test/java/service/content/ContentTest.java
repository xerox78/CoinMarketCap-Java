package service.content;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.content.data.ContentDataService;
import org.cryptodata.service.content.data.models.ContentLatestData;
import org.junit.Test;
import org.mockito.Mockito;
import service.ServiceTestHelper;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class ContentTest {
    @Test
    public void test_latest_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/results/content/latestOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        ContentDataService myHttpClientWrapper = new CoinMarketCap("")
                .contentV1()
                .data()
                .id("value")
                .build();
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        List<ContentLatestData> result = myHttpClientWrapper.latest();

        // Verify the result
        assertEquals("Article Subtitle", result.get(0).subtitle());

        assertEquals("https://pro-api.coinmarketcap.com/v1/content/latest?id=value", myHttpClientWrapper.getUrlBuilder().build().toString());
    }
}
