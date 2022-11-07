package Day3.Exc2;


public class Main {
    public static void main(String[] args) {

        Farmer yeehaw = new Farmer();
        System.out.println(yeehaw);

        yeehaw.makeAnimalMove("Dog");
        yeehaw.makeAnimalMove("Pig");
        yeehaw.makeAnimalMove("Sheep");

        yeehaw.moveSpecificAnimalFromFarmToFarmer(BREED.DOG);
        System.out.println(yeehaw);

        WoodenHorse woodenHorse = new WoodenHorse();
        woodenHorse.roll();
        woodenHorse.replicate();

    }
}