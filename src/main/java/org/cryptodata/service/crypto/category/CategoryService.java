package org.cryptodata.service.crypto.category;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.service.crypto.category.models.CategoryData;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;

import java.util.List;

public class CategoryService extends ServiceOperation {
    private final CoinMarketCapUrlBuilder urlBuilder;

    public CategoryService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        super(coinMarketCap, cryptocurrencyUrl);
        this.urlBuilder = cryptocurrencyUrl;
    }

    /**
     * Returns information about a single coin category available on CoinMarketCap.
     *
     * @return instance of CoinMarketCapFilter
     */
    public CategoryData get() throws CoinMarketCapException {
        return sendHttpRequest(urlBuilder.category().build(), getJavaType(CategoryData.class));
    }

    /**
     * Returns information about all coin categories available on CoinMarketCap.
     *
     * @return instance of CoinMarketCapFilter
     */
    public List<CategoryData> list() throws CoinMarketCapException {
        return sendHttpRequest(urlBuilder.categories().build(), getJavaTypeList(CategoryData.class));
    }


}
