package com.gdsc.jobiskimkyungmin.domain.feed.dto.request;

import com.gdsc.jobiskimkyungmin.domain.user.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GetPostDto {

    private Long id;
    private String title;
    private String content;
    private int like;
    private User user;
}