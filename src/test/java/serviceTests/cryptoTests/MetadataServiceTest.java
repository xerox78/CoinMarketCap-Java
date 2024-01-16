package serviceTests.cryptoTests;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.models.data.MetadataInfoData;
import org.cryptodata.models.data.MetadataMapData;
import org.cryptodata.service.CoinMarketCapUrl;
import org.cryptodata.service.crypto.MetadataService;
import org.junit.Test;
import org.mockito.Mockito;
import serviceTests.ServiceTestHelper;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class MetadataServiceTest {

    @Test
    public void test_map_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/serviceResultsExamples/crypto/metadata/idMapOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        MetadataService myHttpClientWrapper = new MetadataService(new CoinMarketCap(""), new CoinMarketCapUrl.CoinMarketCapUrlBuilder());
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));

        // Perform the actual test
        List<MetadataMapData> result = myHttpClientWrapper.map();

        // Verify the result
        assertEquals(1469, result.get(0).getId());
        assertEquals(10, result.size());
    }

    @Test
    public void test_info_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/serviceResultsExamples/crypto/metadata/metadataV2OK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        MetadataService myHttpClientWrapper = new MetadataService(new CoinMarketCap(""), new CoinMarketCapUrl.CoinMarketCapUrlBuilder());
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));

        // Perform the actual test
        Map<String, MetadataInfoData> result = myHttpClientWrapper.info();

        // Verify the result
        assertEquals(1, result.get("1").getId());
        assertEquals(2, result.size());
    }


}
