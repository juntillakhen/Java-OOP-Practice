package Reservation;

public class ReservationMain {
    public static void main(String[] args) {
        ResortReservation resortRes = new ResortReservation(
            "R001", "Juan Dela Cruz", "2025-11-10", 204
        );

        RailwayReservation railRes = new RailwayReservation(
            "T002", "Maria Santos", "2025-11-12", "A15"
        );

        resortRes.displayDetails();
        System.out.println("\n-------------------------------\n");
        railRes.displayDetails();

        System.out.println("\n-------------------------------\n");
        resortRes.modifyDate("2025-11-15");
        resortRes.modifyRoomNumber(305);
        resortRes.updateStatus("Confirmed");
        resortRes.displayDetails();

        System.out.println("\n-------------------------------\n");
        railRes.modifySeatNumber("B20");
        railRes.updateStatus("Cancelled");
        railRes.displayDetails();

        System.out.println("\n-------------------------------\n");
        resortRes.checkStatus();
        railRes.checkStatus();
    }
}
