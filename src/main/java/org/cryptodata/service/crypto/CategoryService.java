package org.cryptodata.service.crypto;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.models.data.CategoryData;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;

import java.util.List;

public class CategoryService extends ServiceOperation
{
    public CategoryService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        this.coinMarketCap = coinMarketCap;
        this.urlBuilder = cryptocurrencyUrl;
    }

    /**
     * Returns information about a single coin category available on CoinMarketCap.
     *
     * @return instance of CoinMarketCapFilter
     */
    public CategoryData get() throws CoinMarketCapException {
        return sendRequest(urlBuilder.category().build(), coinMarketCap.getApiKey(), getJavaType(CategoryData.class));
    }

    /**
     * Returns information about all coin categories available on CoinMarketCap.
     *
     * @return instance of CoinMarketCapFilter
     */
    public List<CategoryData> list() throws CoinMarketCapException {
        return sendRequest(urlBuilder.categories().build(), coinMarketCap.getApiKey(), getJavaTypeList(CategoryData.class));
    }


}
