package Day4.Exc4;

import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        Callable<Integer> integerCallable = new Callable<>() {
            @Override
            public Integer call() throws Exception {
                return ThreadLocalRandom.current().nextInt(10);
            }
        };
        Callable<Double> doubleCallable = new Callable<>() {
            @Override
            public Double call() throws Exception {
                return ThreadLocalRandom.current().nextDouble(10);
            }
        };


        Optional<?> result = retry(integerCallable, 5, 1000L);
        System.out.println(result.get());

        result = retry(doubleCallable, 5.0, 5);
        System.out.println(result.get());
    }

    public static <T> Optional<T> retry(Callable<T> action, T expectedResult) {
        return retry(action, expectedResult, 10, 1000L);
    }

    public static <T> Optional<T> retry(Callable<T> action, T expectedResult, int numberOfRetries) {
        return retry(action, expectedResult, numberOfRetries, 1000L);
    }

    public static <T> Optional<T> retry(Callable<T> action, T expectedResult, long sleep) {
        return retry(action, expectedResult, 10, sleep);
    }

    public static <T> Optional<T> retry(Callable<T> action, T expectedResult, int numberOfRetries, long sleep) {

        T value = null;

        for (int i = 0; i < numberOfRetries; i++) {
            try {
                value = action.call();
                if (value == expectedResult) {
                    System.out.println("Found!");
                    return Optional.of(value);
                }

            } catch (Exception e) {
                System.out.println("Something went wrong");
            }
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        return Optional.ofNullable(value);
    }
}

