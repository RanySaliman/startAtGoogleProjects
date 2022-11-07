package Day4.Exc1;

import java.util.ArrayList;

public class Store {

    public static void addCoupon(Coupon coupon, ArrayList<Coupon> userCoupons){
        userCoupons.add(coupon);
        System.out.println("coupon has been added");
    }

    public static void useCoupon(Coupon coupon, ArrayList<Coupon> userCoupons){
        System.out.println(coupon.getId());
        userCoupons.remove(coupon);
        System.out.println("coupon was used");
    }
}
