package CustomerOrder;

public class CustomerOrder {
    protected String orderID;
    protected String customerName;
    protected String orderDate;

    public CustomerOrder(String orderID, String customerName, String orderDate) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.orderDate = orderDate;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer: " + customerName);
        System.out.println("Order Date: " + orderDate);
    }
}

class OnlineOrder extends CustomerOrder {
    private String deliveryAddress;
    private String trackingNumber;
    private String trackingStatus;

    public OnlineOrder(String orderID, String customerName, String orderDate, String deliveryAddress, String trackingNumber) {
        super(orderID, customerName, orderDate);
        this.deliveryAddress = deliveryAddress;
        this.trackingNumber = trackingNumber;
        this.trackingStatus = "Processing"; 
    }

    public int calculateDeliveryTime() {
        if (deliveryAddress.toLowerCase().contains("manila")) {
            return 2; 
        } else if (deliveryAddress.toLowerCase().contains("cebu") || deliveryAddress.toLowerCase().contains("davao")) {
            return 5; 
        } else {
            return 7; 
        }
    }

    public void updateTrackingStatus(String newStatus) {
        this.trackingStatus = newStatus;
        System.out.println("Tracking status updated to: " + trackingStatus);
    }

    public void displayOrderDetails() {
        System.out.println("Online Order Details:");
        super.displayOrderDetails();
        System.out.println("Delivery Address: " + deliveryAddress);
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Current Status: " + trackingStatus);
        System.out.println("Estimated Delivery Time: " + calculateDeliveryTime() + " days");
    }
}
