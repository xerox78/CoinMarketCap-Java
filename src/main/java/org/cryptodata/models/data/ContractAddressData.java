package org.cryptodata.models.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ContractAddressData {

    @JsonProperty("contract_address")
    private String contractAddress;

    @JsonProperty("platform")
    private ContractAddressPlatform platform;
}
