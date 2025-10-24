package BankAccount;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", "Khen Juntilla", 1000);
        account.displayInfo();
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Balance after transactions: " + account.getBalance());

        System.out.println("\nSavings Account:");
        SavingsAccount savings = new SavingsAccount("67890", "Josef Rizale", 2000, 0.05);
        savings.displayInfo();
        savings.applyInterest();
        savings.deposit(300);
        savings.withdraw(100);
        savings.displayInfo();
    }
}
