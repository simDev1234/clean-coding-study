package com.example.cleancoding2;

import com.example.cleancoding2.exception.ZerobaseException;
import com.example.cleancoding2.type.ExceptionCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = ZerobaseException.class)
    public ResponseEntity<ZerobaseResult> runtimeException(ZerobaseException e){

        ExceptionCode errorCode = e.getCode();
        ZerobaseResult result = ZerobaseResult.builder()
                                    .code(errorCode.name())
                                    .message(e.getMessage())
                                    .build();

        return new ResponseEntity<>(result, errorCode.getHttpStatus());
    }

}
