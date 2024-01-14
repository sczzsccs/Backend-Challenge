import java.util.Objects;

public class VehicleFactory {
    public Vehicle getVehicle(String vehicleType) {
        if (Objects.equals(vehicleType, "car")) return new Car();
        if (vehicleType.equals("truck")) return new Truck();
        else throw new IllegalArgumentException("Unknown");
    }
}