package org.cryptodata.service.exchange.asset;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.service.exchange.asset.models.AssetData;

import java.util.List;

public class AssetService extends ServiceOperation {
    private final CoinMarketCapUrlBuilder urlBuilder;

    public AssetService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        super(coinMarketCap, cryptocurrencyUrl);
        this.urlBuilder = cryptocurrencyUrl;
    }

    /**
     * Returns the exchange assets in the form of token holdings.
     */
    public List<AssetData> list() throws CoinMarketCapException {
        return sendHttpRequest(urlBuilder.assets().build(), getJavaTypeList(AssetData.class));
    }

}
