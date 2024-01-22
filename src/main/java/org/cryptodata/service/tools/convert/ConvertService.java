package org.cryptodata.service.tools.convert;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.service.key.info.models.KeyInfoData;

public class ConvertService extends ServiceOperation {

    private final CoinMarketCapUrlBuilder cryptocurrencyUrl;

    public ConvertService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        super(coinMarketCap, cryptocurrencyUrl);
        this.cryptocurrencyUrl = cryptocurrencyUrl;
    }

    //TODO create the POJO
    public KeyInfoData convert() throws CoinMarketCapException {
        return sendHttpRequest(cryptocurrencyUrl.tools().priceConversion().build(), getJavaType(KeyInfoData.class));
    }
}
