package com.security.app.controller;

import com.security.app.dto.request.AuthRequest;
import com.security.app.dto.request.LoginRequest;
import com.security.app.exception.LoginException;
import com.security.app.security.JwtUtil;
import com.security.app.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth/api")
public class AuthController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody LoginRequest loginRequest) throws LoginException {
        return new ResponseEntity<>(loginService.registerUser(loginRequest), HttpStatus.ACCEPTED);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody AuthRequest authRequest) {
        return new ResponseEntity<>("Token is "+loginService.login(authRequest),HttpStatus.ACCEPTED);
    }
}

