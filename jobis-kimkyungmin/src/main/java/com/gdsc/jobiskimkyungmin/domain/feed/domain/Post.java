package com.gdsc.jobiskimkyungmin.domain.feed.domain;

import com.gdsc.jobiskimkyungmin.domain.user.domain.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Setter
@Getter
@RequiredArgsConstructor

public class Post {
    @Builder
    public Post(String title, String content, int like, User user) {
        this.title = title;
        this.content = content;
        this.like = like;
        this.user = user;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "VARCHAR(40)")
    private String title;

    @Column(columnDefinition = "VARCHAR(500)")
    private String content;



    private int like;

    @ManyToOne
    private User user;
}
