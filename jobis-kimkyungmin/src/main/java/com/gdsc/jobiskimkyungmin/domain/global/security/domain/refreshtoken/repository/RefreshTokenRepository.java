package com.gdsc.jobiskimkyungmin.domain.global.security.domain.refreshtoken.repository;

import com.gdsc.jobiskimkyungmin.domain.global.security.domain.refreshtoken.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken,Long> {
}
