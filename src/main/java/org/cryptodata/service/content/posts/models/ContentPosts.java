package org.cryptodata.service.content.posts.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record ContentPosts(
        @JsonProperty("post_id") String postId,
        @JsonProperty("comments_url") String commentsUrl,
        @JsonProperty("owner") PostsOwner owner,
        @JsonProperty("text_content") String textContent,
        @JsonProperty("photos") String[] photos,
        @JsonProperty("comment_count") String commentCount,
        @JsonProperty("like_count") String likeCount,
        @JsonProperty("post_time") String postTime,
        @JsonProperty("currencies") List<PostCurrency> currencies,
        @JsonProperty("language_code") String languageCode
) {
}
