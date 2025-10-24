package Reservation;

public class Reservation {
    protected String reservationID;
    protected String customerName;
    protected String date;
    protected String status;

    public Reservation(String reservationID, String customerName, String date) {
        this.reservationID = reservationID;
        this.customerName = customerName;
        this.date = date;
        this.status = "Pending"; 
    }

    public void checkStatus() {
        System.out.println("Reservation ID: " + reservationID + " | Status: " + status);
    }

    public void modifyDate(String newDate) {
        this.date = newDate;
        System.out.println("Reservation date updated to: " + date);
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Reservation status changed to: " + status);
    }

    public void displayDetails() {
        System.out.println("Reservation ID: " + reservationID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Date: " + date);
        System.out.println("Status: " + status);
    }
}

class ResortReservation extends Reservation {
    private int roomNumber;

    public ResortReservation(String reservationID, String customerName, String date, int roomNumber) {
        super(reservationID, customerName, date);
        this.roomNumber = roomNumber;
    }

    public void modifyRoomNumber(int newRoomNumber) {
        this.roomNumber = newRoomNumber;
        System.out.println("Room number updated to: " + roomNumber);
    }

    @Override
    public void displayDetails() {
        System.out.println("🏨 Resort Reservation Details:");
        super.displayDetails();
        System.out.println("Room Number: " + roomNumber);
    }
}

class RailwayReservation extends Reservation {
    private String seatNumber;

    public RailwayReservation(String reservationID, String customerName, String date, String seatNumber) {
        super(reservationID, customerName, date);
        this.seatNumber = seatNumber;
    }

    public void modifySeatNumber(String newSeatNumber) {
        this.seatNumber = newSeatNumber;
        System.out.println("Seat number updated to: " + seatNumber);
    }

    public void displayDetails() {
        System.out.println("🚆 Railway Reservation Details:");
        super.displayDetails();
        System.out.println("Seat Number: " + seatNumber);
    }
}
