package org.cryptodata.service.crypto.metadata;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.crypto.metadata.models.MetadataMapData;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.service.crypto.metadata.models.MetadataInfoData;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;

import java.util.List;
import java.util.Map;

public class MetadataService extends ServiceOperation {
    private final CoinMarketCapUrlBuilder urlBuilder;

    public MetadataService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        super(coinMarketCap, cryptocurrencyUrl);
        this.urlBuilder = cryptocurrencyUrl;
    }


    /**
     * Returns a mapping of all cryptocurrencies to unique CoinMarketCap ids.
     *
     * @return list of MetadataData
     */
    public List<MetadataMapData> map() throws CoinMarketCapException {
        return sendHttpRequest(urlBuilder.map().build(), getJavaTypeList(MetadataMapData.class));
    }


    /**
     * Returns all static metadata available for one or more cryptocurrencies.
     *
     * @return map with id as Key and MetadataData
     */
    public Map<String, MetadataInfoData> info() throws CoinMarketCapException {
        return sendHttpRequest(urlBuilder.info().build(), getJavaTypeMap(MetadataInfoData.class));
    }
}
