package com.example.cleancoding3test;

import com.example.cleancoding3test.infra.entity.BookStock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.anyLong;

@MockitoSettings(strictness = Strictness.LENIENT)
@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {

    @Mock
    BookRepository bookRepository;
    @Mock
    UserInfoClient userInfoClient;
    @Mock
    BookStockRepository bookStockRepository;
    @Mock
    BookOrderRepository bookOrderRepository;

    @InjectMocks
    OrderService orderService;

    @BeforeEach
    void setUp(){
        when(bookRepository.findById(anyLong()))
                .thenReturn(Optional.of(new Book(true, 0)));
        when(userInfoClient.findUserInfo(anyLong()))
                .thenReturn(Optional.of(new UserInfo(20, false)));
        when(bookStockRepository.findById(anyLong()))
                .thenReturn(Optional.of(new BookStock(10)));

        when(bookOrderRepository.save(any(BookOrder.class)))
                .thenReturn(new BookOrder(1L, null, null));
    }

    @Test
    void fail(){
        orderService.order(User.asNew(1L), 1L);

        assertThat(orderId).isNotNull();
    }

    @Test
    void success(){
        orderService.order(null, 1L);

        // 상태 검증
        assertThat(orderId).isNotNull();

        // 행위 검증
        verify(bookRepository.findById(anyLong()));  // 잘 되니?
        verify(bookRepository, never()).findById(anyLong()); // 한 번도 안 불렸니?
        verify(bookRepository).findById(anyLong());
        verify(userInfoClient).findUserInfo(anyLong());
        verify(bookStockRepository).findById(anyLong());
        verify(bookOrderRepository).save(any(BookOrder.class));
    }

    @Test
    @DisplayName("Book 존재하지 않으면 익셉션 발생 (NOT_FOUND_BOOK)")
    void throwException_when_not_found_book(){

        // given when
        when(bookRepository.findById(anyLong()))
                .thenReturn(Optional.of(new Book(true, 0)));

        // then
        assertThatThrownBy(() -> orderService.order(User.asNew(1L), 1L))
                .isInstanceOf(ZeroBaseException.class)
                .hasFieldOrPropertyWithValue("code", ExcpetionCode.NOT_FOND_BOOK);
    }

    @Test
    @DisplayName("UserInfo 존재하지 않으면 익셉션 발생 (USER_INFO_CLIENT_ERROR)")
    void throwException_when_not_found_userInfo(){

        // given when
        when(bookRepository.findById(anyLong()))
                .thenReturn(Optional.of(new Book(true, 0)));

        // then
        assertThatThrownBy(() -> orderService.order(User.asNew(1L), 1L))
                .isInstanceOf(ZeroBaseException.class)
                .hasFieldOrPropertyWithValue("code", ExcpetionCode.USER_INFO_CLIENT_ERROR);
    }

    @Test
    @DisplayName("BookStock 존재하지 않으면 익셉션 발생 (NOT_FOUUND_BOOK_STOCK)")
    void throwException_when_not_found_userInfo(){

        // given when
        when(bookRepository.findById(anyLong()))
                .thenReturn(Optional.of(new Book(true, 0)));

        // then
        assertThatThrownBy(() -> orderService.order(User.asNew(1L), 1L))
                .isInstanceOf(ZeroBaseException.class)
                .hasFieldOrPropertyWithValue("code", ExcpetionCode.NOT_FOUUND_BOOK_STOCK);
    }

    @Test
    @DisplayName("❗️Book 판매중이지 않으면 익셉션 발생 (BOOK_IS_NOT_SALE)")
    void throwException_when_not_found_userInfo(){

        // given
        Book book = Book.builder().sale(false).build();

        // when
        when(bookRepository.findById(anyLong()))
                .thenReturn(Optional.of(book));

        // then
        assertThatThrownBy(() -> orderService.order(User.asNew(1L), 1L))
                .isInstanceOf(ZeroBaseException.class)
                .hasFieldOrPropertyWithValue("code", ExcpetionCode.BOOK_IS_NOT_SALE);
    }

}
