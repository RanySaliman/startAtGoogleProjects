package Day1;

public class User {
    static String name = "";
    static int id;
    static boolean isActivated;

    public User(String name, int id, boolean isActivated) {
        this.name = name;
        this.id = id;
        this.isActivated = isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static boolean getIsActivated() {
        return isActivated;
    }

    public boolean isIsActivated() {
        return isActivated;
    }

    public static void setIsActivated(boolean isActivated) {
        User.isActivated = isActivated;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
