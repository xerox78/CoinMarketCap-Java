package serviceTests.cryptoTests;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.crypto.listing.models.ListingData;
import org.cryptodata.service.CoinMarketCapUrl;
import org.cryptodata.service.crypto.listing.ListingService;
import org.junit.Test;
import org.mockito.Mockito;
import serviceTests.ServiceTestHelper;

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
    public void test_historical_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/serviceResultsExamples/crypto/listing/historicalOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        ListingService myHttpClientWrapper = new ListingService(new CoinMarketCap(""), new CoinMarketCapUrl.CoinMarketCapUrlBuilder());
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        List<ListingData> result = myHttpClientWrapper.historical();

        // Verify the result
        assertEquals(Integer.valueOf(1), result.get(0).id());
        assertEquals(Double.valueOf(42265.18565486596), result.get(0).quote().get("USD").price());
        assertEquals(Integer.valueOf(1027), result.get(1).id());
        assertEquals(Integer.valueOf(825), result.get(2).id());
    }

    @Test
    public void test_latest_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/serviceResultsExamples/crypto/listing/latestOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        ListingService myHttpClientWrapper = new ListingService(new CoinMarketCap(""), new CoinMarketCapUrl.CoinMarketCapUrlBuilder());
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        List<ListingData> result = myHttpClientWrapper.latest();

        // Verify the result
        assertEquals(Integer.valueOf(1), result.get(0).id());
        assertEquals(Integer.valueOf(1027), result.get(1).id());
        assertEquals(Integer.valueOf(825), result.get(2).id());
    }

    @Test
    public void test_new_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/serviceResultsExamples/crypto/listing/newOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        ListingService myHttpClientWrapper = new ListingService(new CoinMarketCap(""), new CoinMarketCapUrl.CoinMarketCapUrlBuilder());
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        List<ListingData> result = myHttpClientWrapper.listNew();

        // Verify the result
        assertEquals(Integer.valueOf(1), result.get(0).id());
        assertEquals(Integer.valueOf(1027), result.get(1).id());
    }


}