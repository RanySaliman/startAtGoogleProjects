package Day6.Exc2;

public class Plane implements Vehicle {

    @Override
    public void transport(Passenger passenger) {
        System.out.println(passenger.name + " has been transported by plane");
    }

    @Override
    public void newVehicle(){
        System.out.println("new plane");
    }

    public VehicleType getType() {
        return VehicleType.Plane;
    }
}
