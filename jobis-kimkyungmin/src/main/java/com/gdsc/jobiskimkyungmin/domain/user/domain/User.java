package com.gdsc.jobiskimkyungmin.domain.user.domain;

import com.gdsc.jobiskimkyungmin.domain.feed.domain.Post;
import com.gdsc.jobiskimkyungmin.domain.user.domain.type.Role;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "VARCHAR(20)")
    private String username;

    @Column(columnDefinition = "VARCHAR(25)")
    private String password;

    //새로 추가
    private Role role;

    @OneToMany(mappedBy = "user")
    private List<Post> post;

}
