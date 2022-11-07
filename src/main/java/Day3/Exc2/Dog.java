package Day3.Exc2;

public class Dog extends AbstractAnimal {

    public Dog(GENDER gender, int id, double weight) {
        super(gender, id, weight, BREED.DOG);
    }

    @Override
    public void move() {
        System.out.println("dog is moving");
    }

    @Override
    public AbstractAnimal mate(AbstractAnimal partner) {
        return partner;
    }


    @Override
    public String toString() {
        return "\nDog{" +
                "id=" + id +
                ", weight=" + weight +
                ", gender=" + gender +
                "}";
    }
}

