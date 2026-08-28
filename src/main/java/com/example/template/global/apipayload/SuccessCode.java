package com.example.template.global.apipayload;

import org.springframework.http.HttpStatus;

public interface SuccessCode {
    HttpStatus getHttpStatus();
    String getCode();
    String getMessage();
}
