package org.cryptodata.service.community.trending;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapUrl;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.service.community.trending.models.TokenData;
import org.cryptodata.service.community.trending.models.TopicData;

import java.util.List;

public class TrendingService extends ServiceOperation {

    private final CoinMarketCapUrl.CoinMarketCapUrlBuilder urlBuilder;

    public TrendingService(CoinMarketCap coinMarketCap, CoinMarketCapUrl.CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        super(coinMarketCap, cryptocurrencyUrl);
        this.urlBuilder = cryptocurrencyUrl;
    }

    public List<TopicData> topic() throws CoinMarketCapException {
        return sendHttpRequest(urlBuilder.trending().topic().build(), getJavaTypeList(TopicData.class));
    }

    public List<TokenData> token() throws CoinMarketCapException {
        return sendHttpRequest(urlBuilder.trending().token().build(), getJavaTypeList(TokenData.class));
    }
}
