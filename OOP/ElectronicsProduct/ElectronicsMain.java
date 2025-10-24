package ElectronicsProduct;

public class ElectronicsMain {
    public static void main(String[] args) {
        ElectronicsProduct phone = new ElectronicsProduct("AB001", "MyPhone", 25000);
        phone.displayDetails();
        phone.applyDiscount(0.10);
        System.out.println("Final Price after discount: ₱" + phone.getFinalPrice());

        System.out.println("\n-------------------------------\n");

        WashingMachine wm = new WashingMachine("ABC02", "Ultra Puti Washing Turbo", 35000, 24);
        wm.displayDetails();
        wm.applyDiscount(0.15);
        System.out.println("Final Price after discount: ₱" + wm.getFinalPrice());
        wm.extendWarranty(12);
        wm.displayDetails();
    }
}
