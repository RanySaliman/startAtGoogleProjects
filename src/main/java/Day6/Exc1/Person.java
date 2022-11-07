package Day6.Exc1;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Person {
    static Person create(int id, String name){
        return new AutoValue_Person(id, name);
    }

    abstract int id();
    abstract String name();
    public static void main(String[] args) {
        Person shmulik = Person.create(123, "Shmulik");
        System.out.println(shmulik);
    }
}