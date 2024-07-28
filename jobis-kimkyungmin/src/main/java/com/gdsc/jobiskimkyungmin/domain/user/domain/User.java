package com.gdsc.jobiskimkyungmin.domain.user.domain;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="tbl_user")
@Entity
@NoArgsConstructor
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(columnDefinition = "VARCHAR(50)")
    private String accountId;
    @Column(columnDefinition = "VARCHAR(50)")
    private String passowrd;
    @Column(columnDefinition = "VARCHAR(80)")
    private String email;

    @Builder
    public User(String accountId, String passowrd, String email) {
        this.accountId = accountId;
        this.passowrd = passowrd;
        this.email = email;
    }
}
