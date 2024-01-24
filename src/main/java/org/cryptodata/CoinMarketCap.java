package org.cryptodata;

import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;
import org.cryptodata.service.blockchain.BlockchainService;
import org.cryptodata.service.community.CommunityService;
import org.cryptodata.service.content.ContentService;
import org.cryptodata.service.crypto.CryptocurrencyService;
import org.cryptodata.service.exchange.ExchangeService;
import org.cryptodata.service.fiat.FiatService;
import org.cryptodata.service.globalmetrics.GlobalMetricService;
import org.cryptodata.service.key.KeyService;
import org.cryptodata.service.tools.ToolsService;

/*
 * This class provides methods to create instances of services groups.
 */
public record CoinMarketCap(String apiKey) {

    /**
     * Creates an instance of CryptocurrencyService for version 1 of the CoinMarketCap API.
     *
     * @return CryptocurrencyService instance for version 1.
     */
    public CryptocurrencyService cryptocurrencyV1() {
        return new CryptocurrencyService(this, new CoinMarketCapUrlBuilder().v1().cryptocurrency());
    }

    /**
     * Creates an instance of CryptocurrencyService for version 2 of the CoinMarketCap API.
     *
     * @return CryptocurrencyService instance for version 2.
     */
    public CryptocurrencyService cryptocurrencyV2() {
        return new CryptocurrencyService(this, new CoinMarketCapUrlBuilder().v2().cryptocurrency());
    }

    /**
     * Creates an instance of CryptocurrencyService for version 3 of the CoinMarketCap API.
     *
     * @return CryptocurrencyService instance for version 3.
     */
    public CryptocurrencyService cryptocurrencyV3() {
        return new CryptocurrencyService(this, new CoinMarketCapUrlBuilder().v3().cryptocurrency());
    }

    /**
     * Creates an instance of FiatService for version 1 of the CoinMarketCap API.
     *
     * @return FiatService instance for version 1.
     */
    public FiatService fiatV1() {
        return new FiatService(this, new CoinMarketCapUrlBuilder().v1().fiat());
    }


    /**
     * Creates an instance of BlockchainService for version 1 of the CoinMarketCap API.
     *
     * @return BlockchainService instance for version 1.
     */
    public BlockchainService blockchainV1() {
        return new BlockchainService(this, new CoinMarketCapUrlBuilder().v1().blockchain());
    }

    /**
     * Creates an instance of ExchangeService for version 1 of the CoinMarketCap API.
     *
     * @return ExchangeService instance for version 1.
     */
    public ExchangeService exchangeV1() {
        return new ExchangeService(this, new CoinMarketCapUrlBuilder().v1().exchange());
    }

    /**
     * Creates an instance of KeyService for version 1 of the CoinMarketCap API.
     *
     * @return KeyService instance for version 1.
     */
    public KeyService keyV1() {
        return new KeyService(this, new CoinMarketCapUrlBuilder().v1().key());
    }


    /**
     * Creates an instance of GlobalMetricService for version 1 of the CoinMarketCap API.
     *
     * @return GlobalMetricService instance for version 1.
     */
    public GlobalMetricService globalMetricsV1() {
        return new GlobalMetricService(this, new CoinMarketCapUrlBuilder().v1().globalMetrics());
    }

    /**
     * Creates an instance of ToolsService for version 2 of the CoinMarketCap API.
     *
     * @return ToolsService instance for version 2.
     */
    public ToolsService toolsV2() {
        return new ToolsService(this, new CoinMarketCapUrlBuilder().v2().tools());
    }

    /**
     * Creates an instance of ContentService for version 1 of the CoinMarketCap API.
     *
     * @return ContentService instance for version 1.
     */
    public ContentService contentV1() {
        return new ContentService(this, new CoinMarketCapUrlBuilder().v1().content());
    }

    /**
     * Creates an instance of CommunityService for version 1 of the CoinMarketCap API.
     *
     * @return CommunityService instance for version 1.
     */
    public CommunityService communityV1() {
        return new CommunityService(this, new CoinMarketCapUrlBuilder().v1().community());
    }

}
