package org.cryptodata.service;

import static org.cryptodata.service.CoinMarketCapFilter.CoinMarketCapFilterEnum.*;


public class CoinMarketCapFilter<R extends ServiceOperation> {

    private final R instance;

    public CoinMarketCapFilter(R service) {
        this.instance = service;
    }

    public CoinMarketCapFilter<R> id(String value) {
        instance.getUrlBuilder().addParameter(PARAM_ID.value, value);
        return this;
    }

    public CoinMarketCapFilter<R> symbol(String value) {
        instance.getUrlBuilder().addParameter(PARAM_SYMBOL.value, value);
        return this;
    }

    public CoinMarketCapFilter<R> start(String value) {
        instance.getUrlBuilder().addParameter(PARAM_START_INDEX.value, value);
        return this;
    }

    public CoinMarketCapFilter<R> limit(String value) {
        instance.getUrlBuilder().addParameter(PARAM_LIMIT.value, value);
        return this;
    }

    public CoinMarketCapFilter<R> date(String value) {
        instance.getUrlBuilder().addParameter(PARAM_DATE.value, value);
        return this;
    }

    public CoinMarketCapFilter<R> status(String value) {
        instance.getUrlBuilder().addParameter(PARAM_STATUS.value, value);
        return this;
    }

    public R build() {
        return instance;
    }

    enum CoinMarketCapFilterEnum {
        PARAM_ID("id"),
        PARAM_SYMBOL("symbol"),
        PARAM_LIMIT("limit"),
        PARAM_START_INDEX("start"),
        PARAM_STATUS("status"),
        PARAM_DATE("date");

        private final String value;

        CoinMarketCapFilterEnum(String value) {
            this.value = value;
        }
    }
}
