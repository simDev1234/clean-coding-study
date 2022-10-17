package com.example.cleancoding2;

import com.example.cleancoding2.exception.ZerobaseException;
import com.example.cleancoding2.type.ExceptionCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZerobaseController {

    @GetMapping("/ping")
    public String ping(){
        return "pong";
    }

    @GetMapping("/exception")
    public void exception(){
        throw new ZerobaseException(ExceptionCode.INTERNAL_ERROR, "바뀐 에러 문구입니다.");
    }

}
