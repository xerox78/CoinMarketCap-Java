package org.cryptodata.service.content.data;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapUrl;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.service.content.data.models.ContentLatestData;

import java.util.List;

public class ContentDataService extends ServiceOperation {

    private final CoinMarketCapUrl.CoinMarketCapUrlBuilder cryptocurrencyUrl;

    public ContentDataService(CoinMarketCap coinMarketCap, CoinMarketCapUrl.CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        super(coinMarketCap, cryptocurrencyUrl);
        this.cryptocurrencyUrl = cryptocurrencyUrl;
    }

    public List<ContentLatestData> latest() throws CoinMarketCapException {
        return sendHttpRequest(cryptocurrencyUrl.latest().build(), getJavaTypeList(ContentLatestData.class));
    }
}
