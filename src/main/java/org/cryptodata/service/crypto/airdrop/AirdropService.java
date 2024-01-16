package org.cryptodata.service.crypto.airdrop;

import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;
import org.cryptodata.service.ServiceOperation;
import org.cryptodata.service.crypto.airdrop.models.AirdropData;

import java.util.List;

public class AirdropService extends ServiceOperation {

    private final CoinMarketCapUrlBuilder cryptocurrencyUrl;

    public AirdropService(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        super(coinMarketCap, cryptocurrencyUrl);
        this.cryptocurrencyUrl = cryptocurrencyUrl;
    }

    /**
     * Returns information about a single airdrop available on CoinMarketCap. Includes the cryptocurrency metadata.
     *
     * @return AirdropData
     */
    public AirdropData get() throws CoinMarketCapException {
        return sendRequest(cryptocurrencyUrl.airdrop().build(), getJavaType(AirdropData.class));

    }

    /**
     * Returns information about a single airdrop available on CoinMarketCap. Includes the cryptocurrency metadata.
     *
     * @return list of AirdropData
     */
    public List<AirdropData> list() throws CoinMarketCapException {
        return sendRequest(cryptocurrencyUrl.airdrops().build(), getJavaTypeList(AirdropData.class));
    }
}
