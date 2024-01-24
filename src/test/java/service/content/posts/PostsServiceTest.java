package service.content.posts;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.content.posts.PostsService;
import org.cryptodata.service.content.posts.models.ContentPostsCommentsData;
import org.cryptodata.service.content.posts.models.ContentPostsData;
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

public class PostsServiceTest {
    @Test
    public void test_top_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/results/content/topOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        PostsService myHttpClientWrapper = new CoinMarketCap("")
                .contentV1()
                .posts()
                .id("value")
                .build();
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        ContentPostsData result = myHttpClientWrapper.top();

        // Verify the result
        assertEquals("5", result.list().getFirst().commentCount());

        assertEquals("https://pro-api.coinmarketcap.com/v1/content/posts/top?id=value", myHttpClientWrapper.getUrlBuilder().build().toString());
    }

    @Test
    public void test_latest_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/results/content/latestPostOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        PostsService myHttpClientWrapper = new CoinMarketCap("")
                .contentV1()
                .posts()
                .id("value")
                .build();
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        ContentPostsData result = myHttpClientWrapper.latest();

        // Verify the result
        assertEquals("5", result.list().getFirst().commentCount());

        assertEquals("https://pro-api.coinmarketcap.com/v1/content/posts/latest?id=value", myHttpClientWrapper.getUrlBuilder().build().toString());
    }

    @Test
    public void test_comments_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/results/content/commentsOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        PostsService myHttpClientWrapper = new CoinMarketCap("")
                .contentV1()
                .posts()
                .id("value")
                .build();
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        List<ContentPostsCommentsData> result = myHttpClientWrapper.comments();

        // Verify the result
        assertEquals("317807035", result.get(0).postId());

        assertEquals("https://pro-api.coinmarketcap.com/v1/content/posts/comments?id=value", myHttpClientWrapper.getUrlBuilder().build().toString());
    }
}
