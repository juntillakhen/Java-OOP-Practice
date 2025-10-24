package Customer;

import java.util.ArrayList;

public class Customer {
    protected String name;
    protected String email;
    protected ArrayList<Double> purchaseHistory;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.purchaseHistory = new ArrayList<>();
    }

    public void addPurchase(double amount) {
        if (amount > 0) {
            purchaseHistory.add(amount);
            System.out.println("Added purchase: ₱" + amount);
        } else {
            System.out.println("Invalid purchase amount.");
        }
    }

    public double calculateTotalExpenditure() {
        double total = 0;
        for (double amount : purchaseHistory) {
            total += amount;
        }
        return total;
    }

    public void displayInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Total Purchases: ₱" + calculateTotalExpenditure());
    }
}

class LoyalCustomer extends Customer {
    private double discountRate;

    public LoyalCustomer(String name, String email, double discountRate) {
        super(name, email);
        this.discountRate = discountRate;
    }

    public void addDiscountedPurchase(double amount) {
        if (amount > 0) {
            double discountedAmount = amount - (amount * discountRate);
            purchaseHistory.add(discountedAmount);
            System.out.println("Purchase with discount applied: ₱" + discountedAmount + " (Discount: " + (discountRate * 100) + "%)");
        } else {
            System.out.println("Invalid purchase amount.");
        }
    }

    public void displayInfo() {
        System.out.println("Loyal Customer Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Discount Rate: " + (discountRate * 100) + "%");
        System.out.println("Total Purchases (after discounts): ₱" + calculateTotalExpenditure());
    }
}
