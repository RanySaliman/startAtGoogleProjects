package Day3.Exc2;

import java.util.Random;

import static Day3.Exc2.Farm.newAnimal;

public abstract class AbstractAnimal implements Animal {
    GENDER gender;
    int id;
    double weight;
    private BREED breed;
    private Random r = new Random();
    int randomId = r.nextInt(100);
    double randomWeight = 100 * r.nextDouble();

    public AbstractAnimal(GENDER gender, int id, double weight, BREED breed) {
        this.gender = gender;
        this.id = id;
        this.weight = weight;
        this.breed = breed;
    }


    @Override
    public void move() {
        System.out.println("moved abstract " + this.breed);
    }

    @Override
    public AbstractAnimal mate(AbstractAnimal partner) {
        if ((this.breed == partner.breed) && this.gender != partner.gender) {
            switch (breed) {
                case DOG:
                    addAbstractAnimalToFarm(new Dog(this.gender, randomId, randomWeight), randomId);
                    break;
                case PIG:
                    addAbstractAnimalToFarm(new Pig(this.gender, randomId, randomWeight), randomId);
                    break;
                case SHEEP:
                    addAbstractAnimalToFarm(new Sheep(this.gender, randomId, randomWeight), randomId);
                    break;
            }

        }
        return partner;
    }

    public void acquire(AbstractAnimal animal) {
        switch (breed) {
            case DOG:
                addAbstractAnimalToFarm(new Dog(this.gender, randomId, randomWeight), randomId);
                break;
            case PIG:
                addAbstractAnimalToFarm(new Pig(this.gender, randomId, randomWeight), randomId);
                break;
            case SHEEP:
                addAbstractAnimalToFarm(new Sheep(this.gender, randomId, randomWeight), randomId);
                break;
            default:
                throw new IllegalArgumentException(String.format("Animal type is not in the farm", animal));
        }
    }

    public void addAbstractAnimalToFarm(AbstractAnimal animal, int id) {
        newAnimal(animal, id);
    }

    @Override
    public String toString() {
        return "AbstractAnimal{" +
                "gender=" + gender +
                ", id=" + id +
                ", weight=" + weight +
                ", breed=" + breed +
                '}';
    }
}
