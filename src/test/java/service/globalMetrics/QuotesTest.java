package service.globalMetrics;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.globalmetrics.quote.QuoteService;
import org.cryptodata.service.globalmetrics.quote.models.QuoteHistoricalData;
import org.cryptodata.service.globalmetrics.quote.models.QuoteLatestData;
import org.junit.Test;
import org.mockito.Mockito;
import service.ServiceTestHelper;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class QuotesTest {


    @Test
    public void test_latest_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/results/globalmetrics/quote/latestOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        QuoteService myHttpClientWrapper = new CoinMarketCap("")
                .globalMetricsV1()
                .quote()
                .id("value")
                .build();
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        QuoteLatestData result = myHttpClientWrapper.latest();

        // Verify the result
        assertEquals(8825, result.activeCryptocurrencies());
        assertEquals(2076371010372.2886, 0, result.quote().get("SGD").totalMarketCap());
        assertEquals("https://pro-api.coinmarketcap.com/v1/global-metrics/quotes/latest?id=value", myHttpClientWrapper.getUrlBuilder().build().toString());
    }

    @Test
    public void test_historical_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/results/globalmetrics/quote/historicalOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        QuoteService myHttpClientWrapper = new CoinMarketCap("")
                .globalMetricsV1()
                .quote()
                .id("value")
                .build();
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        QuoteHistoricalData result = myHttpClientWrapper.historical();

        // Verify the result
        assertEquals(9016, result.quotes().getFirst().activeCryptocurrencies());
        assertEquals(848248128461.75, 0, result.quotes().getFirst().quote().get("USD").altcoinMarketCap());
        assertEquals("https://pro-api.coinmarketcap.com/v1/global-metrics/quotes/historical?id=value", myHttpClientWrapper.getUrlBuilder().build().toString());
    }
}
