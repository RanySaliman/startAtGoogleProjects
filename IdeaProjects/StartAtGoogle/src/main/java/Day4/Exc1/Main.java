package Day4.Exc1;

import java.sql.Date;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        User user = new User("Rany");
        user.assignCoupons();
        user.useCouponById(1);
        user.useRandomCoupon();
        user.useCouponByHighestValue();

    }

}
