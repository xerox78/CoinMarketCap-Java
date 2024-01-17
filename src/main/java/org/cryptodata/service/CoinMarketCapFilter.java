package org.cryptodata.service;

import org.cryptodata.service.crypto.airdrop.models.AirdropStatus;

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
        instance.getUrlBuilder().addParameter(ID.value, value);
        return this;
    }

    /**
     * Adds the "symbol" parameter to the filter.
     *
     * @param value The value of the "symbol" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> symbol(String value) {
        instance.getUrlBuilder().addParameter(SYMBOL.value, value);
        return this;
    }

    /**
     * Adds the "slug" parameter to the filter.
     *
     * @param value The value of the "slug" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> slug(String value) {
        instance.getUrlBuilder().addParameter(SLUG.value, value);
        return this;
    }

    /**
     * Adds the "start" parameter to the filter.
     *
     * @param value The value of the "start" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> start(int value) {
        instance.getUrlBuilder().addParameter(START_INDEX.value, String.valueOf(value));
        return this;
    }

    /**
     * Adds the "limit" parameter to the filter.
     *
     * @param value The value of the "limit" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> limit(int value) {
        instance.getUrlBuilder().addParameter(LIMIT.value, String.valueOf(value));
        return this;
    }

    /**
     * Adds the "date" parameter to the filter.
     *
     * @param value The value of the "date" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> date(String value) {
        instance.getUrlBuilder().addParameter(DATE.value, value);
        return this;
    }

    /**
     * Adds the "status" parameter to the filter.
     *
     * @param value The value of the "status" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> status(String value) {
        instance.getUrlBuilder().addParameter(STATUS.value, value);
        return this;
    }

    /**
     * Adds the "convert" parameter to the filter.
     *
     * @param value The value of the "convert" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> convert(String value) {
        instance.getUrlBuilder().addParameter(CONVERT.value, value);
        return this;
    }

    /**
     * Adds the "convert_id" parameter to the filter.
     *
     * @param value The value of the "convert_id" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> convertId(String value) {
        instance.getUrlBuilder().addParameter(CONVERT_ID.value, value);
        return this;
    }

    /**
     * Adds the "listing_status" parameter to the filter.
     *
     * @param value The value of the "listing_status" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> listingStatus(String value) {
        instance.getUrlBuilder().addParameter(LISTING_STATUS.value, value);
        return this;
    }

    /**
     * Adds the "aux" parameter to the filter.
     *
     * @param value The value of the "aux" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> aux(String value) {
        instance.getUrlBuilder().addParameter(AUX.value, value);
        return this;
    }

    /**
     * Adds the "skip_invalid" parameter to the filter.
     *
     * @param value The value of the "skip_invalid" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> skipInvalid(boolean value) {
        instance.getUrlBuilder().addParameter(SKIP_INVALID.value, String.valueOf(value));
        return this;
    }

    /**
     * Adds the "address" parameter to the filter.
     *
     * @param value The value of the "address" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> address(String value) {
        instance.getUrlBuilder().addParameter(ADDRESS.value, value);
        return this;
    }

    /**
     * Adds the "sort" parameter to the filter.
     *
     * @param value The value of the "sort" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> sort(String value) {
        instance.getUrlBuilder().addParameter(SORT.value, value);
        return this;
    }

    /**
     * Adds the "sort_dir" parameter to the filter.
     *
     * @param value The value of the "sort_dir" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> sortDir(String value) {
        instance.getUrlBuilder().addParameter(SORT_DIR.value, value);
        return this;
    }

    /**
     * Adds the "cryptocurrency_type" parameter to the filter.
     *
     * @param value The value of the "cryptocurrency_type" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> cryptocurrencyType(String value) {
        instance.getUrlBuilder().addParameter(CRYPTOCURRENCY_TYPE.value, value);
        return this;
    }

    /**
     * Adds the "price_max" parameter to the filter.
     *
     * @param value The value of the "price_max" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> priceMax(String value) {
        instance.getUrlBuilder().addParameter(PRICE_MAX.value, value);
        return this;
    }

    /**
     * Adds the "price_min" parameter to the filter.
     *
     * @param value The value of the "price_min" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> priceMin(String value) {
        instance.getUrlBuilder().addParameter(PRICE_MIN.value, value);
        return this;
    }

    /**
     * Adds the "market_cap_min" parameter to the filter.
     *
     * @param value The value of the "market_cap_min" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> marketCapMin(String value) {
        instance.getUrlBuilder().addParameter(MARKET_CAP_MIN.value, value);
        return this;
    }

    /**
     * Adds the "market_cap_max" parameter to the filter.
     *
     * @param value The value of the "market_cap_max" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> marketCapMax(String value) {
        instance.getUrlBuilder().addParameter(MARKET_CAP_MAX.value, value);
        return this;
    }

    /**
     * Adds the "volume_24h_min" parameter to the filter.
     *
     * @param value The value of the "volume_24h_min" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> volume24hMin(String value) {
        instance.getUrlBuilder().addParameter(VOLUME_24H_MIN.value, value);
        return this;
    }

    /**
     * Adds the "volume_24h_max" parameter to the filter.
     *
     * @param value The value of the "volume_24h_max" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> volume24hMax(String value) {
        instance.getUrlBuilder().addParameter(VOLUME_24H_MAX.value, value);
        return this;
    }

    /**
     * Adds the "circulating_supply_min" parameter to the filter.
     *
     * @param value The value of the "circulating_supply_min" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> circulatingSupplyMin(String value) {
        instance.getUrlBuilder().addParameter(CIRCULATING_SUPPLY_MIN.value, value);
        return this;
    }

    /**
     * Adds the "circulating_supply_max" parameter to the filter.
     *
     * @param value The value of the "circulating_supply_max" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> circulatingSupplyMax(String value) {
        instance.getUrlBuilder().addParameter(CIRCULATING_SUPPLY_MAX.value, value);
        return this;
    }

    /**
     * Adds the "percent_change_24h_min" parameter to the filter.
     *
     * @param value The value of the "percent_change_24h_min" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> percentChange24hMin(String value) {
        instance.getUrlBuilder().addParameter(PERCENT_CHANGE_24H_MIN.value, value);
        return this;
    }

    /**
     * Adds the "percent_change_24h_max" parameter to the filter.
     *
     * @param value The value of the "percent_change_24h_max" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> percentChange24hMax(String value) {
        instance.getUrlBuilder().addParameter(PERCENT_CHANGE_24H_MAX.value, value);
        return this;
    }

    /**
     * Adds the "tag" parameter to the filter.
     *
     * @param value The value of the "tag" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> tag(String value) {
        instance.getUrlBuilder().addParameter(TAG.value, value);
        return this;
    }

    /**
     * Adds the "time_period" parameter to the filter.
     *
     * @param value The value of the "time_period" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> timePeriod(String value) {
        instance.getUrlBuilder().addParameter(TIME_PERIOD.value, value);
        return this;
    }

    /**
     * Adds the "matched_id" parameter to the filter.
     *
     * @param value The value of the "matched_id" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> matchedId(String value) {
        instance.getUrlBuilder().addParameter(MATCHED_ID.value, value);
        return this;
    }

    /**
     * Adds the "matched_symbol" parameter to the filter.
     *
     * @param value The value of the "matched_symbol" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> matchedSymbol(String value) {
        instance.getUrlBuilder().addParameter(MATCHED_SYMBOL.value, value);
        return this;
    }

    /**
     * Adds the "category" parameter to the filter.
     *
     * @param value The value of the "category" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> category(String value) {
        instance.getUrlBuilder().addParameter(CATEGORY.value, value);
        return this;
    }

    /**
     * Adds the "fee_type" parameter to the filter.
     *
     * @param value The value of the "fee_type" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> feeType(String value) {
        instance.getUrlBuilder().addParameter(FEE_TYPE.value, value);
        return this;
    }

    /**
     * Adds the "time_start" parameter to the filter.
     *
     * @param value The value of the "time_start" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> timeStart(String value) {
        instance.getUrlBuilder().addParameter(TIME_START.value, value);
        return this;
    }

    /**
     * Adds the "time_end" parameter to the filter.
     *
     * @param value The value of the "time_start" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> timeEnd(String value) {
        instance.getUrlBuilder().addParameter(TIME_END.value, value);
        return this;
    }

    /**
     * Adds the "count" parameter to the filter.
     *
     * @param value The value of the "count" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> count(String value) {
        instance.getUrlBuilder().addParameter(COUNT.value, value);
        return this;
    }

    /**
     * Adds the "interval" parameter to the filter.
     *
     * @param value The value of the "interval" parameter.
     * @return This CoinMarketCapFilter instance for method chaining.
     */
    public CoinMarketCapFilter<R> interval(String value) {
        instance.getUrlBuilder().addParameter(INTERVAL.value, value);
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
        ID("id"),
        SYMBOL("symbol"),
        LIMIT("limit"),
        START_INDEX("start"),
        STATUS("status"),
        DATE("date"),
        CONVERT("convert"),
        CONVERT_ID("convert_id"),
        LISTING_STATUS("listing_status"),
        SLUG("slug"),
        ADDRESS("address"),
        SKIP_INVALID("skip_invalid"),
        AUX("aux"),
        SORT("sort"),
        SORT_DIR("sort_dir"),
        CRYPTOCURRENCY_TYPE("cryptocurrency_type"),
        PRICE_MIN("price_min"),
        PRICE_MAX("price_max"),
        MARKET_CAP_MIN("market_cap_min"),
        MARKET_CAP_MAX("market_cap_max"),
        VOLUME_24H_MAX("volume_24h_max"),
        VOLUME_24H_MIN("volume_24h_min"),
        CIRCULATING_SUPPLY_MIN("circulating_supply_min"),
        CIRCULATING_SUPPLY_MAX("circulating_supply_max"),
        PERCENT_CHANGE_24H_MIN("percent_change_24h_min"),
        PERCENT_CHANGE_24H_MAX("percent_change_24h_max"),
        TAG("tag"),
        CATEGORY("category"),
        MATCHED_ID("matched_id"),
        MATCHED_SYMBOL("matched_symbol"),
        FEE_TYPE("fee_type"),
        TIME_START("time_start"),
        TIME_END("time_end"),
        COUNT("count"),
        INTERVAL("interval"),
        TIME_PERIOD("time_period");

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
