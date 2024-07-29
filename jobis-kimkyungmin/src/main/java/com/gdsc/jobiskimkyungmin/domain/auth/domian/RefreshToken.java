package com.gdsc.jobiskimkyungmin.domain.auth.domian;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "tbl_refreshtoken")
@Entity
@Getter
@NoArgsConstructor
public class RefreshToken {
    @Id
    private String accountId;
    private String token;
    private Long timeToLive;

   
    public RefreshToken(String accountId, String token, Long timeToLive) {
        this.accountId = accountId;
        this.token = token;
        this.timeToLive = timeToLive;
    }
}
