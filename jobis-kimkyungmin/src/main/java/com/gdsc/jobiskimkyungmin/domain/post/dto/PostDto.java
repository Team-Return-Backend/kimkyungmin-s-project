package com.gdsc.jobiskimkyungmin.domain.post.dto;

import com.gdsc.jobiskimkyungmin.domain.user.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PostDto {

    private Long id;
    private String title;
    private String content;
    private int like;
    private User user;
}
