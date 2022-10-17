package com.example.cleancoding3test;

import com.example.cleancoding3test.infra.entity.BookStock;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

public class ExampleTest {

    @Test
    @DisplayName("BookStock 재고가 없으면 false")
    void enough_stock_test(){
        BookStock bookStock = BookStock.builder().stock(0).build();
        assertThat(bookStock.enoughStock()).isFalse();
    }

    @Test
    @DisplayName("BookStock 재고를 확인한다.")
    void stock_check(){
        BookStock bookStock = BookStock.builder().stock(10).build();
        assertThat(bookStock.getStock()).isEqualTo(10);
        assertThat(bookStock.enoughStock()).isTrue();
    }

    @Test
    @DisplayName("BookStock 재고가 감소한다.")
    void stock_decrease_test(){

        final int stockCount = 10;

        BookStock bookStock = BookStock.builder().stock(stockCount).build();

        bookStock.decreaseStock();

        assertThat(bookStock.getStock()).isLessThan(stockCount);
    }

    @Test
    void test() {
        BookStock mock = Mockito.mock(BookStock.class);

        mock.decreaseStock();

        verify(mock, atLeastOnce()).decreaseStock();
    }

}
