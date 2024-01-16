package org.cryptodata.service.crypto.metadata.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record MetadataContractAddressData(
        @JsonProperty("contract_address") String contractAddress,

        @JsonProperty("platform") MetadataContractAddressPlatform platform
) {
}
