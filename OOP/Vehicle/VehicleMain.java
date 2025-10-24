package Vehicle;

public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, 15.1);
        Truck truck = new Truck("Ford", "F-150", 2023, 1300);

        car.displayDetails();
        System.out.println();
        truck.displayDetails();
    }
}
