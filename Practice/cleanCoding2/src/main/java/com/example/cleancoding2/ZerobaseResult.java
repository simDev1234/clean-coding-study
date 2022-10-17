package com.example.cleancoding2;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class ZerobaseResult {
    private String code;
    private String message;
}
