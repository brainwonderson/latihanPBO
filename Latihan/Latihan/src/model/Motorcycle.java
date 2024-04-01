package model;

public class Motorcycle extends Vehicle {
    private int speed;

    public Motorcycle(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void accelerate() {
        speed += 15;
        System.out.println("Sepeda motor " + brand + " " + model + " dipercepat. Kecepatan sekarang: " + speed);
    }

    @Override
    public void brake() {
        speed -= 7;
        System.out.println("Sepeda motor " + brand + " " + model + " diberhentikan. Kecepatan sekarang: " + speed);
    }

    @Override
    public void honk() {
        System.out.println("Sepeda motor " + brand + " " + model + " berbunyi klakson: Beep beep!");
    }
}
