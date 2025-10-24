package Airplane;

public class AirplaneMain {
    public static void main(String[] args) {
        Airplane flight = new Airplane("AB123", "Cebu", "14:30");

        flight.displayInfo();

        System.out.println("\nChecking flight status: " + flight.getFlightStatus());

        flight.delayFlight("16:00");

        System.out.println("\nUpdated flight info:");
        flight.displayInfo();
    }
}
