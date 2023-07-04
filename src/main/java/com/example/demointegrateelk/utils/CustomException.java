package com.example.demointegrateelk.utils;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CustomException extends RuntimeException {
    private final String code;
    private final String msg;


    public CustomException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}