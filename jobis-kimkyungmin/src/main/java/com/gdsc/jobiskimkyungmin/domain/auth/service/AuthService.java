package com.gdsc.jobiskimkyungmin.domain.auth.service;


import com.gdsc.jobiskimkyungmin.domain.user.domain.User;
import com.gdsc.jobiskimkyungmin.domain.user.domain.repository.UserRepository;
import com.gdsc.jobiskimkyungmin.domain.user.domain.type.Role;
import com.gdsc.jobiskimkyungmin.global.security.auth.AuthDetails;
import com.gdsc.jobiskimkyungmin.global.security.auth.AuthDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final AuthenticationManager authenticationManager;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthDetailsService authDetailsService;

    public void register(String username, String password, Role role) {
        if (userRepository.findByUsername(username).isPresent()) {
            throw new IllegalStateException("Username already taken");
        }
        String encodedPassword = passwordEncoder.encode(password);
        User user = User.builder()
                .username(username)
                .password(encodedPassword)
                .role(role).build();
        userRepository.save(user);
    }

    public String authenticate(String username, String password) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(username, password)
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        return generateToken(username);
    }

    public boolean authorize(String token) {
        String username = getUsernameFromToken(token);
        AuthDetails userDetails = (AuthDetails) authDetailsService.loadUserByUsername(username);
        return userDetails != null;
    }

    private String generateToken(String username) {
        // 토큰 생성 로직을 추가합니다. 여기서는 단순히 사용자명을 반환합니다.
        return username;
    }

    private String getUsernameFromToken(String token) {
        // 토큰에서 사용자명을 추출하는 로직을 추가합니다. 여기서는 단순히 토큰을 반환합니다.
        return token;
    }
}
