public class MainEntry2 {
    public static void main(String[] args) {
        Vehicle car = new CarFactory().getVehicle();
        car.drive();

        Vehicle truck = new TruckFactory().getVehicle();
        truck.drive();
    }
}