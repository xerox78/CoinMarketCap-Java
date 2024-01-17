package org.cryptodata.service.fiat.map;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapUrl;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.service.crypto.airdrop.models.AirdropData;
import org.cryptodata.service.fiat.map.models.FiatMapData;

import java.util.List;

public class MapService extends ServiceOperation {

    private final CoinMarketCapUrlBuilder cryptocurrencyUrl;

    public MapService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        super(coinMarketCap, cryptocurrencyUrl);
        this.cryptocurrencyUrl = cryptocurrencyUrl;
    }

    public List<FiatMapData> map() throws CoinMarketCapException {
        return sendHttpRequest(cryptocurrencyUrl.map().build(), getJavaTypeList(FiatMapData.class));
    }
}
