package servicetests.cryptotests;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapUrl;
import org.cryptodata.service.crypto.trending.TrendingService;
import org.cryptodata.service.crypto.trending.models.TrendingData;
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

public class TrendingServiceTest {

    @Test
    public void test_gainersLosers_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/serviceResultsExamples/crypto/trending/gainersLosersOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        TrendingService myHttpClientWrapper = new TrendingService(new CoinMarketCap(""), new CoinMarketCapUrl.CoinMarketCapUrlBuilder());
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        List<TrendingData> result = myHttpClientWrapper.gainersLosers();

        // Verify the result
        assertEquals("7ndcd0cx44a", result.get(0).name());
        assertEquals(Double.valueOf(7791), result.get(0).quote().get("USD").volume24h());
        assertEquals(10, result.size());
    }

    @Test
    public void test_latest_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/serviceResultsExamples/crypto/trending/latestOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        TrendingService myHttpClientWrapper = new TrendingService(new CoinMarketCap(""), new CoinMarketCapUrl.CoinMarketCapUrlBuilder());
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        List<TrendingData> result = myHttpClientWrapper.latest();

        // Verify the result
        assertEquals("zl0703ku71", result.get(0).name());

        assertEquals("v7ztqlju0g", result.get(1).name());
        assertEquals(10, result.size());
    }

    @Test
    public void test_mostVisited_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/serviceResultsExamples/crypto/trending/mostVisitedOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        TrendingService myHttpClientWrapper = new TrendingService(new CoinMarketCap(""), new CoinMarketCapUrl.CoinMarketCapUrlBuilder());
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));

        // Perform the actual test
        List<TrendingData> result = myHttpClientWrapper.mostVisited();

        // Verify the result
        assertEquals("6do5unsmgis", result.get(0).name());

        assertEquals("u8vzyptbeif", result.get(1).name());
        assertEquals(10, result.size());
    }
}
