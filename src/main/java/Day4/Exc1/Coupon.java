package Day4.Exc1;

import java.sql.Date;


public final class Coupon {
    private final int id;
    private final double value;
    private Date issueDate;

    public Coupon(int id, double value, Date issueDate) {
        this.id = id;
        this.value = value;
        this.issueDate = issueDate;
    }

    public int getId() {
        return id;
    }

    public double getValue() {
        return value;
    }

    // Defensive copy of Date
    public Date getDate() {
        return new Date(issueDate.getTime());
    }

}
