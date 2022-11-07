package Day6.Exc2;

public enum VehicleType {
    PLANE("plane"), BUS("bus"), TAXI("taxi"), BOAT("boat");

    private final String vehicle;

    VehicleType(String vehicle) {
        this.vehicle = vehicle;
    }

    public String toString() {
        return vehicle;
    }
}
