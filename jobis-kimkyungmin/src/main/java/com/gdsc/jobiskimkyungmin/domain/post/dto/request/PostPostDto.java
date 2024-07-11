package com.gdsc.jobiskimkyungmin.domain.post.dto.request;

import com.gdsc.jobiskimkyungmin.domain.user.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PostPostDto {
    private User user;
    private String title;
    private String content;
}
