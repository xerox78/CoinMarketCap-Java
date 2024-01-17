package servicetests.blockchaintests;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapUrl;
import org.cryptodata.service.blockchain.statistics.StatisticsService;
import org.cryptodata.service.blockchain.statistics.models.StatisticsData;
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

public class StatisticsServiceTest {
    @Test
    public void test_latest_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/results/blockchain/statistics/latestOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        StatisticsService myHttpClientWrapper = new StatisticsService(new CoinMarketCap(""), new CoinMarketCapUrl.CoinMarketCapUrlBuilder());
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        Map<String, StatisticsData> result = myHttpClientWrapper.latest();

        // Verify the result
        assertEquals(1, result.get("1").id());
        assertEquals(2, result.get("2").id());
    }
}
