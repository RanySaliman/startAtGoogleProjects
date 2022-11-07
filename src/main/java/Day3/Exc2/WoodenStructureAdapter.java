package Day3.Exc2;

public class WoodenStructureAdapter implements Animal {
        WoodenStructures woodenStructures;

    public WoodenStructureAdapter(WoodenStructures replicate) {
        this.woodenStructures=replicate;
    }

    @Override
    public void move() {
        woodenStructures.roll();
    }

    @Override
    public Animal mate(Animal partner) {
        return new WoodenStructureAdapter(woodenStructures.replicate());    }

    @Override
    public AbstractAnimal mate(AbstractAnimal partner) {
        return null;
    }
}
