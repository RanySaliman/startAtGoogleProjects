package Day3.Exc2;

public class WoodenHorse implements WoodenStructures {

    @Override
    public void roll() {
        System.out.println("They see me rollin', They hatin'");
    }

    @Override
    public WoodenStructures replicate() {
        return new WoodenHorse();
    }
}
