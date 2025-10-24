package Vehicle;

public class Vehicle {
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    private double trunkSize; 

    public Car(String make, String model, int year, double trunkSize) {
        super(make, model, year);
        this.trunkSize = trunkSize;
    }

    public void displayDetails() {
        System.out.println("Car Details:");
        super.displayDetails();
        System.out.println("Trunk Size: " + trunkSize + " cubic feet");
    }
}

class Truck extends Vehicle {
    private double payloadCapacity; 

    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    public void displayDetails() {
        System.out.println("Truck Details:");
        super.displayDetails();
        System.out.println("Payload Capacity: " + payloadCapacity + " kg");
    }
}
