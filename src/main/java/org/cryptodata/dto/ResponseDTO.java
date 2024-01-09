package org.cryptodata.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

import java.util.TreeMap;

@Data
public class ResponseDTO {

    @JsonProperty("status")
    private StatusDTO status;

    @JsonProperty("data")
    private TreeMap<String, DataDTO> data;

    public static ResponseDTO fromJson(String json) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        return objectMapper.readValue(json, ResponseDTO.class);
    }
}
