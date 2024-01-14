public class MainEntry {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        
        Vehicle car = vehicleFactory.getVehicle("car");
        car.drive();
        Vehicle truck = vehicleFactory.getVehicle("truck");
        truck.drive();
    }
}