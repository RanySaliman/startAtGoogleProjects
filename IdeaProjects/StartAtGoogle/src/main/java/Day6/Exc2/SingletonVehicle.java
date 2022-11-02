package Day6.Exc2;

public class SingletonVehicle {
    private static SingletonVehicle instance;

    public static SingletonVehicle getInstance() {
        if (instance == null) {
            instance = new SingletonVehicle();
        }
        return instance;
    }

    private SingletonVehicle() {
    }

    public static Vehicle createVehicle(VehicleType vehicleType) {
        switch (vehicleType) {
            case Bus:
                return new Bus();
            case Boat:
                return new Boat();
            case Plane:
                return new Plane();
            case Taxi:
                return new Taxi();
            default:
                System.out.println("No match found...");
        }
        return null;
    }
}

