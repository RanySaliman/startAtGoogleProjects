package Day6.Exc1;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Cars {

    static Cars create(int carNum, String carModel){
        return new AutoValue_Cars(carNum, carModel);
    }

    static String[] models;
    static String[] modelsAlso;
    static int counter = 0;
    static int counterAlso = 0;
    abstract int carNum();
    abstract String carModel();

    public static void main(String[] args) {
        Cars tesla = Cars.create(8583201, "Tesla");
        System.out.println(tesla);
        addToModels("Tesla");
        addToModels("Jaguar");
        addToModels("Benz");
    }

    static void addToModels(String model){
        models[counter] = model;
        counter ++;
        addToAnotherModels(model);
    }
    static void addToAnotherModels(String model){
        modelsAlso[counter] = model;
        counterAlso ++;
    }

    public boolean compare(String firstList[], String secondList[]) {
        return firstList.equals(secondList);
    }
}
