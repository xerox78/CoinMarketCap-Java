package org.cryptodata.service.crypto.metadata.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MetadataCoin {
    @JsonProperty("id")
    private int id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("slug")
    private String slug;

    @JsonProperty("symbol")
    private String symbol;
}
