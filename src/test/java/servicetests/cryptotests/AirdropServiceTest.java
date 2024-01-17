package servicetests.cryptotests;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.crypto.airdrop.models.AirdropData;
import org.cryptodata.service.CoinMarketCapUrl;
import org.cryptodata.service.crypto.airdrop.AirdropService;
import org.junit.Test;
import org.mockito.Mockito;
import servicetests.ServiceTestHelper;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class AirdropServiceTest {


    @Test
    public void test_airdrop_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/serviceResultsExamples/crypto/airdrop/airdropOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        AirdropService myHttpClientWrapper = new AirdropService(new CoinMarketCap(""), new CoinMarketCapUrl.CoinMarketCapUrlBuilder());
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        AirdropData result = myHttpClientWrapper.get();

        // Verify the result
        assertEquals("635facd06f4bfc7d9bee85d8", result.id());
        assertEquals(18519, result.airdropCoin().id());
    }

    @Test
    public void test_airdrops_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/serviceResultsExamples/crypto/airdrop/airdropsOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        AirdropService myHttpClientWrapper = new AirdropService(new CoinMarketCap(""), new CoinMarketCapUrl.CoinMarketCapUrlBuilder());
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        List<AirdropData> result = myHttpClientWrapper.list();

        // Verify the result
        assertEquals("6343e82fca2d8657a887878d", result.get(0).id());
        assertEquals(5804, result.get(0).airdropCoin().id());

        assertEquals("633ff5e0558c5024ac5f2e5d", result.get(1).id());
        assertEquals(11198, result.get(1).airdropCoin().id());
    }


}
