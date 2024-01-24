package service.exchange;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.exchange.asset.AssetService;
import org.cryptodata.service.exchange.asset.models.AssetData;
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

public class AssetsServiceTest {

    @Test
    public void test_assets_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/results/exchange/asset/assetsOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        AssetService myHttpClientWrapper = new CoinMarketCap("")
                .exchangeV1()
                .assets()
                .id("value")
                .build();
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        List<AssetData> result = myHttpClientWrapper.list();

        // Verify the result
        assertEquals("0x5a52E96BAcdaBb82fd05763E25335261B270Efcb", result.getFirst().walletAddress());
        assertEquals("Polygon", result.getFirst().platform().name());
        assertEquals(Double.valueOf(0.9992710989426461), result.getFirst().currency().priceUsd());
        assertEquals(754, result.size());

        assertEquals("https://pro-api.coinmarketcap.com/v1/exchange/assets?id=value", myHttpClientWrapper.getUrlBuilder().build().toString());

    }
}
