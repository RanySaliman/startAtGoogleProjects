package Day3.Exc3;

import java.util.Objects;

public class PhoneNumber implements Cloneable, Comparable<PhoneNumber> {
    Integer areaCode;
    String number;

    public PhoneNumber(int areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    @Override
    public boolean equals(Object phoneNum) {
        if (this == phoneNum) return true;
        if (phoneNum == null || getClass() != phoneNum.getClass()) return false;
        PhoneNumber phoneNumber = (PhoneNumber) phoneNum;
        return areaCode == phoneNumber.areaCode && number == phoneNumber.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, number);
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "areaCode=" + areaCode +
                ", number=" + number +
                '}';
    }

    @Override
    protected PhoneNumber clone() throws CloneNotSupportedException {
        try {
            PhoneNumber clone = (PhoneNumber) super.clone();
            clone().number = new String(number);
            clone.areaCode = Integer.valueOf(areaCode);
            return clone;
        } catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }

    public static int compare(int x, int y) {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }

    @Override
    public int compareTo(PhoneNumber phoneNumber) {
        if (this.number.compareTo(phoneNumber.number) == -1) {
            return -1;
        }
        if (this.number.compareTo(phoneNumber.number) == 0) {
            return Integer.compare(this.areaCode,phoneNumber.areaCode);
        }
        else {
            return 1;
        }
    }

    public Integer getAreaCode() {
        return areaCode;
    }

    public String getNumber() {
        return number;
    }
}
