package com.micah.aocakbackend.exception;

import org.springframework.http.HttpStatus;

/**
 * @ClassName MicahCustomException
 * @Description 简介
 * @Author Micah
 * @Date 2023/4/2 16:27
 * @Version 1.0
 **/
public class MicahCustomException extends RuntimeException {

    private HttpStatus status;
    private String message;
    private Integer code;

    public MicahCustomException(HttpStatus status, String message, Integer code) {
        this.status = status;
        this.message = message;
        this.code = code;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }
}
