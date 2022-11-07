package Day4.Exc1;

import java.sql.Date;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class User{
    String name;
    ArrayList<Coupon> userCoupons = new ArrayList<>();

    long notTodayTime = System.currentTimeMillis() + 60000;
    long todayTime = System.currentTimeMillis();
    Date today = new Date(todayTime);
    Date notToday = new Date(notTodayTime);

    public User(String name) {
        this.name = name;
    }

    public void assignCoupons(){
        for (int i = 0; i < 10; i++) {
            int random = ThreadLocalRandom.current().nextInt(100);
            double randomDb = ThreadLocalRandom.current().nextDouble(1000);
            Coupon coupon = new Coupon(random,randomDb,notToday);
            Store.addCoupon(coupon, userCoupons);
        }
    }
    public void useCouponById(int id) {
        for (Coupon coupon : userCoupons) {
            if (coupon.getId() == id && coupon.getDate().after(today)) {
                Store.useCoupon(coupon, userCoupons);
                break;
            }
        }
    }

    public void useCouponByHighestValue() {
        double highestValue = 0;
        for (Coupon coupon : userCoupons) {
            if (coupon.getValue() >= highestValue) {
                highestValue = coupon.getValue();
            }
        }
        for (Coupon coupon : userCoupons) {
            if (coupon.getValue() == highestValue && coupon.getDate().after(today)) {
                Store.useCoupon(coupon, userCoupons);
                break;
            }
        }
    }

    public void useCouponWithClosestDate() {
        Coupon couponThatIsUsed = null;
        for (Coupon coupon : userCoupons) {
            if (coupon.getDate().before(couponThatIsUsed.getDate()) && coupon.getDate().after(today)) {
                couponThatIsUsed = coupon;
            }
        }
        Store.useCoupon(couponThatIsUsed, userCoupons);
    }

    public void useRandomCoupon() {
        int random = ThreadLocalRandom.current().nextInt(userCoupons.size());
        if (userCoupons.get(random).getDate().after(today)) {
            Store.useCoupon(userCoupons.get(random), userCoupons);
        }

    }
}
