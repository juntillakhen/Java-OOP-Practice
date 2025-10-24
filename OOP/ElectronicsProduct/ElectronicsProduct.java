package ElectronicsProduct;

public class ElectronicsProduct {
    protected String productID;
    protected String name;
    protected double price;

    public ElectronicsProduct(String productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    public void applyDiscount(double discountRate) {
        if (discountRate > 0 && discountRate < 1) {
            double discountAmount = price * discountRate;
            price -= discountAmount;
            System.out.println("Discount applied: " + (discountRate * 100) + "%");
            System.out.println("Discount amount: ₱" + discountAmount);
        } else {
            System.out.println("Invalid discount rate.");
        }
    }

    public double getFinalPrice() {
        return price;
    }

    public void displayDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + name);
        System.out.println("Price: ₱" + price);
    }
}

class WashingMachine extends ElectronicsProduct {
    private int warrantyPeriod; 

    public WashingMachine(String productID, String name, double price, int warrantyPeriod) {
        super(productID, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    public void extendWarranty(int extraMonths) {
        if (extraMonths > 0) {
            warrantyPeriod += extraMonths;
            System.out.println("Warranty extended by " + extraMonths + " months.");
        } else {
            System.out.println("Invalid warranty extension.");
        }
    }

    public void displayDetails() {
        System.out.println("Washing Machine Details:");
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + name);
        System.out.println("Price: ₱" + price);
        System.out.println("Warranty Period: " + warrantyPeriod + " months");
    }
}
