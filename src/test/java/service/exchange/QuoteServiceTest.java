package service.exchange;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.exchange.quote.QuoteService;
import org.cryptodata.service.exchange.quote.models.QuoteHistoricalData;
import org.cryptodata.service.exchange.quote.models.QuoteLatestData;
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

public class QuoteServiceTest {
    @Test
    public void test_latest_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/results/exchange/quote/quotesLatestOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        QuoteService myHttpClientWrapper = new CoinMarketCap("")
                .exchangeV1()
                .quote()
                .id("value")
                .build();
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        Map<String, QuoteLatestData> result = myHttpClientWrapper.latest();

        // Verify the result
        assertEquals(Integer.valueOf(1), result.get("1").id());
        assertEquals(Double.valueOf(0.5601732957900376), result.get("1").quote().get("EUR").volume24h());

        assertEquals(2, result.size());

        assertEquals("https://pro-api.coinmarketcap.com/v1/exchange/quotes/latest?id=value", myHttpClientWrapper.getUrlBuilder().build().toString());
    }

    @Test
    public void test_historical_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/results/exchange/quote/quotesHistoricalOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        QuoteService myHttpClientWrapper = new CoinMarketCap("")
                .exchangeV1()
                .quote()
                .id("value")
                .build();
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        Map<String, QuoteHistoricalData> result = myHttpClientWrapper.historical();

        // Verify the result
        assertEquals(Integer.valueOf(24), result.get("24").id());
        assertEquals(Double.valueOf(3201), result.get("24").quotes().getFirst().quote().get("USD").volume24h());
        assertEquals(2, result.size());

        assertEquals("https://pro-api.coinmarketcap.com/v1/exchange/quotes/historical?id=value", myHttpClientWrapper.getUrlBuilder().build().toString());
    }
}
