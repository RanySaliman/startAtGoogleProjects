package Day3.Exc2;

public interface Animal {
    public void move();


    public default Animal mate(Animal partner){
        return partner;
    }

    void mate(AbstractAnimal partner);
}
