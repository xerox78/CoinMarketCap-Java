package org.cryptodata.service.crypto;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.models.data.AirdropData;

import java.util.List;

public class AirdropService extends ServiceOperation {

    public AirdropService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        this.coinMarketCap = coinMarketCap;
        this.urlBuilder = cryptocurrencyUrl;
    }

    /**
     * Returns information about a single airdrop available on CoinMarketCap. Includes the cryptocurrency metadata.
     *
     * @return AirdropData
     */
    public AirdropData get() throws CoinMarketCapException {
        return sendRequest(urlBuilder.airdrop().build(), coinMarketCap.getApiKey(), getJavaType(AirdropData.class));

    }

    /**
     * Returns information about a single airdrop available on CoinMarketCap. Includes the cryptocurrency metadata.
     *
     * @return list of AirdropData
     */
    public List<AirdropData> list() throws CoinMarketCapException {
        return sendRequest(urlBuilder.airdrops().build(), coinMarketCap.getApiKey(), getJavaTypeList(AirdropData.class));
    }
}
