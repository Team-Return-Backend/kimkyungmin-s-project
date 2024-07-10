package com.gdsc.jobiskimkyungmin.domain.global.security.auth;

import com.gdsc.jobiskimkyungmin.domain.user.domain.User;
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
public class AuthDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String accountId) throws UsernameNotFoundException {
        return userRepository.findByUsername(accountId)
                .map(AuthDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("not found"));
    }
}
