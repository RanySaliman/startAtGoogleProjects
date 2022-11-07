package Day3.Exc2;

public class Pig extends AbstractAnimal {

    public void move() {
        System.out.println("pig is moving");
    }

//    @Override
//    public void mate(Animal partner) {
//        Animal.super.mate(partner);
//    }

    @Override
    public AbstractAnimal mate(AbstractAnimal partner) {
        return partner;
    }


    public Pig(GENDER gender, int id, double weight) {
        super(gender, id, weight, BREED.PIG);
    }

    @Override
    public String toString() {
        return "\nPig{" +
                "id=" + id +
                ", weight=" + weight +
                ", gender=" + gender +
                "}";
    }
}
