package org.cryptodata.service.exchange.quote.models;

import java.util.List;

public record QuoteHistoricalData(
        Integer id,
        String name,
        String slug,
        List<QuotesData> quotes
) {
}
