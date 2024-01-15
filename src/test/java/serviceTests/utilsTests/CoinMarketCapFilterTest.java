package serviceTests.utilsTests;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapFilter;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;
import org.cryptodata.service.crypto.AirdropService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoinMarketCapFilterTest
{
    private CoinMarketCapFilter<AirdropService> filter;

    @Before
    public void initialize() {
        filter = new CoinMarketCapFilter<>(
                new AirdropService(
                        new CoinMarketCap(""),
                        new CoinMarketCapUrlBuilder()
                )
        );
    }

    @Test
    public void filter_id_OK() {
        AirdropService build = filter.id("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?id=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_symbol_OK() {
        AirdropService build = filter.symbol("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?symbol=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_startIndex_OK() {
        AirdropService build = filter.start("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?start=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_limit_OK() {
        AirdropService build = filter.limit("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?limit=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_date_OK() {
        AirdropService build = filter.date("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?date=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_status_OK() {
        AirdropService build = filter.status("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?status=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_all_OK() {
        AirdropService build = filter
                .id("value")
                .symbol("value")
                .start("value")
                .limit("value")
                .date("value")
                .status("value")
                .build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?id=value&symbol=value&start=value&limit=value&date=value&status=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

}
