package org.cryptodata.service.blockchain.statistics.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public record StatisticsData(
        int id,
        String slug,
        String symbol,
        @JsonProperty("block_reward_static") Double blockRewardStatic,
        @JsonProperty("consensus_mechanism") String consensusMechanism,
        String difficulty,
        @JsonProperty("hashrate_24h") String hashrate24h,
        @JsonProperty("pending_transactions") Integer pendingTransactions,
        @JsonProperty("reduction_rate") String reductionRate,
        @JsonProperty("total_blocks") Integer totalBlocks,
        @JsonProperty("total_transactions") String totalTransactions,
        @JsonProperty("tps_24h") Double tps24h,
        @JsonProperty("first_block_timestamp") Date firstBlockTimestamp
) {
}
