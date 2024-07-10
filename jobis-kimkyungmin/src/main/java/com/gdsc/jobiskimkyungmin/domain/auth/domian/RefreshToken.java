package com.gdsc.jobiskimkyungmin.domain.auth.domian;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class RefreshToken {
    @Id
    private String accountId;
    private String token;
    private Long timeToLive;

    @Builder
    public RefreshToken(String accountId, String token, Long timeToLive) {
        this.accountId = accountId;
        this.token = token;
        this.timeToLive = timeToLive;
    }
}
