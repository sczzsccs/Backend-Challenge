public class TruckFactory extends VehicleFactory2 {
    @Override
    public Vehicle getVehicle() {
        return new Car();
    }
}