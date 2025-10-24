package Product;

public class InventoryMain {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addProduct(new Product("Laptop", 10));
        inventory.addProduct(new Product("Mouse", 5));
        inventory.addProduct(new Product("Keyboard", 3));
        inventory.addProduct(new Product("Mouse", 2));  

        inventory.displayInventory();

        inventory.checkLowInventory(5);

        inventory.removeProduct("Keyboard");
        inventory.removeProduct("Tablet");  

        inventory.displayInventory();
    }
}
