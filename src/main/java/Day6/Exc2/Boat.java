package Day6.Exc2;

public class Boat implements Vehicle {

    @Override
    public void transport(Passenger passenger) {
            System.out.println(passenger.name + " has been transported by boat");
    }

    @Override
    public void newVehicle(){
        System.out.println("new boat");
    }

    @Override
    public VehicleType getType() {
        return VehicleType.BOAT;
    }


}


