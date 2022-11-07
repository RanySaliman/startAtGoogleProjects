package Day3.Exc2;


import java.util.ArrayList;
import java.util.List;

public class Farmer {
    private Farm farm;
    private List<Animal> animalList;


    public Farmer() {
        this.farm = new Farm();
        this.animalList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "\nFarmer{" +
                "farm=" + farm +
                ", animalList=" + animalList +
                '}';
    }

    public Farm getFarm() {
        return farm;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }


    public void makeAnimalMove(String animalName) {
        for (Animal animal : farm.getAnimals()) {
            if (animal.toString().contains(animalName)) {
                animal.move();
                break;
            }
        }
    }

    public void moveSpecificAnimalFromFarmToFarmer(BREED type) {
        AbstractAnimal animal = null;
        switch (type) {
            case DOG:
                animal = farm.removeAnimal(BREED.DOG);
                break;
            case PIG:
                animal = farm.removeAnimal(BREED.PIG);
                break;
            case SHEEP:
                animal = farm.removeAnimal(BREED.SHEEP);
                break;
        }
        this.animalList.add(animal);
    }
}
