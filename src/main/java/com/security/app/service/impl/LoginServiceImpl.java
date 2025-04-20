package com.security.app.service.impl;

import com.security.app.dto.request.AuthRequest;
import com.security.app.dto.request.LoginRequest;
import com.security.app.entity.User;
import com.security.app.exception.LoginException;
import com.security.app.repository.UserRepository;
import com.security.app.security.JwtUtil;
import com.security.app.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtil jwtUtil;

    public String registerUser(LoginRequest loginRequest) throws LoginException{
        User user  = new User();
        user.setUsername(loginRequest.getUsername());
        user.setPassword(passwordEncoder.encode(loginRequest.getPassword()));
        user.setRole(loginRequest.getRole());
        if(!userRepository.save(user).getUsername().equals(loginRequest.getUsername()))
            throw new LoginException("Failed to Register");
        return "Login Successfully";
    }

    public String login(AuthRequest authRequest) throws LoginException{
        User user = userRepository.findByUsername(authRequest.getUsername())
                .orElseThrow(() -> new LoginException("User not found"));
        System.out.println(authRequest);
        if (passwordEncoder.matches(authRequest.getPassword(), user.getPassword())) {
            String token = jwtUtil.generateToken(user.getUsername(), user.getRole());
            return token;
        } else {
            throw new LoginException("Invalid credentials");
        }
    }

}
