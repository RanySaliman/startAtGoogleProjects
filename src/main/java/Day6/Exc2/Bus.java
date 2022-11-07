package Day6.Exc2;

public class Bus implements Vehicle {

    @Override
    public void transport(Passenger passenger) {
        System.out.println(passenger.name + " has been transported by bus");
    }

    @Override
    public void newVehicle(){
        System.out.println("new bus");
    }

    public VehicleType getType() {
        return VehicleType.BUS;
    }
}
