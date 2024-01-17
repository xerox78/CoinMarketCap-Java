package servicetests.utilstests;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapFilter;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;
import org.cryptodata.service.crypto.airdrop.AirdropService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoinMarketCapFilterTest {
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
        AirdropService build = filter.start(1).build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?start=1", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_limit_OK() {
        AirdropService build = filter.limit(1).build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?limit=1", build.getUrlBuilder().build().toString());
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
    public void filter_feeType_OK() {
        AirdropService build = filter.feeType("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?fee_type=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_timeStart_OK() {
        AirdropService build = filter.timeStart("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?time_start=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_timeEnd_OK() {
        AirdropService build = filter.timeEnd("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?time_end=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_aux_OK() {
        AirdropService build = filter.aux("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?aux=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_address_OK() {
        AirdropService build = filter.address("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?address=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_category_OK() {
        AirdropService build = filter.category("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?category=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_circulatingSupplyMax_OK() {
        AirdropService build = filter.circulatingSupplyMax("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?circulating_supply_max=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_circulatingSupplyMin_OK() {
        AirdropService build = filter.circulatingSupplyMin("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?circulating_supply_min=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_marketCapMax_OK() {
        AirdropService build = filter.marketCapMax("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?market_cap_max=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_marketCapMin_OK() {
        AirdropService build = filter.marketCapMin("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?market_cap_min=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_slug_OK() {
        AirdropService build = filter.slug("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?slug=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_convert_OK() {
        AirdropService build = filter.convert("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?convert=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_convertId_OK() {
        AirdropService build = filter.convertId("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?convert_id=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_listingStatus_OK() {
        AirdropService build = filter.listingStatus("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?listing_status=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_skipInvalid_OK() {
        AirdropService build = filter.skipInvalid(true).build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?skip_invalid=true", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_sort_OK() {
        AirdropService build = filter.sort("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?sort=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_sortDir_OK() {
        AirdropService build = filter.sortDir("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?sort_dir=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_cryptocurrencyType_OK() {
        AirdropService build = filter.cryptocurrencyType("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?cryptocurrency_type=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_priceMax_OK() {
        AirdropService build = filter.priceMax("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?price_max=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_priceMin_OK() {
        AirdropService build = filter.priceMin("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?price_min=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_volume24hMin_OK() {
        AirdropService build = filter.volume24hMin("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?volume_24h_min=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_volume24hMax_OK() {
        AirdropService build = filter.volume24hMax("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?volume_24h_max=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_percentChange24hMin_OK() {
        AirdropService build = filter.percentChange24hMin("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?percent_change_24h_min=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_percentChange24hMax_OK() {
        AirdropService build = filter.percentChange24hMax("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?percent_change_24h_max=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_tag_OK() {
        AirdropService build = filter.tag("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?tag=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_timePeriod_OK() {
        AirdropService build = filter.timePeriod("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?time_period=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_matchedId_OK() {
        AirdropService build = filter.matchedId("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?matched_id=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_matchedSymbol_OK() {
        AirdropService build = filter.matchedSymbol("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?matched_symbol=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_count_OK() {
        AirdropService build = filter.count("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?count=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_interval_OK() {
        AirdropService build = filter.interval("value").build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?interval=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void filter_all_OK() {
        AirdropService build = filter
                .id("value")
                .symbol("value")
                .start(1)
                .limit(1)
                .date("value")
                .status("value")
                .build();
        try {
            Assert.assertEquals("https://pro-api.coinmarketcap.com?id=value&symbol=value&start=1&limit=1&date=value&status=value", build.getUrlBuilder().build().toString());
        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

}
