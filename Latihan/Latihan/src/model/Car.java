package model;

public class Car extends Vehicle {
    private int speed;

    public Car(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void accelerate() {
        speed += 10;
        System.out.println("Mobil " + brand + " " + model + " dipercepat. Kecepatan sekarang: " + speed);
    }

    @Override
    public void brake() {
        speed -= 5;
        System.out.println("Mobil " + brand + " " + model + " diberhentikan. Kecepatan sekarang: " + speed);
    }

    @Override
   public void honk() {
        System.out.println("Mobil " + brand + " " + model + " berbunyi klakson: Beep beep!");
    }
}