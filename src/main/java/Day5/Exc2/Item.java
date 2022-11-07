package Day5.Exc2;

import java.time.LocalDate;

public class Item {
    private String name;
    private Type type;
    private LocalDate expirationDate;
    private double weight;

    public Item(String name, Type type, LocalDate expirationDate, double weight){
        this.name = name;
        this.type = type;
        this.expirationDate = expirationDate;
        this.weight = weight;
    }

    LocalDate getDate(){
        return LocalDate.of(expirationDate.getYear(),expirationDate.getMonth(),expirationDate.getDayOfMonth());
    }

    String getName(){
        return name;
    }

    double getWeight(){ return weight;}

    Type getType(){
        return type;
    }


    @Override
    public String toString(){
        return "Item { name = " + name +
                ", type = " + type +
                ", expiration date = " + expirationDate.toString() +
                ", weight = " + weight + " }";
    }


}

