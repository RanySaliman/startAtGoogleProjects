package Day5.Exc2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public enum Type {

        MEAT(new String[]{"Beef", "Chicken", "Lamb", "Pork", "Steak"}),
        VEGETABLE(new String[]{"Tomato", "Potato", "Cucumber", "Lettuce"}),
        FRUIT(new String[]{"Apple", "Pineapple", "Watermelon", "Melon", "Kiwi", "Passion fruit"});

        public final String[] products;
        private static final List<Type> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();

        Type(String[] products){
            this.products = products;
        }

        public String getRandomItemName(){
            return this.products[ThreadLocalRandom.current().nextInt(products.length)];
        }
        public static Type getRandomType()  {
            return VALUES.get(ThreadLocalRandom.current().nextInt(SIZE));
        }
    }


