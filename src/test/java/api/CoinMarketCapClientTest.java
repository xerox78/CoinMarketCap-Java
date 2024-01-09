package api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.utils.URIBuilder;
import org.cryptodata.api.CoinMarketCapClient;
import org.cryptodata.dto.DataDTO;
import org.cryptodata.dto.ResponseDTO;
import org.cryptodata.exception.CoinMarketCapException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.TreeMap;

@RunWith(MockitoJUnitRunner.class)
public class CoinMarketCapClientTest {
    private MockedStatic<HttpClient> httpClientMockedStatic;
    @Mock
    private HttpResponse<String> httpResponse;
    @Mock
    private HttpClient httpClientMock;

    private static String createResponseDTO() throws JsonProcessingException {
        // Mocking the Retrofit call and response
        ResponseDTO mockResponseDTO = new ResponseDTO();
        TreeMap<String, DataDTO> treeMap = new TreeMap<>();
        DataDTO dataDTO = new DataDTO();
        dataDTO.setId(1);
        dataDTO.setName("Bitcoin");
        dataDTO.setSymbol("BTC");
        dataDTO.setMaxSupply(2.0);
        dataDTO.setCirculatingSupply(2.01);
        dataDTO.setTotalSupply(2.01);
        dataDTO.setCmcRank(1);
        treeMap.put("1", dataDTO);
        mockResponseDTO.setData(treeMap);

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(mockResponseDTO);
    }

    @Before
    public void setUp() {
        httpClientMockedStatic = Mockito.mockStatic(HttpClient.class);
    }

    @After
    public void after() {
        httpClientMockedStatic.close();
    }

    @Test
    public void sendRequest_Success() throws Exception {

        Mockito.when(httpResponse.body()).thenReturn(createResponseDTO());

        httpClientMockedStatic.when(HttpClient::newHttpClient).thenReturn(httpClientMock);
        Mockito.when(httpClientMock.send(Mockito.any(HttpRequest.class), ArgumentMatchers.<HttpResponse.BodyHandler<String>>any()))
                .thenReturn(httpResponse);

        CoinMarketCapClient client = new CoinMarketCapClient("key");
        ResponseDTO responseDTO = client.sendRequest(new URIBuilder(URI.create("https://pro-api.coinmarketcap.com/v2"))
                .build());

        Assert.assertNotNull(responseDTO.getData());
        Assert.assertEquals(1, responseDTO.getData().firstEntry().getValue().getId());
    }

    @Test(expected = CoinMarketCapException.class)
    public void sendRequest_NullResponse() throws Exception {

        Mockito.when(httpResponse.body()).thenReturn(null);

        httpClientMockedStatic.when(HttpClient::newHttpClient).thenReturn(httpClientMock);
        Mockito.when(httpClientMock.send(Mockito.any(HttpRequest.class), ArgumentMatchers.<HttpResponse.BodyHandler<String>>any()))
                .thenReturn(httpResponse);

        CoinMarketCapClient client = new CoinMarketCapClient("key");
        ResponseDTO responseDTO = client.sendRequest(new URIBuilder(URI.create("https://pro-api.coinmarketcap.com/v2"))
                .build());

        Assert.assertNull(responseDTO);
    }

    @Test(expected = CoinMarketCapException.class)
    public void sendRequest_Exception() throws Exception {
        httpClientMockedStatic.when(HttpClient::newHttpClient).thenReturn(httpClientMock);
        Mockito.when(httpClientMock.send(Mockito.any(HttpRequest.class), ArgumentMatchers.<HttpResponse.BodyHandler<String>>any()))
                .thenThrow(new IOException());

        CoinMarketCapClient client = new CoinMarketCapClient("key");
        ResponseDTO responseDTO = client.sendRequest(new URIBuilder(URI.create("https://pro-api.coinmarketcap.com/v2"))
                .build());

        Assert.assertNull(responseDTO);
    }

    @Test
    public void buildUri_Success() {
        CoinMarketCapClient client = new CoinMarketCapClient("key");
        URI uri = client.buildURI("key", "value", "/crypto");

        Assert.assertEquals("https://pro-api.coinmarketcap.com/v2/crypto?key=value", uri.toString());
    }

}
