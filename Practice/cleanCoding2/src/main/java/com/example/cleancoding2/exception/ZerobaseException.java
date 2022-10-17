package com.example.cleancoding2.exception;

import com.example.cleancoding2.type.ExceptionCode;
import lombok.Getter;

@Getter
public class ZerobaseException extends RuntimeException{
    private final ExceptionCode code;

    public ZerobaseException(ExceptionCode code) {
        this.code = code;
    }

    public ZerobaseException(String message, ExceptionCode code) {
        super(message);
        this.code = code;
    }

    public ZerobaseException(String message, Throwable cause, ExceptionCode code) {
        super(message, cause);
        this.code = code;
    }

    public ZerobaseException(Throwable cause, ExceptionCode code) {
        super(cause);
        this.code = code;
    }

    public ZerobaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, ExceptionCode code) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }

    // 추가한 생성자
    public ZerobaseException(ExceptionCode code, String message) {
        super(message);
        this.code = code;
    }

    // 반드시
    public ZerobaseException(ExceptionCode code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}
