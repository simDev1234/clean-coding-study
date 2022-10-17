package stragtegy;

import java.util.Optional;

public class MockCouponRepository implements CouponRepository{

    // 실제로는 Service 층에서 구현체를 바꾸어 끼우므로써 if문을 대체한다.
    @Override
    public Optional<Coupon> findById(long id) {

        if (id <= 0)
            return Optional.empty();

        if (id < 100)
            return Optional.of(new PercentageCoupon(10));

        return Optional.of(new DiscountCoupon(2000));
    }
}
