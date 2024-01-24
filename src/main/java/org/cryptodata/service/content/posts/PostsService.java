package org.cryptodata.service.content.posts;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapUrl;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.service.content.posts.models.ContentPostsCommentsData;
import org.cryptodata.service.content.posts.models.ContentPostsData;

import java.util.List;

public class PostsService extends ServiceOperation {

    private final CoinMarketCapUrl.CoinMarketCapUrlBuilder cryptocurrencyUrl;

    public PostsService(CoinMarketCap coinMarketCap, CoinMarketCapUrl.CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        super(coinMarketCap, cryptocurrencyUrl);
        this.cryptocurrencyUrl = cryptocurrencyUrl;
    }

    public ContentPostsData top() throws CoinMarketCapException {
        return sendHttpRequest(cryptocurrencyUrl.posts().top().build(), getJavaType(ContentPostsData.class));
    }

    public ContentPostsData latest() throws CoinMarketCapException {
        return sendHttpRequest(cryptocurrencyUrl.posts().latest().build(), getJavaType(ContentPostsData.class));
    }

    public List<ContentPostsCommentsData> comments() throws CoinMarketCapException {
        return sendHttpRequest(cryptocurrencyUrl.posts().comments().build(), getJavaTypeList(ContentPostsCommentsData.class));
    }
}