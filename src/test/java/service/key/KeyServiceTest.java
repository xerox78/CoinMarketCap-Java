package service.key;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.key.KeyService;
import org.cryptodata.service.key.info.models.KeyInfoData;
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

public class KeyServiceTest {


    @Test
    public void test_info_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/results/key/info/keyInfoOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        KeyService myHttpClientWrapper = new CoinMarketCap("")
                .keyV1();
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        KeyInfoData result = myHttpClientWrapper.info();

        // Verify the result
        assertEquals(Integer.valueOf(110000), result.plan().creditLimitMonthly());
        assertEquals("https://pro-api.coinmarketcap.com/v1/key/info", myHttpClientWrapper.getUrlBuilder().build().toString());
    }
}
