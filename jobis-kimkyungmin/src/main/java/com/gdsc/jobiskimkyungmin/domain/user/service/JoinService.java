package com.gdsc.jobiskimkyungmin.domain.user.service;

import com.gdsc.jobiskimkyungmin.domain.user.domain.type.Role;
import com.gdsc.jobiskimkyungmin.domain.user.domain.User;
import com.gdsc.jobiskimkyungmin.domain.user.domain.repository.UserRepository;
import com.gdsc.jobiskimkyungmin.domain.user.dto.UserDto;
import org.springframework.security.crypto.password.PasswordEncoder;

public class JoinService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public JoinService(UserRepository userRepository, PasswordEncoder passwordEncoder){
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User registerUser(UserDto userDto){ // 회원 가입 로직
        if(userRepository.findByUsername(userDto.getUsername()).isPresent()){
            throw new RuntimeException("User already exists");

        }
        User user =  User.builder()
                .username(userDto.getUsername())
                .password(userDto.getPassword())
                .role(Role.BASIC)
                .build();

        return userRepository.save(user);
    }
}
