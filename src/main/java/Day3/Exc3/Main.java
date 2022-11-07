package Day3.Exc3;

public class Main {
    static Name name = new Name(Name.Prefix.Dr,"David","Yudin");
    static Name name1 = new Name(Name.Prefix.Dr,"kavid","Yudi");

    public static void main(String[] args) {
        System.out.println(name.equals(name1));
        System.out.println(name.compareTo(name1));
    }

}
