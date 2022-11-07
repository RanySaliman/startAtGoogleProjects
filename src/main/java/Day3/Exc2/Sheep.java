package Day3.Exc2;

public class Sheep extends AbstractAnimal {

    public void move() {
        System.out.println("sheep is moving");
    }

    @Override
    public AbstractAnimal mate(AbstractAnimal partner) {

        return partner;
    }


    public Sheep(GENDER gender, int id, double weight) {
        super(gender, id, weight, BREED.SHEEP);
    }

    @Override
    public String toString() {
        return "\nSheep{" +
                "id=" + id +
                ", weight=" + weight +
                ", gender=" + gender +
                "}";
    }
}
