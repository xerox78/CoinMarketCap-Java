package service.community;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.community.trending.TrendingService;
import org.cryptodata.service.community.trending.models.TokenData;
import org.cryptodata.service.community.trending.models.TopicData;
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

public class TrendingTest {
    @Test
    public void test_topic_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/results/community/topicOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        TrendingService myHttpClientWrapper = new CoinMarketCap("")
                .communityV1()
                .trending()
                .id("value")
                .build();
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        List<TopicData> result = myHttpClientWrapper.topic();

        // Verify the result
        assertEquals(1, result.getFirst().rank());

        assertEquals("https://pro-api.coinmarketcap.com/v1/community/trending/topic?id=value", myHttpClientWrapper.getUrlBuilder().build().toString());
    }

    @Test
    public void test_token_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/results/community/tokenOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        TrendingService myHttpClientWrapper = new CoinMarketCap("")
                .communityV1()
                .trending()
                .id("value")
                .build();
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        List<TokenData> result = myHttpClientWrapper.token();

        // Verify the result
        assertEquals(1, result.getFirst().rank());

        assertEquals("https://pro-api.coinmarketcap.com/v1/community/trending/token?id=value", myHttpClientWrapper.getUrlBuilder().build().toString());
    }
}
