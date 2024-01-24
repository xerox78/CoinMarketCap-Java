package org.cryptodata.service.tools.convert;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.service.tools.convert.models.ConvertData;

public class ConvertService extends ServiceOperation {

    private final CoinMarketCapUrlBuilder cryptocurrencyUrl;

    public ConvertService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        super(coinMarketCap, cryptocurrencyUrl);
        this.cryptocurrencyUrl = cryptocurrencyUrl;
    }

    public ConvertData convert() throws CoinMarketCapException {
        return sendHttpRequest(cryptocurrencyUrl.priceConversion().build(), getJavaType(ConvertData.class));
    }
}
