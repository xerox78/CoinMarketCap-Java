package org.cryptodata.service.exchange.metadata;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.service.exchange.metadata.models.InfoData;
import org.cryptodata.service.exchange.metadata.models.MapData;

import java.util.List;
import java.util.Map;

public class MetadataService extends ServiceOperation {
    private final CoinMarketCapUrlBuilder urlBuilder;

    public MetadataService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        super(coinMarketCap, cryptocurrencyUrl);
        this.urlBuilder = cryptocurrencyUrl;
    }

    /**
     * Returns all static metadata for one or more exchanges.
     */
    public Map<String, InfoData> info() throws CoinMarketCapException {
        return sendHttpRequest(urlBuilder.trending().gainersLosers().build(), getJavaTypeMap(InfoData.class));
    }

    /**
     * Returns a paginated list of all active cryptocurrency exchanges by CoinMarketCap ID.
     */
    public List<MapData> map() throws CoinMarketCapException {
        return sendHttpRequest(urlBuilder.trending().gainersLosers().build(), getJavaTypeList(MapData.class));
    }
}
