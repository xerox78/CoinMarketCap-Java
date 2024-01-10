package org.cryptodata.models;

import lombok.Builder;
import lombok.Data;
import org.cryptodata.dto.DataDTO;
import org.cryptodata.dto.ResponseDTO;

@Data
@Builder
public class Listing {

    private Integer id;
    private String name;
    private String symbol;
    private String slug;
    private Integer rank;
    private Double circulatingSupply;
    private Double totalSupply;
    private Double maxSupply;
    public static Listing fromDto(ResponseDTO body) {
        DataDTO dataDTO = body.getData().firstEntry().getValue();

        return new ListingBuilder()
                .id(dataDTO.getId())
                .name(dataDTO.getName())
                .symbol(dataDTO.getSymbol())
                .slug(dataDTO.getSlug())
                .rank(dataDTO.getCmcRank())
                .circulatingSupply(dataDTO.getCirculatingSupply())
                .totalSupply(dataDTO.getTotalSupply())
                .maxSupply(dataDTO.getMaxSupply())
                .build();
    }
}
