package org.cryptodata.service.crypto;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.models.data.MetadataMapData;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.models.data.MetadataInfoData;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;

import java.util.List;
import java.util.Map;

public class MetadataService extends ServiceOperation {
    public MetadataService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        this.coinMarketCap = coinMarketCap;
        this.urlBuilder = cryptocurrencyUrl;
    }


    /**
     * Returns a mapping of all cryptocurrencies to unique CoinMarketCap ids.
     *
     * @return list of MetadataData
     */
    public List<MetadataMapData> map() throws CoinMarketCapException {
        return sendRequest(urlBuilder.map().build(), coinMarketCap.apiKey(), getJavaTypeList(MetadataMapData.class));
    }


    /**
     * Returns all static metadata available for one or more cryptocurrencies.
     *
     * @return map with id as Key and MetadataData
     */
    public Map<String, MetadataInfoData> info() throws CoinMarketCapException {
        return sendRequest(urlBuilder.info().build(), coinMarketCap.apiKey(), getJavaTypeMap(MetadataInfoData.class));
    }
}
