package Product;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(product.getName())) {
                p.setQuantity(p.getQuantity() + product.getQuantity());
                System.out.println("Updated quantity of " + p.getName() + " to " + p.getQuantity());
                return;
            }
        }
        products.add(product);
        System.out.println("Added product: " + product);
    }

    public void removeProduct(String productName) {
        Product toRemove = null;
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(productName)) {
                toRemove = p;
                break;
            }
        }
        if (toRemove != null) {
            products.remove(toRemove);
            System.out.println("Removed product: " + toRemove.getName());
        } else {
            System.out.println("Product " + productName + " not found.");
        }
    }

    public void checkLowInventory(int threshold) {
        System.out.println("Products with quantity less than " + threshold + ":");
        boolean found = false;
        for (Product p : products) {
            if (p.getQuantity() < threshold) {
                System.out.println("- " + p);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No products with low inventory.");
        }
    }

    public void displayInventory() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Current Inventory:");
            for (Product p : products) {
                System.out.println("- " + p);
            }
        }
    }
}
