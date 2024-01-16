package serviceTests.cryptoTests;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.crypto.marketPairs.models.MarketPairsData;
import org.cryptodata.service.CoinMarketCapUrl;
import org.cryptodata.service.crypto.marketPairs.MarketPairsService;
import org.junit.Test;
import org.mockito.Mockito;
import serviceTests.ServiceTestHelper;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class MarketPairsServiceTest {


    @Test
    public void test_latest_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/serviceResultsExamples/crypto/marketV2/marketPairsLatestOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        MarketPairsService myHttpClientWrapper = new MarketPairsService(new CoinMarketCap(""), new CoinMarketCapUrl.CoinMarketCapUrlBuilder());
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));

        // Perform the actual test
        MarketPairsData result = myHttpClientWrapper.latest();

        // Verify the result
        assertEquals("i2t13gjemt", result.name());
        assertEquals("tn3iyg7cwtn", result.marketPairs().get(0).marketPairQuote().exchangeSymbol());
        assertEquals(Double.valueOf(0.8980449996846589), result.marketPairs().get(0).quote().get("USD").volume24h());
    }


}
