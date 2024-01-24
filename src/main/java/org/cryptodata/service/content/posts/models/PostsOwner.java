package org.cryptodata.service.content.posts.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record PostsOwner(
        @JsonProperty("nickname") String nickname,
        @JsonProperty("avatar_url") String avatarUrl
) {
}
