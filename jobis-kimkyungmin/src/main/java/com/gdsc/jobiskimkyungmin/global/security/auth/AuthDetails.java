package com.gdsc.jobiskimkyungmin.global.security.auth;

import com.gdsc.jobiskimkyungmin.domain.user.domain.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AuthDetails implements UserDetails {
    private final User user;

    public AuthDetails(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
//        List<GrantedAuthority> authorities = new ArrayList<>();
//        authorities.add(new SimpleGrantedAuthority(user.getAuthorities().getClass().getName()));
//        return authorities;

            Collection<GrantedAuthority> collectors = new ArrayList<>();
            collectors.add(()->{return "ROLE_"+user.getRole();}); //add에 들어올 파라미터는 GrantedAuthority밖에 없으니

            return collectors;


    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
