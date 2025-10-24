package CustomerOrder;

public class CustomerOrderMain {
    public static void main(String[] args) {
        OnlineOrder order1 = new OnlineOrder(
            "ORD001", 
            "Khen Juntilla", 
            "2025-10-23", 
            "Davao City", 
            "KTJ123456PH"
        );

        OnlineOrder order2 = new OnlineOrder(
            "ORD002", 
            "Juan Tamade", 
            "2025-10-23", 
            "Cebu City", 
            "JTK987654PH"
        );

        order1.displayOrderDetails();
        System.out.println("\n-------------------------------\n");
        order2.displayOrderDetails();

        System.out.println("\n-------------------------------\n");
        order1.updateTrackingStatus("Shipped");
        order1.updateTrackingStatus("Out for Delivery");
        order1.updateTrackingStatus("Delivered");
    }
}
