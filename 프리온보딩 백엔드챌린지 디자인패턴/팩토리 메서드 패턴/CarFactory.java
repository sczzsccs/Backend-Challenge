public class CarFactory extends VehicleFactory2 {
    @Override
    public Vehicle getVehicle() {
        return new Truck();
    }
}