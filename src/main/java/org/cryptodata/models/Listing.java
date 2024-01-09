package org.cryptodata.models;

import lombok.Builder;
import lombok.Data;
import org.cryptodata.dto.DataDTO;
import org.cryptodata.dto.ResponseDTO;

@Data
@Builder
public class Listing {

    private long id;
    private String name;
    private String symbol;
    private int rank;
    private double circulatingSupply;
    private double totalSupply;
    private double maxSupply;
    public static Listing from(ResponseDTO body) {
        DataDTO dataDTO = body.getData().firstEntry().getValue();

        return new ListingBuilder()
                .id(dataDTO.getId())
                .name(dataDTO.getName())
                .symbol(dataDTO.getSymbol())
                .rank(dataDTO.getCmcRank())
                .circulatingSupply(dataDTO.getCirculatingSupply())
                .totalSupply(dataDTO.getTotalSupply())
                .maxSupply(dataDTO.getMaxSupply())
                .build();
    }
}
