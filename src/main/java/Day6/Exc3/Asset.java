package Day6.Exc3;

public class Asset implements CommonInterface {
    int serialNum;
    String owner;
    double rating;

    @Override
    public void accept(Visitor visitor) {

    }

    public Asset(int serialNum, String owner, double rating) {
        this.serialNum = serialNum;
        this.owner = owner;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public String getOwner() {
        return owner;
    }

    public int getSerialNum() {
        return serialNum;
    }
}
