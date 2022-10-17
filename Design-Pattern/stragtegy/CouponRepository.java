package stragtegy;

import java.util.Optional;

public interface CouponRepository {
    Optional<Coupon> findById(long id);
}
