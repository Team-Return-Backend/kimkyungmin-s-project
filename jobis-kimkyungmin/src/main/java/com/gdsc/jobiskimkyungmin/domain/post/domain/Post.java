package com.gdsc.jobiskimkyungmin.domain.post.domain;

import com.gdsc.jobiskimkyungmin.domain.user.domain.User;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Setter
@Getter
@RequiredArgsConstructor

public class Post {

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
