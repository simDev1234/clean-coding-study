package com.example.cleancoding2.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
@Getter
public enum ExceptionCode {
    INTERNAL_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "서버 에러입니다");

    private final HttpStatus httpStatus;
    private final String message;
}
