package service;

import org.apache.http.client.utils.URIBuilder;
import org.cryptodata.api.CoinMarketCapClient;
import org.cryptodata.dto.DataDTO;
import org.cryptodata.dto.ResponseDTO;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.models.Listing;
import org.cryptodata.service.ListingService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

import java.net.URI;
import java.util.TreeMap;

import static org.mockito.ArgumentMatchers.any;

public class ListingServiceTest {

    @Mock
    private CoinMarketCapClient client;

    private ResponseDTO createResponseDTO() {
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
        return mockResponseDTO;
    }

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetListing_Success() throws Exception {

        URI uri = new URIBuilder().build();
        Mockito.when(client.sendRequest(any())).thenReturn(createResponseDTO());

        ListingService listingService = new ListingService(client);
        Listing actualResponse = listingService.getListing(1);

        Assert.assertEquals(Integer.valueOf(1), actualResponse.getId());
        Assert.assertEquals(Integer.valueOf(1), actualResponse.getRank());
        Assert.assertEquals("Bitcoin", actualResponse.getName());
        Assert.assertEquals("BTC", actualResponse.getSymbol());
        Assert.assertEquals(2.01, actualResponse.getTotalSupply(), 0);
        Assert.assertEquals(2.01, actualResponse.getCirculatingSupply(), 0);
        Assert.assertEquals(2.0, actualResponse.getMaxSupply(), 0);
    }

    @Test
    public void testGetListing_Fail() throws Exception {

        Mockito.when(client.sendRequest(any())).thenReturn(new ResponseDTO());

        ListingService listingService = new ListingService(client);
        Listing actualResponse = null;
        try
        {
            actualResponse = listingService.getListing(1);
        }catch (CoinMarketCapException e)
        {
            Assert.assertEquals(e.getMessage(), "Failed to retrieve listing details");
        }

        Assert.assertNull(actualResponse);
    }


}