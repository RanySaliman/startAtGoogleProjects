package Day3.Exc2;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Farm {
    private static ArrayList<AbstractAnimal> animals = new ArrayList<>();

    public Farm() {
        this.animals = animals;
        acquire(BREED.DOG);
        acquire(BREED.PIG);
        acquire(BREED.SHEEP);
    }

    public void mate(Animal animal1, Animal animal2) {
        Animal newAnimal = animal1.mate(animal2);
        animals.add((AbstractAnimal) newAnimal);
    }

    public void acquire(BREED animal) {
        AbstractAnimal acquiredAnimal = null;
        GENDER gender = GENDER.values()[ThreadLocalRandom.current().nextInt(GENDER.values().length)];
        int randId = ThreadLocalRandom.current().nextInt(100);
        double randWeight = ThreadLocalRandom.current().nextDouble(1, 20);

        switch (animal) {
            case DOG:
                acquiredAnimal = new Dog(gender, randId, randWeight);
                break;
            case PIG:
                acquiredAnimal = new Pig(gender, randId, randWeight + 80);
                break;
            case SHEEP:
                acquiredAnimal = new Sheep(gender, randId, randWeight + 30);
                break;
        }
        animals.add(acquiredAnimal);
    }

    public static void newAnimal(Animal animal, int id) {
        Objects.requireNonNull(animal);
        animals.add(id, (AbstractAnimal) animal);
        System.out.println(animal.toString() + "has been added to the farm");
    }


    public AbstractAnimal removeAnimal(BREED type) {
        for (AbstractAnimal animal : animals) {
            if (animal.getClass().toString().toLowerCase().contains(type.toString().toLowerCase())) {
                animals.remove(animal);
                return animal;
            }
        }
        System.out.println("no such animal");
        return null;
    }

    public ArrayList<AbstractAnimal> getAnimals() {
        return animals;
    }

    @Override
    public String toString() {
        return "Farm{}" +
                "animals=" +
                animals +
                "}\n";
    }
}
