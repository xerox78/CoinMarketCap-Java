package serviceTests.cryptoTests;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.models.data.AirdropData;
import org.cryptodata.service.CoinMarketCapUrl;
import org.cryptodata.service.crypto.AirdropService;
import org.junit.Test;
import org.mockito.Mockito;

import javax.net.ssl.SSLSession;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class AirdropServiceTest {

    public static String convertJsonFileToString(String filePath) throws IOException {
        // Read the content of the JSON file into a byte array
        byte[] jsonData = Files.readAllBytes(Paths.get(filePath));

        // Convert the byte array to a string
        return new String(jsonData);
    }
    @Test
    public void testFetchData() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        // Create an instance of MyHttpClientWrapper and set the mock
        AirdropService myHttpClientWrapper = new AirdropService(new CoinMarketCap(""), new CoinMarketCapUrl.CoinMarketCapUrlBuilder());
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class)))
                .thenReturn(createMockedResponse(convertJsonFileToString("src/test/resources/serviceResponses/crypto/airdrop/airdrop.json")) );


        // Perform the actual test
        AirdropData result = myHttpClientWrapper.get();

        // Verify the result
        assertEquals("635facd06f4bfc7d9bee85d8", result.getId());
        assertEquals(18519, result.getCoinData().getId());
    }

    // Helper method to create a mocked HttpResponse
    private HttpResponse<String> createMockedResponse(String body) {

        return new HttpResponse<>() {
            @Override
            public int statusCode() {
                return 200;
            }

            @Override
            public HttpRequest request() {
                return null;
            }

            @Override
            public HttpHeaders headers() {
                return null;
            }

            @Override
            public String body() {
                return body;
            }

            @Override
            public Optional<SSLSession> sslSession() {
                return Optional.empty();
            }

            @Override
            public URI uri() {
                return null;
            }

            @Override
            public HttpClient.Version version() {
                return null;
            }



            // Implementing the missing method
            @Override
            public Optional<HttpResponse<String>> previousResponse() {
                return null;
            }
        };
    }

}
