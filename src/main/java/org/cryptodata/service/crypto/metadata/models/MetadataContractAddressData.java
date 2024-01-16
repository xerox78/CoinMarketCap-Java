package org.cryptodata.service.crypto.metadata.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MetadataContractAddressData {

    @JsonProperty("contract_address")
    private String contractAddress;

    @JsonProperty("platform")
    private MetadataContractAddressPlatform platform;
}
