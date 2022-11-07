package Day4.Exc3;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {

    }

    public static void reflectTest() throws NoSuchMethodException {

        Course math = new Course("mathematics");
        Student yossi = new Student("yossi", "cohen");
        Class<?> clz = yossi.getClass();
        System.out.println(clz.getName());
        Constructor<?> constructor = clz.getConstructor();

    }

}
