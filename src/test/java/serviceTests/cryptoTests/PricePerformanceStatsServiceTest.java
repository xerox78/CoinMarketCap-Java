package serviceTests.cryptoTests;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.crypto.pricePerformance.models.PricePerformanceStatsData;
import org.cryptodata.service.CoinMarketCapUrl;
import org.cryptodata.service.crypto.pricePerformance.PricePerformanceStatsService;
import org.junit.Test;
import org.mockito.Mockito;
import serviceTests.ServiceTestHelper;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class PricePerformanceStatsServiceTest {

    @Test
    public void test_latest_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/serviceResultsExamples/crypto/marketV2/pricePerformanceStatsV2OK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        PricePerformanceStatsService myHttpClientWrapper = new PricePerformanceStatsService(new CoinMarketCap(""), new CoinMarketCapUrl.CoinMarketCapUrlBuilder());
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        Map<String, PricePerformanceStatsData> result = myHttpClientWrapper.latest();

        // Verify the result
        assertEquals(Double.valueOf(0.426389882911546), result.get("1").getQuote().get("USD").getOpen());
        assertEquals(2, result.size());
    }
}
