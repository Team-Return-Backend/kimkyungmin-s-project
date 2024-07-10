package com.gdsc.jobiskimkyungmin.domain.auth.repository;

import com.gdsc.jobiskimkyungmin.domain.auth.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken,Long> {
    Optional<RefreshToken> findByToken(String token);
}
