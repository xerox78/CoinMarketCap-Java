package org.cryptodata.service;

import static org.cryptodata.service.CoinMarketCapFilter.CoinMarketCapFilterEnum.*;


/**
 * Represents a filter builder for constructing parameters to refine CoinMarketCap API requests.
 *
 * @param <R> The type of the service operation to which the filter is applied.
 */
public class CoinMarketCapFilter<R extends ServiceOperation> {

    /**
     * The instance of the service operation to which the filter is applied.
     */
    private final R instance;

    /**
     * Constructs a CoinMarketCapFilter for the specified service operation.
     *
     * @param service The service operation to apply the filter to.
     */
    public CoinMarketCapFilter(R service) {
        this.instance = service;
    }

    /**
     * Adds the "id" parameter to the filter.
     *
     * @param value The value of the "id" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> id(String value) {
        instance.getUrlBuilder().addParameter(PARAM_ID.value, value);
        return this;
    }

    /**
     * Adds the "symbol" parameter to the filter.
     *
     * @param value The value of the "symbol" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> symbol(String value) {
        instance.getUrlBuilder().addParameter(PARAM_SYMBOL.value, value);
        return this;
    }

    /**
     * Adds the "start" parameter to the filter.
     *
     * @param value The value of the "start" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> start(String value) {
        instance.getUrlBuilder().addParameter(PARAM_START_INDEX.value, value);
        return this;
    }

    /**
     * Adds the "limit" parameter to the filter.
     *
     * @param value The value of the "limit" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> limit(String value) {
        instance.getUrlBuilder().addParameter(PARAM_LIMIT.value, value);
        return this;
    }

    /**
     * Adds the "date" parameter to the filter.
     *
     * @param value The value of the "date" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> date(String value) {
        instance.getUrlBuilder().addParameter(PARAM_DATE.value, value);
        return this;
    }

    /**
     * Adds the "status" parameter to the filter.
     *
     * @param value The value of the "status" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> status(String value) {
        instance.getUrlBuilder().addParameter(PARAM_STATUS.value, value);
        return this;
    }

    /**
     * Builds and returns the original service operation instance with the applied filter.
     *
     * @return The original service operation instance with the applied filter.
     */
    public R build() {
        return instance;
    }

    /**
     * Enum representing the possible parameters for CoinMarketCap filters.
     */
    enum CoinMarketCapFilterEnum {
        PARAM_ID("id"),
        PARAM_SYMBOL("symbol"),
        PARAM_LIMIT("limit"),
        PARAM_START_INDEX("start"),
        PARAM_STATUS("status"),
        PARAM_DATE("date");

        /**
         * The value of the parameter.
         */
        private final String value;

        /**
         * Constructs the enum with the specified value.
         *
         * @param value The value of the parameter.
         */
        CoinMarketCapFilterEnum(String value) {
            this.value = value;
        }
    }
}
