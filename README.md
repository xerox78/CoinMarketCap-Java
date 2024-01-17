# CoinMarketCap-Java

This Java library provides a convenient way to interact with the CoinMarketCap API. It includes various service methods
to retrieve information about cryptocurrencies, market data, and more.
Please refer to  **[CoinMarketCap Api official documentation](https://coinmarketcap.com/api/documentation/v1/)**

## CoinMarketCap API Supported Endpoints

### Cryptocurrency

<span style="color: green;">[**/v1/cryptocurrency/map**](https://coinmarketcap.com/api/documentation/v1/#operation/getV1CryptocurrencyMap)</span>
    - Description: CoinMarketCap ID map.

<span style="color: green;">[**/v2/cryptocurrency/info**](https://coinmarketcap.com/api/documentation/v1/#operation/getV2CryptocurrencyInfo)</span>
    - Description: Metadata.

<span style="color: green;">[**/v1/cryptocurrency/listings/latest**](https://coinmarketcap.com/api/documentation/v1/#operation/getV1CryptocurrencyListingsLatest)</span>
    - Description: Latest listings.

<span style="color: green;">[**/v1/cryptocurrency/listings/historical**](https://coinmarketcap.com/api/documentation/v1/#operation/getV1CryptocurrencyListingsHistorical)</span>
    - Description: Historical listings.

<span style="color: green;">[**/v1/cryptocurrency/listings/new**](https://coinmarketcap.com/api/documentation/v1/#operation/getV1CryptocurrencyListingsNew)</span>
    - Description: New listings.

<span style="color: green;">[**/v2/cryptocurrency/quotes/latest**](https://coinmarketcap.com/api/documentation/v1/#operation/getV2CryptocurrencyQuotesLatest)</span>
    - Description: Latest quotes.

<span style="color: green;">[**/v2/cryptocurrency/quotes/historical**](https://coinmarketcap.com/api/documentation/v1/#operation/getV2CryptocurrencyQuotesHistorical)</span>
    - Description: Historical quotes.

<span style="color: green;">[**/v3/cryptocurrency/quotes/historical**](https://coinmarketcap.com/api/documentation/v1/#operation/getV3CryptocurrencyQuotesHistorical)</span>
    - Description: Historical quotes.

<span style="color: green;">[**/v2/cryptocurrency/market-pairs/latest**](https://coinmarketcap.com/api/documentation/v1/#operation/getV2CryptocurrencyMarketpairsLatest)</span>
    - Description: Latest market pairs.

<span style="color: green;">[**/v2/cryptocurrency/ohlcv/latest**](https://coinmarketcap.com/api/documentation/v1/#operation/getV2CryptocurrencyOhlcvLatest)</span>
    - Description: Latest OHLCV (Open, High, Low, Close, Volume).

<span style="color: green;">[**/v2/cryptocurrency/ohlcv/historical**](https://coinmarketcap.com/api/documentation/v1/#operation/getV2CryptocurrencyOhlcvHistorical)</span>
    - Description: Historical OHLCV.

<span style="color: green;">[**/v2/cryptocurrency/price-performance-stats/latest**](https://coinmarketcap.com/api/documentation/v1/#operation/getV2CryptocurrencyPriceperformancestatsLatest)</span>
    - Description: Latest Price Performance Stats.

<span style="color: green;">[**/v1/cryptocurrency/categories**](https://coinmarketcap.com/api/documentation/v1/#operation/getV1CryptocurrencyCategories)</span>
    - Description: Categories.

<span style="color: green;">[**/v1/cryptocurrency/category**](https://coinmarketcap.com/api/documentation/v1/#operation/getV1CryptocurrencyCategory)</span>
    - Description: Category.

<span style="color: green;">[**/v1/cryptocurrency/airdrops**](https://coinmarketcap.com/api/documentation/v1/#operation/getV1CryptocurrencyAirdrops)</span>
    - Description: Airdrops.

<span style="color: green;">[**/v1/cryptocurrency/airdrop**](https://coinmarketcap.com/api/documentation/v1/#operation/getV1CryptocurrencyAirdrop)</span>
    - Description: Airdrop.

<span style="color: green;">[**/v1/cryptocurrency/trending/latest**](https://coinmarketcap.com/api/documentation/v1/#operation/getV1CryptocurrencyTrendingLatest)</span>
    - Description: Trending Latest.

<span style="color: green;">[**/v1/cryptocurrency/trending/most-visited**](https://coinmarketcap.com/api/documentation/v1/#operation/getV1CryptocurrencyTrendingMostvisited)</span>
    - Description: Trending Most Visited.

<span style="color: green;">[**/v1/cryptocurrency/trending/gainers-losers**](https://coinmarketcap.com/api/documentation/v1/#operation/getV1CryptocurrencyTrendingGainerslosers)</span>
    - Description: Trending Gainers & Losers.

### Filters Available

1. **`id(String value)`**: Filter by cryptocurrency ID.
2. **`symbol(String value)`**: Filter by cryptocurrency symbol.
3. **`slug(String value)`**: Filter by cryptocurrency slug.
4. **`start(int value)`**: Filter by start index.
5. **`limit(int value)`**: Filter by result limit.
6. **`date(String value)`**: Filter by date.
7. **`status(String value)`**: Filter by status.
8. **`convert(String value)`**: Filter by conversion currency.
9. **`convertId(String value)`**: Filter by conversion currency ID.
10. **`listingStatus(String value)`**: Filter by listing status.
11. **`aux(String value)`**: Filter by auxiliary parameter.
12. **`skipInvalid(boolean value)`**: Skip invalid entries.
13. **`address(String value)`**: Filter by cryptocurrency address.
14. **`sort(String value)`**: Sort results.
15. **`sortDir(String value)`**: Sort direction.
16. **`cryptocurrencyType(String value)`**: Filter by cryptocurrency type.
17. **`priceMax(String value)`**: Filter by maximum price.
18. **`priceMin(String value)`**: Filter by minimum price.
19. **`marketCapMin(String value)`**: Filter by minimum market cap.
20. **`marketCapMax(String value)`**: Filter by maximum market cap.
21. **`volume24hMin(String value)`**: Filter by minimum 24h volume.
22. **`volume24hMax(String value)`**: Filter by maximum 24h volume.
23. **`circulatingSupplyMin(String value)`**: Filter by minimum circulating supply.
24. **`circulatingSupplyMax(String value)`**: Filter by maximum circulating supply.
25. **`percentChange24hMin(String value)`**: Filter by minimum percent change in 24h.
26. **`percentChange24hMax(String value)`**: Filter by maximum percent change in 24h.
27. **`tag(String value)`**: Filter by tag.
28. **`timePeriod(String value)`**: Filter by time period.
29. **`matchedId(String value)`**: Filter by matched ID.
30. **`matchedSymbol(String value)`**: Filter by matched symbol.
31. **`category(String value)`**: Filter by category.
32. **`feeType(String value)`**: Filter by fee type.
33. **`timeStart(String value)`**: Filter by start time.
34. **`timeEnd(String value)`**: Filter by end time.
35. **`count(String value)`**: Filter by count.
36. **`interval(String value)`**: Filter by interval.

## Getting Started

```java 
// Step 1: Create an instance of the CoinMarketCap API service and specify the API key.
MetadataService service=new CoinMarketCap("apiKey")
        // Step 2: Choose the cryptocurrency endpoint with version (V2 in this case).
        .cryptocurrencyV2() // Choose the cryptocurrency endpoint with version
        // Step 3: Choose the specific data to query, in this case, metadata.
        .metadata() // Choose the data to query
        // Step 4: Add necessary filters to the query, in this case, specifying the cryptocurrency IDs (1).
        .id("1") // Add the necessary filters
        // Step 5: Build the metadata service with the specified configuration.
        .build();

// Step 6: Try to execute the service-specific endpoint to retrieve metadata.
        try{
        // Step 7: Call the service specific endpoint and store the result in the 'serviceResult' Map.
        Map<String, MetadataData> serviceResult=service.info();
        }catch(CoinMarketCapException e){
        // Step 8: Handle exceptions that may occur during the API call.
        // For example, log the exception or take appropriate action.
        // Note: The specific exception type is CoinMarketCapException.
        // It might be useful to log the exception details for debugging purposes.
        // You can replace the comment with actual error handling code.
        // For example: logger.error("Error calling CoinMarketCap API", e);
        // or: e.printStackTrace();
        }

// Step 9: The 'serviceResult' Map now contains the metadata information retrieved from the CoinMarketCap API.
// You can proceed to use this information in your application as needed. 
```

For detailed examples and additional features, refer to the Javadoc provided with the library.

## Dependencies

- Jackson library for JSON processing
- SLF4J for logging
- Mockito & JUnit for Unit Tests
- Apache HttpClient for Interacting with CoinMarketCap API
