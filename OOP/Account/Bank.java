package Account;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Added account for " + account.getAccountHolder());
    }

    public void removeAccount(String accountNumber) {
        Account toRemove = null;
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                toRemove = acc;
                break;
            }
        }

        if (toRemove != null) {
            accounts.remove(toRemove);
            System.out.println("Removed account: " + accountNumber);
        } else {
            System.out.println("Account not found.");
        }
    }
    public Account findAccount(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }
    public void deposit(String accountNumber, double amount) {
        Account acc = findAccount(accountNumber);
        if (acc != null) {
            acc.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(String accountNumber, double amount) {
        Account acc = findAccount(accountNumber);
        if (acc != null) {
            acc.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts in the bank.");
        } else {
            System.out.println("\n--- Bank Accounts ---");
            for (Account acc : accounts) {
                System.out.println(acc);
            }
        }
    }
}
