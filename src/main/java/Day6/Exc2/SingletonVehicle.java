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
            case BUS:
                return new Bus();
            case BOAT:
                return new Boat();
            case PLANE:
                return new Plane();
            case TAXI:
                return new Taxi();
            default:
                System.out.println("Match not found, try different vehicle");
        }
        return null;
    }
}

