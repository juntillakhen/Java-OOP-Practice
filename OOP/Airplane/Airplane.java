package Airplane;

public class Airplane {
    private String flightNumber;
    private String destination;
    private String departureTime; 
    private boolean delayed;

    public Airplane(String flightNumber, String destination, String departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.delayed = false;  
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public boolean isDelayed() {
        return delayed;
    }

    public String getFlightStatus() {
        return delayed ? "Delayed" : "On Time";
    }

    public void delayFlight(String newDepartureTime) {
        this.departureTime = newDepartureTime;
        this.delayed = true;
        System.out.println("Flight " + flightNumber + " delayed. New departure time: " + departureTime);
    }

    public void displayInfo() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Status: " + getFlightStatus());
    }
}