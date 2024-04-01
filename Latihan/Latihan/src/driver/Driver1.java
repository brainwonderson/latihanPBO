package driver;
import model.*;

public class Driver1 {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.createVehicle(VehicleType.CAR, "Toyota", "Camry");
        Vehicle motorcycle = VehicleFactory.createVehicle(VehicleType.MOTORCYCLE, "Honda", "CBR");

        car.accelerate();
        car.brake();
        car.honk();

        motorcycle.accelerate();
        motorcycle.brake();
        motorcycle.honk();
    }
}
// jika ingin mengubah dalam bentuk inputan tinggal ubah objek dalam bentuk inputan saja
