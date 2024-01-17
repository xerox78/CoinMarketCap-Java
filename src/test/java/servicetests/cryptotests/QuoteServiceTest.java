package servicetests.cryptotests;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.crypto.quote.models.QuoteHistoricalData;
import org.cryptodata.service.crypto.quote.models.QuoteLatestData;
import org.cryptodata.service.CoinMarketCapUrl;
import org.cryptodata.service.crypto.quote.QuoteService;
import org.junit.Test;
import org.mockito.Mockito;
import servicetests.ServiceTestHelper;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class QuoteServiceTest {

    @Test
    public void test_historicalV2_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/serviceResultsExamples/crypto/quoteV2/historicalOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        QuoteService myHttpClientWrapper = new QuoteService(new CoinMarketCap(""), new CoinMarketCapUrl.CoinMarketCapUrlBuilder());
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        Map<String, QuoteHistoricalData> result = myHttpClientWrapper.historical();

        // Verify the result
        assertEquals(Integer.valueOf(1), result.get("1").id());
        assertEquals(Integer.valueOf(2010), result.get("2010").id());
    }

    @Test
    public void test_latestV2_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/serviceResultsExamples/crypto/quoteV2/latestOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        QuoteService myHttpClientWrapper = new QuoteService(new CoinMarketCap(""), new CoinMarketCapUrl.CoinMarketCapUrlBuilder());
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        Map<String, QuoteLatestData> result = myHttpClientWrapper.latest();

        // Verify the result
        assertEquals(Integer.valueOf(1), result.get("1").id());
        assertEquals(Integer.valueOf(2010), result.get("2010").id());
        assertEquals(Double.valueOf(117.32040778), result.get("2010").quote().get("USD").percentChange90d());
    }

    @Test
    public void test_historicalV3_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/serviceResultsExamples/crypto/quoteV3/historicalOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        QuoteService myHttpClientWrapper = new QuoteService(new CoinMarketCap(""), new CoinMarketCapUrl.CoinMarketCapUrlBuilder());
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        Map<String, QuoteHistoricalData> result = myHttpClientWrapper.historical();

        // Verify the result
        assertEquals(Integer.valueOf(1), result.get("1").id());
        assertEquals(Integer.valueOf(5934), result.get("5934").id());
        assertEquals(10, result.get("5934").quotes().size());
    }


}
