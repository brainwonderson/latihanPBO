package model;

public abstract class Vehicle implements Controllable {
    protected String brand;
    protected String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

   public abstract void honk();
}
