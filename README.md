# CoinMarketCap-Java

#### A comprehensive Java library for interacting with the CoinMarketCap API and retrieving data.

 Please refer to  **CoinMarketCap Api official documentation**
 
### How to use:

```java 
// Step 1: Create an instance of the CoinMarketCap API service and specify the API key.
MetadataService service = new CoinMarketCap("apiKey")
        // Step 2: Choose the cryptocurrency endpoint with version (V2 in this case).
        .cryptocurrencyV2() // Choose the cryptocurrency endpoint with version
        // Step 3: Choose the specific data to query, in this case, metadata.
        .metadata() // Choose the data to query
        // Step 4: Add necessary filters to the query, in this case, specifying the cryptocurrency IDs (1).
        .id("1") // Add the necessary filters
        // Step 5: Build the metadata service with the specified configuration.
        .build();

// Step 6: Try to execute the service-specific endpoint to retrieve metadata.
try {
    // Step 7: Call the service specific endpoint and store the result in the 'serviceResult' Map.
    Map<String, MetadataData> serviceResult = service.info();
} catch (CoinMarketCapException e) {
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
