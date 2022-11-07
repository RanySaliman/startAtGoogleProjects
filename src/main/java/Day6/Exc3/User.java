package Day6.Exc3;

public class User implements CommonInterface {
    int id;
    String name;
    String password;

    @Override
    public void accept(Visitor visitor) {

    }

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
