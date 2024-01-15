package org.cryptodata.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.apache.http.HttpHeaders;
import org.cryptodata.CoinMarketCap;
import org.cryptodata.exception.CoinMarketCapException;
import org.cryptodata.models.ResponseAPI;
import org.cryptodata.service.CoinMarketCapUrl.CoinMarketCapUrlBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public abstract class ServiceOperation {
    protected CoinMarketCapUrlBuilder urlBuilder;
    protected CoinMarketCap coinMarketCap;
    private HttpClient httpClient = HttpClient.newHttpClient();

    public void setHttpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public CoinMarketCapUrlBuilder getUrlBuilder() {
        return urlBuilder;
    }

    protected <R> R getResponse(String response, JavaType dataClass) throws CoinMarketCapException {
        ResponseAPI<R> responseAPI;
        try {
            responseAPI = fromJson(response, dataClass);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new CoinMarketCapException("Couldn't parse Json", e.getCause());
        }
        System.out.println(responseAPI);
        if (!responseAPI.getStatus().getErrorCode().equals(0L)) {
            throw new CoinMarketCapException(responseAPI.getStatus().getErrorCode(), responseAPI.getStatus().getErrorMessage());
        }

        if (responseAPI.getData() == null) {
            throw new CoinMarketCapException("Failed to retrieve data");
        }

        return responseAPI.getData();
    }

    protected <R> ResponseAPI<R> fromJson(String json, JavaType type) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        return objectMapper.readValue(json, type);
    }

    protected JavaType getJavaTypeList(Class<?> dataClass) {
        JavaType listJavaType = TypeFactory.defaultInstance().constructParametricType(List.class, dataClass);
        return getJavaType(listJavaType);
    }

    protected JavaType getJavaTypeMap(Class<?> dataClass) {
        JavaType listJavaType = TypeFactory.defaultInstance().constructParametricType(Map.class, String.class, dataClass);
        return getJavaType(listJavaType);
    }

    protected JavaType getJavaType(JavaType listJavaType) {
        return TypeFactory.defaultInstance().constructParametricType(ResponseAPI.class, listJavaType);
    }

    protected JavaType getJavaType(Class<?> javaType) {
        return TypeFactory.defaultInstance().constructParametricType(ResponseAPI.class, javaType);
    }

    protected <R> R sendRequest(URI uri, String apiKey, JavaType javaType) throws CoinMarketCapException {
        HttpRequest request = HttpRequest.newBuilder().GET().uri(uri).header("X-CMC_PRO_API_KEY", apiKey).header(HttpHeaders.ACCEPT, "application/json").build();
        HttpResponse<String> response;
        try {
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (InterruptedException | IOException e) {
            throw new CoinMarketCapException("Connection Error", e.getCause());
        }
        return getResponse(response.body(), javaType);
    }


}
