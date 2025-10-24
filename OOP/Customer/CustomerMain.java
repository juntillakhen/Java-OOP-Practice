package Customer;

public class CustomerMain {
    public static void main(String[] args) {
        Customer regular = new Customer("Khen Juntilla", "khenjuntilla@example.com");
        regular.addPurchase(1200.50);
        regular.addPurchase(850.75);
        regular.displayInfo();

        System.out.println("\n-------------------------------\n");

        LoyalCustomer loyal = new LoyalCustomer("Juan One", "juanone@example.com", 0.10);
        loyal.addDiscountedPurchase(2000.00);
        loyal.addDiscountedPurchase(1500.00);
        loyal.displayInfo();
    }
}
