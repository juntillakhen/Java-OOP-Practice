package TraverlService;

import java.util.List;

public class TravelMain {
    public static void main(String[] args) {
        TravelService service = new TravelService();

        System.out.println("Searching flights from Manila to Davao:");
        List<TravelService.Flight> flights = service.searchFlights("Manila", "Davao");
        for (TravelService.Flight f : flights) {
            System.out.println("- " + f);
        }

        System.out.println("\nSearching hotels in Cebu:");
        List<TravelService.Hotel> hotels = service.searchHotels("Cebu");
        for (TravelService.Hotel h : hotels) {
            System.out.println("- " + h);
        }

        System.out.println("\nBooking flight DC123...");
        service.bookFlight("DC123");

        System.out.println("Booking hotel 'Sea View Hotel'...");
        service.bookHotel("Sea View Hotel");

        System.out.println("\nCurrent reservations:");
        service.showReservations();

        System.out.println("\nCancelling flight CD456...");
        service.cancelFlight("CD456");

        System.out.println("Cancelling hotel 'Sea View Hotel'...");
        service.cancelHotel("Sea View Hotel");

        System.out.println("\nReservations after cancellation:");
        service.showReservations();
    }
}
