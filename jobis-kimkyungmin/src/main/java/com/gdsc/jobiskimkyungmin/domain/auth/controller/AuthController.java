package com.gdsc.jobiskimkyungmin.domain.auth.controller;

import com.gdsc.jobiskimkyungmin.domain.auth.service.AuthService;
import com.gdsc.jobiskimkyungmin.domain.user.domain.type.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<String> register(String username, String password, Role role) {
        authService.register(username, password, role);
        return ResponseEntity.ok("User registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(String username, String password) {
        String token = authService.authenticate(username, password);
        return ResponseEntity.ok(token);
    }
}