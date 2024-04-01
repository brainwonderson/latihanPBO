package model;

public class VehicleFactory {
    public static Vehicle createVehicle(VehicleType type, String brand, String model) {
        switch (type) {
            case CAR:
                return new Car(brand, model);
            case MOTORCYCLE:
                return new Motorcycle(brand, model);
            default:
                throw new IllegalArgumentException("Tipe kendaraan tidak valid.");
        }
    }
}
