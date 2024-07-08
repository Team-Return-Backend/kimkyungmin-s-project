package com.gdsc.jobiskimkyungmin.domain.user.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class User {
    @Id
    private Long id;

    @Column(columnDefinition = "VARCHAR(20)")
    private String username;

    @Column(columnDefinition = "VARCHAR(25)")
    private String password;
}
