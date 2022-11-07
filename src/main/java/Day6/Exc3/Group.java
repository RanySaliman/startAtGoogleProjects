package Day6.Exc3;

public class Group implements CommonInterface {
    int id;
    int size;

    @Override
    public void accept(Visitor visitor) {

    }

    public int getSize() {
        return size;
    }

    public int getId() {
        return id;
    }

    public Group(int id, int size) {
        this.id = id;
        this.size = size;
    }
}
