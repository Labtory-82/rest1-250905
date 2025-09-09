package com.rest1.domain.post.post.dto;

import com.rest1.domain.post.post.entity.Post;

import java.time.LocalDateTime;

public record PostDto(
        Long id,
        LocalDateTime createDate,
        LocalDateTime modifyDate,
        String subject,
        String body
) {
    // 엔티티 -> DTO 변환 생성자
    public PostDto(Post post) {
        this(
                post.getId(),
                post.getCreateDate(),
                post.getModifyDate(),
                post.getTitle(),
                post.getContent()
        );
    }
}