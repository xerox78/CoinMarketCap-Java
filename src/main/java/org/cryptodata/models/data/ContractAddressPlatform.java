package org.cryptodata.models.data;

import lombok.Data;
import org.cryptodata.models.data.airdrop.CoinData;

@Data
public class ContractAddressPlatform {
    private String name;
    private CoinData coin;
}
