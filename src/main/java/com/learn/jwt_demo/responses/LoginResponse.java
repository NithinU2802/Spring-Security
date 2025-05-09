package com.learn.jwt_demo.responses;

import lombok.Data;

@Data
public class LoginResponse {


    public LoginResponse(String token, long expiresIn) {
        this.token = token;
        this.expiresIn = expiresIn;
    }

    private String token;
    private long expiresIn;
}
