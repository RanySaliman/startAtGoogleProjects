package Day3.Exc2;

public class Pig extends AbstractAnimal{

    public void move() {

    }

//    @Override
//    public void mate(Animal partner) {
//        Animal.super.mate(partner);
//    }

    @Override
    public void mate(AbstractAnimal partner) {

    }


    public Pig(GENDER gender, int id, double weight) {
        super(gender, id, weight, BREED.Pig);
    }
}
