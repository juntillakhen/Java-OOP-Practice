package TraverlService;

import java.util.ArrayList;
import java.util.List;

public class TravelService {

    static class Flight {
        String flightNumber;
        String origin;
        String destination;

        public Flight(String flightNumber, String origin, String destination) {
            this.flightNumber = flightNumber;
            this.origin = origin;
            this.destination = destination;
        }

        public String toString() {
            return flightNumber + " from " + origin + " to " + destination;
        }
    }

    static class Hotel {
        String name;
        String city;

        public Hotel(String name, String city) {
            this.name = name;
            this.city = city;
        }

        public String toString() {
            return name + " in " + city;
        }
    }

    static class FlightReservation {
        Flight flight;

        public FlightReservation(Flight flight) {
            this.flight = flight;
        }

        public String toString() {
            return "Flight reservation: " + flight;
        }
    }

    static class HotelReservation {
        Hotel hotel;

        public HotelReservation(Hotel hotel) {
            this.hotel = hotel;
        }

        public String toString() {
            return "Hotel reservation: " + hotel;
        }
    }

    private List<Flight> flights = new ArrayList<>();
    private List<Hotel> hotels = new ArrayList<>();

    private List<FlightReservation> bookedFlights = new ArrayList<>();
    private List<HotelReservation> bookedHotels = new ArrayList<>();

    public TravelService() {
        flights.add(new Flight("PR123", "Manila", "Cebu"));
        flights.add(new Flight("PR456", "Cebu", "Davao"));
        flights.add(new Flight("PR789", "Manila", "Davao"));

        hotels.add(new Hotel("Sea View Hotel", "Cebu"));
        hotels.add(new Hotel("Mountain Inn", "Davao"));
        hotels.add(new Hotel("City Lodge", "Manila"));
    }

    public List<Flight> searchFlights(String origin, String destination) {
        List<Flight> results = new ArrayList<>();
        for (Flight f : flights) {
            if (f.origin.equalsIgnoreCase(origin) && f.destination.equalsIgnoreCase(destination)) {
                results.add(f);
            }
        }
        return results;
    }
    public List<Hotel> searchHotels(String city) {
        List<Hotel> results = new ArrayList<>();
        for (Hotel h : hotels) {
            if (h.city.equalsIgnoreCase(city)) {
                results.add(h);
            }
        }
        return results;
    }

    public boolean bookFlight(String flightNumber) {
        for (Flight f : flights) {
            if (f.flightNumber.equalsIgnoreCase(flightNumber)) {
                bookedFlights.add(new FlightReservation(f));
                System.out.println("Flight booked: " + f);
                return true;
            }
        }
        System.out.println("Flight not found: " + flightNumber);
        return false;
    }

    public boolean bookHotel(String hotelName) {
        for (Hotel h : hotels) {
            if (h.name.equalsIgnoreCase(hotelName)) {
                bookedHotels.add(new HotelReservation(h));
                System.out.println("Hotel booked: " + h);
                return true;
            }
        }
        System.out.println("Hotel not found: " + hotelName);
        return false;
    }

    public boolean cancelFlight(String flightNumber) {
        for (FlightReservation fr : bookedFlights) {
            if (fr.flight.flightNumber.equalsIgnoreCase(flightNumber)) {
                bookedFlights.remove(fr);
                System.out.println("Cancelled flight: " + flightNumber);
                return true;
            }
        }
        System.out.println("Flight reservation not found: " + flightNumber);
        return false;
    }

    public boolean cancelHotel(String hotelName) {
        for (HotelReservation hr : bookedHotels) {
            if (hr.hotel.name.equalsIgnoreCase(hotelName)) {
                bookedHotels.remove(hr);
                System.out.println("Cancelled hotel: " + hotelName);
                return true;
            }
        }
        System.out.println("Hotel reservation not found: " + hotelName);
        return false;
    }

    public void showReservations() {
        System.out.println("Booked Flights:");
        if (bookedFlights.isEmpty()) System.out.println("- None");
        else for (FlightReservation fr : bookedFlights) System.out.println("- " + fr);

        System.out.println("Booked Hotels:");
        if (bookedHotels.isEmpty()) System.out.println("- None");
        else for (HotelReservation hr : bookedHotels) System.out.println("- " + hr);
    }
}

