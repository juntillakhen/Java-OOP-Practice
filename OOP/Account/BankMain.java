package Account;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account acc1 = new Account("1111", "Khen Juntilla", 5000.0);
        Account acc2 = new Account("1112", "Juan Dela Cruz", 3000.0);
        Account acc3 = new Account("1113", "Jose Hose", 10000.0);

        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(acc3);

        bank.displayAllAccounts();

        System.out.println("\n--- Transactions ---");
        bank.deposit("1001", 1500.0);
        bank.withdraw("1002", 1000.0);

        bank.removeAccount("1003");

        bank.displayAllAccounts();
    }
}
