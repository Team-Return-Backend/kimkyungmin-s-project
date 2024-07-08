package com.gdsc.jobiskimkyungmin.domain.user.domain.repository;

import com.gdsc.jobiskimkyungmin.domain.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
