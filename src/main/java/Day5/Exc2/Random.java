package Day5.Exc2;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class Random {

        static LocalDate getRandomDate(){
            long minDay = LocalDate.of(2020, 1, 1).toEpochDay();
            long maxDay = LocalDate.of(2030, 12, 31).toEpochDay();
            long randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay);
            return LocalDate.ofEpochDay(randomDay);
        }

        static int getRandomWeight(){
            return ThreadLocalRandom.current().nextInt(1,15);
        }
    }

