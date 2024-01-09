package org.cryptodata.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.TreeMap;

@Data
public class ResponseDTO {

    @SerializedName("status")
    private StatusDTO status;

    @SerializedName("data")
    private TreeMap<String, DataDTO> data;
}
