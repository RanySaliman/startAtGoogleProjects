package Day3.Exc2;

public class Sheep extends AbstractAnimal{

    public void move() {

    }

    @Override
    public void mate(AbstractAnimal partner) {

    }


    public Sheep(GENDER gender, int id, double weight) {
        super(gender, id, weight, BREED.Sheep);
    }
}
