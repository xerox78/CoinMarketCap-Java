package service.tools;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.tools.convert.ConvertService;
import org.cryptodata.service.tools.convert.models.ConvertData;
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

public class ConvertServiceTest {
    @Test
    public void test_convert_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/results/tools/priceConversionV2OK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        ConvertService myHttpClientWrapper = new CoinMarketCap("")
                .toolsV2()
                .priceConversion()
                .id("value")
                .build();
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        ConvertData result = myHttpClientWrapper.convert();

        // Verify the result
        assertEquals("1", result.id());

        assertEquals("https://pro-api.coinmarketcap.com/v2/tools/price-conversion?id=value", myHttpClientWrapper.getUrlBuilder().build().toString());
    }
}
