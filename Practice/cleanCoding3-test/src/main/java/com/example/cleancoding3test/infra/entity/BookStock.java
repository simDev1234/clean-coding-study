package com.example.cleancoding3test.infra.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@AllArgsConstructor
@Builder
public class BookStock {
    private int stock;

    public boolean enoughStock() {
        return stock > 0;
    }

    public void decreaseStock() {
        log.info("decreaseStock!!");
        if (stock < 0) {
            throw new RuntimeException("NOT ENOUTH STOCK");
        }
        stock -= 1;
    }

}
