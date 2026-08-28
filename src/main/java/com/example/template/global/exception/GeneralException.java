package com.example.template.global.exception;

import com.example.template.global.apipayload.ErrorCode;
import lombok.Getter;

@Getter
public class GeneralException extends RuntimeException {

    private final ErrorCode code;

    public GeneralException(ErrorCode code) {
        super(code.getMessage());
        this.code = code;
    }
}
