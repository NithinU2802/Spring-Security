package com.security.app.service;

import com.security.app.dto.request.AuthRequest;
import com.security.app.dto.request.LoginRequest;
import com.security.app.exception.LoginException;

public interface LoginService {
    public String registerUser(LoginRequest loginRequest) throws LoginException;
    public String login(AuthRequest authRequest) throws LoginException;
}
