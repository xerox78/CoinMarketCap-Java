package serviceTests.utilsTests;

import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapUrl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.URI;

public class CoinMarketCapUrlTest
{
    private CoinMarketCapUrl.CoinMarketCapUrlBuilder urlBuilder;

    private String urlBase = "https://pro-api.coinmarketcap.com";

    @Before
    public void initialize() {
        urlBuilder = new CoinMarketCapUrl.CoinMarketCapUrlBuilder();
    }

    @Test
    public void urlBuilder001() {
        try {
            URI build = urlBuilder.latest().build();
            Assert.assertEquals(urlBase + "/latest", build.toString());

        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void urlBuilder002() {
        try {
            URI build = urlBuilder.cryptocurrency().build();
            Assert.assertEquals(urlBase + "/cryptocurrency", build.toString());

        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void urlBuilder003() {
        try {
            URI build = urlBuilder.airdrops().build();
            Assert.assertEquals(urlBase + "/airdrops", build.toString());

        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void urlBuilder004() {
        try {
            URI build = urlBuilder.airdrop().build();
            Assert.assertEquals(urlBase + "/airdrop", build.toString());

        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void urlBuilder005() {
        try {
            URI build = urlBuilder.historical().build();
            Assert.assertEquals(urlBase + "/historical", build.toString());

        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void urlBuilder006() {
        try {
            URI build = urlBuilder.listings().build();
            Assert.assertEquals(urlBase + "/listings", build.toString());

        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void urlBuilder007() {
        try {
            URI build = urlBuilder.trending().build();
            Assert.assertEquals(urlBase + "/trending", build.toString());

        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void urlBuilder008() {
        try {
            URI build = urlBuilder.ohlcv().build();
            Assert.assertEquals(urlBase + "/ohlcv", build.toString());

        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void urlBuilder009() {
        try {
            URI build = urlBuilder.quotes().build();
            Assert.assertEquals(urlBase + "/quotes", build.toString());

        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void urlBuilder010() {
        try {
            URI build = urlBuilder.categories().build();
            Assert.assertEquals(urlBase + "/categories", build.toString());

        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void urlBuilder011() {
        try {
            URI build = urlBuilder.category().build();
            Assert.assertEquals(urlBase + "/category", build.toString());

        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void urlBuilder012() {
        try {
            URI build = urlBuilder.gainersLosers().build();
            Assert.assertEquals(urlBase + "/gainers-losers", build.toString());

        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void urlBuilder013() {
        try {
            URI build = urlBuilder.info().build();
            Assert.assertEquals(urlBase + "/info", build.toString());

        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void urlBuilder014() {
        try {
            URI build = urlBuilder.map().build();
            Assert.assertEquals(urlBase + "/map", build.toString());

        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void urlBuilder015() {
        try {
            URI build = urlBuilder.marketPairs().build();
            Assert.assertEquals(urlBase + "/market-pairs", build.toString());

        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void urlBuilder016() {
        try {
            URI build = urlBuilder.newPath().build();
            Assert.assertEquals(urlBase + "/new", build.toString());

        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void urlBuilder017() {
        try {
            URI build = urlBuilder.pricePerformanceStats().build();
            Assert.assertEquals(urlBase + "/price-performance-stats", build.toString());

        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void urlBuilder018() {
        try {
            URI build = urlBuilder.mostVisited().build();
            Assert.assertEquals(urlBase + "/most-visited", build.toString());

        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void urlBuilder019() {
        try {
            URI build = urlBuilder.v1().build();
            Assert.assertEquals(urlBase + "/v1", build.toString());

        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void urlBuilder020() {
        try {
            URI build = urlBuilder.v2().build();
            Assert.assertEquals(urlBase + "/v2", build.toString());

        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void urlBuilder021() {
        try {
            URI build = urlBuilder.v3().build();
            Assert.assertEquals(urlBase + "/v3", build.toString());

        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void urlBuilder022() {
        try {
            URI build = urlBuilder.exchange().build();
            Assert.assertEquals(urlBase + "/exchange", build.toString());

        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }

    @Test
    public void urlBuilder023() {
        try {
            URI build = urlBuilder.assets().build();
            Assert.assertEquals(urlBase + "/assets", build.toString());

        } catch (CoinMarketCapException e) {
            Assert.fail();
        }
    }
}
