package org.cryptodata.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.apache.hc.core5.http.HttpHeaders;
import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.models.ResponseAPI;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

/**
 * Represents a base class for interacting with the CoinMarketCap API.
 */
public class ServiceOperation {
    private static final String API_KEY_HEADER = "X-CMC_PRO_API_KEY";
    private static final String ACCEPT_HEADER = HttpHeaders.ACCEPT;
    private static final Logger logger = LoggerFactory.getLogger(ServiceOperation.class);
    private final CoinMarketCapUrlBuilder urlBuilder;
    private final CoinMarketCap coinMarketCap;
    private final ObjectMapper objectMapper;
    private HttpClient httpClient;


    /**
     * Constructs a ServiceOperation instance.
     *
     * @param coinMarketCap     The CoinMarketCap instance.
     * @param cryptocurrencyUrl The URL builder for cryptocurrency operations.
     */
    public ServiceOperation(CoinMarketCap coinMarketCap, CoinMarketCapUrlBuilder cryptocurrencyUrl) {
        this.coinMarketCap = coinMarketCap;
        this.urlBuilder = cryptocurrencyUrl;
        this.httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();
        this.objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    /**
     * Gets the URL builder associated with this service operation.
     *
     * @return The CoinMarketCapUrlBuilder instance.
     */
    public CoinMarketCapUrlBuilder getUrlBuilder() {
        return urlBuilder;
    }


    /**
     * Sets a custom HTTP client for making requests.
     *
     * @param httpClient The custom HttpClient instance.
     */
    public void setHttpClient(HttpClient httpClient) {
        if (httpClient != null) {
            this.httpClient = httpClient;
        } else {
            logger.warn("Attempted to set a null HttpClient. Using the default HttpClient.");
        }
    }

    /**
     * Processes the response from a JSON string.
     *
     * @param response  The JSON response string.
     * @param dataClass The JavaType representing the expected response type.
     * @param <R>       The type of the expected response.
     * @return The parsed response.
     * @throws CoinMarketCapException If there is an issue parsing the JSON or the response contains an error.
     */
    protected <R> R processResponse(String response, JavaType dataClass) throws CoinMarketCapException {
        try {
            ResponseAPI<R> responseAPI = fromJson(response, dataClass);

            if (responseAPI.status().errorCode() != 0L) {
                throw new CoinMarketCapException(responseAPI.status().errorCode(), responseAPI.status().errorMessage());
            }

            if (responseAPI.data() == null) {
                throw new CoinMarketCapException("No data found in the response");
            }

            return responseAPI.data();
        } catch (JsonProcessingException e) {
            logger.error("Failed to parse JSON response", e);
            throw new CoinMarketCapException("Failed to parse JSON response", e);
        }
    }

    /**
     * Converts a JSON string to a Java object.
     *
     * @param json The JSON string.
     * @param type The JavaType representing the expected object type.
     * @param <R>  The type of the expected object.
     * @return The parsed object.
     * @throws JsonProcessingException If there is an issue parsing the JSON.
     */
    protected <R> ResponseAPI<R> fromJson(String json, JavaType type) throws JsonProcessingException {
        return objectMapper.readValue(json, type);
    }

    /**
     * Constructs a JavaType representing a list of a specific data class.
     *
     * @param dataClass The class of the elements in the list.
     * @return The JavaType representing a list of the specified data class.
     */
    protected JavaType getJavaTypeList(Class<?> dataClass) {
        JavaType listJavaType = TypeFactory.defaultInstance().constructParametricType(List.class, dataClass);
        return getJavaType(listJavaType);
    }

    /**
     * Constructs a JavaType representing a map with string keys and a specific data class as values.
     *
     * @param dataClass The class of the values in the map.
     * @return The JavaType representing a map with string keys and the specified data class as values.
     */
    protected JavaType getJavaTypeMap(Class<?> dataClass) {
        JavaType listJavaType = TypeFactory.defaultInstance().constructParametricType(Map.class, String.class, dataClass);
        return getJavaType(listJavaType);
    }

    /**
     * Constructs a JavaType for wrapping a specific data class using the ResponseAPI class.
     *
     * @param listJavaType The JavaType of the specific data class.
     * @return The JavaType representing the ResponseAPI wrapping the specified data class.
     */
    protected JavaType getJavaType(JavaType listJavaType) {
        return TypeFactory.defaultInstance().constructParametricType(ResponseAPI.class, listJavaType);
    }

    /**
     * Constructs a JavaType for wrapping a specific data class using the ResponseAPI class.
     *
     * @param javaType The JavaType of the specific data class.
     * @return The JavaType representing the ResponseAPI wrapping the specified data class.
     */
    protected JavaType getJavaType(Class<?> javaType) {
        return TypeFactory.defaultInstance().constructParametricType(ResponseAPI.class, javaType);
    }

    /**
     * Sends an HTTP request to the specified URI and processes the response.
     *
     * @param uri      The URI to send the request to.
     * @param javaType The JavaType representing the expected response type.
     * @param <R>      The type of the expected response.
     * @return The parsed response.
     * @throws CoinMarketCapException If there is an issue with the request or response.
     */
    protected <R> R sendHttpRequest(URI uri, JavaType javaType) throws CoinMarketCapException {
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(uri)
                .header(API_KEY_HEADER, coinMarketCap.apiKey())
                .header(ACCEPT_HEADER, "application/json")
                .build();
        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            return processResponse(response.body(), javaType);
        } catch (InterruptedException | IOException e) {
            throw new CoinMarketCapException("Failed to send HTTP request", e);
        }
    }

}
