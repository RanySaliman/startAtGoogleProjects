package Day2;

import java.util.ArrayList;
import java.util.Collections;
/*
        Add each number in the range sequentially in a list structure.
        Shuffle it.
        Take the first 'n'.
*/
public class UniqueRandomNumbers {
    static int counter = 0;
    static ArrayList<Integer> list = new ArrayList<Integer>();


    public static void initNumbers(){
        for (int i = 0; i < 100; i++) list.add(i);
        Collections.shuffle(list);
    }

    public static int generateNum() {
        int num = list.get(counter);
        counter++;
        return num;
    }
}



