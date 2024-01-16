package serviceTests.cryptoTests;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.crypto.category.models.CategoryData;
import org.cryptodata.service.CoinMarketCapUrl;
import org.cryptodata.service.crypto.category.CategoryService;
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

public class CategoryServiceTest {


    @Test
    public void test_category_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/serviceResultsExamples/crypto/category/categoryOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        CategoryService myHttpClientWrapper = new CategoryService(new CoinMarketCap(""), new CoinMarketCapUrl.CoinMarketCapUrlBuilder());
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        CategoryData result = myHttpClientWrapper.get();

        // Verify the result
        assertEquals("655c563a19d020516fba113a", result.getId());
        assertEquals("eGirl Capital Portfolio", result.getName());
    }

    @Test
    public void test_categories_OK() throws IOException, InterruptedException, CoinMarketCapException {
        // Create a mock of HttpClient
        HttpClient mockHttpClient = Mockito.mock(HttpClient.class);

        int status = 200;
        String path = "src/test/resources/serviceResultsExamples/crypto/category/categoriesOK.json";

        // Create an instance of MyHttpClientWrapper and set the mock
        CategoryService myHttpClientWrapper = new CategoryService(new CoinMarketCap(""), new CoinMarketCapUrl.CoinMarketCapUrlBuilder());
        myHttpClientWrapper.setHttpClient(mockHttpClient);

        // Mock the behavior of HttpClient.send()
        when(mockHttpClient.send(any(HttpRequest.class), any(HttpResponse.BodyHandler.class))).thenReturn(ServiceTestHelper.createMockedResponse(ServiceTestHelper.convertJsonFileToString(path), status));


        // Perform the actual test
        List<CategoryData> result = myHttpClientWrapper.list();

        // Verify the result
        assertEquals("659f3fbb4c5ab81dba4bb8ba", result.get(0).getId());

        assertEquals("659392fd54b2742440bf0dde", result.get(1).getId());

        assertEquals("658e1127598b0275bafcb61c", result.get(2).getId());
    }


}
