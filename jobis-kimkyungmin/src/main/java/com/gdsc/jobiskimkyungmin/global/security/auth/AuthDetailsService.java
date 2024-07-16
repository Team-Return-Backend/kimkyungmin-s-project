package com.gdsc.jobiskimkyungmin.global.security.auth;

import com.gdsc.jobiskimkyungmin.domain.user.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class AuthDetailsService implements UserDetailsService{

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // user이름을 통해 유저의 정보를 가져오는 메소드
        return userRepository.findByUsername(username) // userRepository에서 유저 이름을 찾는다.
                .map(AuthDetails::new) // smd딸
                .orElseThrow(() -> new UsernameNotFoundException("not found"));
    }
}
