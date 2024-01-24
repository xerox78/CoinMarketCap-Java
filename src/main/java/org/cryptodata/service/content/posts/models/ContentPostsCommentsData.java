package org.cryptodata.service.content.posts.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ContentPostsCommentsData(
        @JsonProperty("post_id") String postId,
        @JsonProperty("owner") PostsOwner owner,
        @JsonProperty("text_content") String textContent,
        @JsonProperty("photos") String[] photos,
        @JsonProperty("comment_count") String commentCount,
        @JsonProperty("like_count") String likeCount,
        @JsonProperty("post_time") String postTime,
        @JsonProperty("language_code") String languageCode
) {
}
