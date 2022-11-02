package Day3.Exc2;

public class Dog extends AbstractAnimal{

    @Override
    public void move() {

    }

    @Override
    public void mate(AbstractAnimal partner) {
    }

    public Dog(GENDER gender, int id, double weight) {
        super(gender, id, weight, BREED.Dog);
    }
}
