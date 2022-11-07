package Day6.Exc2;

import java.util.concurrent.ThreadLocalRandom;

public class Passenger {
    String name;
    public VehicleType favoriteVehicle;

    public VehicleType getFavoriteVehicle() {
        return favoriteVehicle;
    }

    public Passenger(String name) {
        this.name = name;
        favoriteVehicle = VehicleType.values()[ThreadLocalRandom.current().nextInt(VehicleType.values().length)];

    }

    public String getName() {
        return name;
    }
}
