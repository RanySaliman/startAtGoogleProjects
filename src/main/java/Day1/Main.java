package Day1;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class Main {
    static int[] numbers = new int[10];
    static Map<Integer, User> usersById = new HashMap<Integer, User>();
    // static List<Day1.User> listOfUsers = new ArrayList<Day1.User>(usersById.values());

    public static void main( String args[] ){

        for (int i = 0; i < 10; i++) {
            MakeNewUser();
        }

    }

    //usersById.put(student.getId(),student);

    public static void exeFor(int arr[], int div){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % div == 0)
                System.out.println(arr[i]);
        }
    }
    public static void exeForEach(int arr[], int div){
        for (int i: arr
        ) {
            if(arr[i] % div == 0)
                System.out.println(arr[i]);
        }
    }
    public static void exeWhile(int arr[], int div){
        int i=0;
        while (i<arr.length) {
            if (arr[i] % div == 0) {
                System.out.println(arr[i]);
            }
            i++;
        }
    }

    public static int GenerateRandomInt() {
        int int_random = ThreadLocalRandom.current().nextInt();
        return int_random;
    }
    public static boolean GenerateRandomBool() {
        boolean boolean_rand = ThreadLocalRandom.current().nextBoolean();
        return boolean_rand;
    }

    public static void MakeNewUser(){

        int randInt = GenerateRandomInt();
        boolean randBool = GenerateRandomBool();
        RandomString rndString = new RandomString();
        User user = new User(rndString.nextString(), randInt, randBool);
        usersById.put(randInt, user);
    }
    public static void MapIntoList(){
        List<User> listOfUsers = new ArrayList<User>(usersById.values());
    }
    public static int CountActiveUsers(HashMap<Integer,User> mp){
        int counter = 0;
        for (User i: mp.values()
        )
        {
            if (i.isIsActivated()==true)
                counter++;

        }
        return counter;
    }
}


