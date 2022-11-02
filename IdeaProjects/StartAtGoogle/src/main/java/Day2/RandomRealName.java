package Day2;

import com.github.javafaker.Faker;
import com.github.javafaker.Pokemon;

public class RandomRealName {


    Faker faker = new Faker();

    String firstName = faker.name().firstName();

    String poke = faker.pokemon().name();

    public String getPoke() {
        return poke;
    }

    public String getFirstName() {
        return firstName;
    }

}
