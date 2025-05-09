package com.learn.jwt_demo.dto;

import lombok.Data;

@Data
public class VerifyUserDTO {
    private  String email;
    private String verificationCode;
}
