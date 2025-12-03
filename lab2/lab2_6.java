package lab2;

import java.util.Scanner;

class BankAccount {

    private String ownerName;
    private double balance;

    public BankAccount(String ownerName, double initialBalance)  {
        if (ownerName == null || ownerName.isBlank()) {
            throw new IllegalArgumentException("Owner name must not be empty.");
        }
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance must not be negative.");
        }
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than zero.");
        }
        this.balance += amount;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void displaySummary() {
        System.out.printf("Owner: %s%n", this.ownerName);
        System.out.printf("Balance: %.2f%n", this.balance);
    }

    @Override
    public String toString() {
        return String.format("BankAccount{owner='%s', balance=%.2f}", ownerName, balance);
    }
}

public class lab2_6 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter Owner Name: ");
            String ownerName = input.nextLine().trim();

            System.out.print("Enter Initial Balance: ");
            while (!input.hasNextDouble()) {
                System.out.println("Please enter a valid number for balance.");
                input.next();
            }
            double initialBalance = input.nextDouble();

            System.out.print("Enter Deposit Amount: ");
            while (!input.hasNextDouble()) {
                System.out.println("Please enter a valid number for deposit amount.");
                input.next();
            }
            double depositAmount = input.nextDouble();

            BankAccount myAccount = new BankAccount(ownerName, initialBalance);

            myAccount.deposit(depositAmount);

            System.out.println("\n=== Account Summary ===");
            myAccount.displaySummary();
        } catch (IllegalArgumentException e) {
            System.out.println("Input error: " + e.getMessage());
        }
    }
}