package com.gdsc.jobiskimkyungmin.domain.user.domain.repository;

import com.gdsc.jobiskimkyungmin.domain.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
<<<<<<< HEAD

=======
>>>>>>> 95cc3980ac5f9fb2638b2af807974514b0b052bd
    Optional<User> findByUsername(String username);
}
