package serviceTests.cryptoTests;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.crypto.ohlcv.models.OhlcvHistoricalData;
import org.cryptodata.service.CoinMarketCapUrl;
import org.cryptodata.service.crypto.ohlcv.models.OhlcvLatestData;
import org.cryptodata.service.crypto.ohlcv.OhlcvService;
import org.junit.Test;
import org.mockito.Mockito;
import serviceTests.ServiceTestHelper;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class OhlcvServiceTest {


    @Test
    public void test_latest_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/serviceResultsExamples/crypto/ohlcvV2/latestOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        OhlcvService myHttpClientWrapper = new OhlcvService(new CoinMarketCap(""), new CoinMarketCapUrl.CoinMarketCapUrlBuilder());
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));

        // Perform the actual test
        Map<String, OhlcvLatestData> result = myHttpClientWrapper.latest();

        // Verify the result
        assertEquals(Integer.valueOf(1), result.get("1").id());
        assertEquals(Double.valueOf(0.9240667639195039), result.get("1").quote().get("USD").open());
        assertNotNull(result.get("1").quote().get("USD").timestamp());
    }


    @Test
    public void test_historical_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/serviceResultsExamples/crypto/ohlcvV2/historicalOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        OhlcvService myHttpClientWrapper = new OhlcvService(new CoinMarketCap(""), new CoinMarketCapUrl.CoinMarketCapUrlBuilder());
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));

        // Perform the actual test
        Map<String, OhlcvHistoricalData> result = myHttpClientWrapper.historical();

        // Verify the result
        assertEquals(Integer.valueOf(1), result.get("1").id());
        assertEquals(Double.valueOf(0.24158101162792245), result.get("1").quotes().get(0).quote().get("USD").open());
        assertNotNull(result.get("1").quotes().get(0).quote().get("USD").timestamp());
    }


}
