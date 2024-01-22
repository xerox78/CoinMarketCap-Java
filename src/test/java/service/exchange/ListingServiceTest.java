package service.exchange;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapUrl;
import org.cryptodata.service.exchange.listing.ListingService;
import org.cryptodata.service.exchange.listing.models.ListingLatestData;
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

public class ListingServiceTest {
    @Test
    public void test_latest_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/results/exchange/listing/latestOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        ListingService myHttpClientWrapper = new ListingService(new CoinMarketCap(""), new CoinMarketCapUrl.CoinMarketCapUrlBuilder());
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        List<ListingLatestData> result = myHttpClientWrapper.latest();

        // Verify the result
        assertEquals(Integer.valueOf(8453), result.getFirst().id());
        assertEquals("suhu2tum3n", result.getFirst().fiats().getFirst());
        assertEquals(Double.valueOf(0.5284219417271909), result.getFirst().exchangeScore());
        assertEquals(Double.valueOf(0.44391086567862637), result.getFirst().quote().get("USD").derivativeVolumeUsd());
        assertEquals(10, result.size());
    }
}
