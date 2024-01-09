package org.cryptodata.models;

import lombok.Data;
import org.cryptodata.dto.ResponseDTO;

@Data
public class Listing {

    private String name;
    private String symbol;
    private int rank;
    private double circulatingSupply;
    private double totalSupply;
    private double maxSupply;
    public static Listing from(ResponseDTO body) {
        Listing listing = new Listing();
        listing.setName(body.getData().firstEntry().getValue().getName());
        listing.setSymbol(body.getData().firstEntry().getValue().getSymbol());
        listing.setRank(body.getData().firstEntry().getValue().getCmcRank());
        listing.setCirculatingSupply(body.getData().firstEntry().getValue().getCirculatingSupply());
        listing.setTotalSupply(body.getData().firstEntry().getValue().getTotalSupply());
        listing.setMaxSupply(body.getData().firstEntry().getValue().getMaxSupply());
        return listing;
    }
}
