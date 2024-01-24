package service.exchange;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.exchange.market.MarketPairService;
import org.cryptodata.service.exchange.market.models.MarketLatestData;
import org.junit.Test;
import org.mockito.Mockito;
import service.ServiceTestHelper;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class MarketPairsTest {
    @Test
    public void test_pairs_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/results/exchange/market/pairsOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        MarketPairService myHttpClientWrapper = new CoinMarketCap("")
                .exchangeV1()
                .marketPairs()
                .id("value")
                .build();
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        Map<String, MarketLatestData> result = myHttpClientWrapper.latest();

        // Verify the result
        assertEquals(Integer.valueOf(1), result.get("1").id());
        assertEquals(Integer.valueOf(2100), result.get("1").marketPairsList().getFirst().marketId());
        assertEquals("j62b8shgdf", result.get("1").marketPairsList().getFirst().marketPairBase().currencySymbol());

        assertEquals(1, result.size());

        assertEquals(10, result.get("1").marketPairsList().size());

        assertEquals("https://pro-api.coinmarketcap.com/v1/exchange/market-pairs/latest?id=value", myHttpClientWrapper.getUrlBuilder().build().toString());
    }
}
