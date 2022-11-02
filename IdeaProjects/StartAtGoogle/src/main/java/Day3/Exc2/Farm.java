package Day3.Exc2;

import java.util.HashMap;
import java.util.Objects;

public class Farm {
    private static HashMap<Integer, Animal> animals;

    public Farm(HashMap<Integer, Animal> animals) {
        this.animals = animals;
    }
    public void mate(Animal animal1, Animal animal2){
        Animal newAnimal = animal1.mate(animal2);
    }
    public void acquire(Animal animal){

    }
    public static void newAnimal(Animal animal, int id){
        Objects.requireNonNull(animal);
        animals.put(id, animal);
        System.out.println(animal.toString() + "has been added to the farm");
    }
}
