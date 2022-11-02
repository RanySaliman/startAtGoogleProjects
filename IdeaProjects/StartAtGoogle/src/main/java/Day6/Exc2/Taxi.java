package Day6.Exc2;

public class Taxi implements Vehicle {

    @Override
    public void transport(Passenger passenger) {
        System.out.println(passenger.name + " has been transported by taxi");
    }

    @Override
    public void newVehicle(){
        System.out.println("new taxi");
    }

    public VehicleType getType() {
        return VehicleType.Taxi;
    }
}
