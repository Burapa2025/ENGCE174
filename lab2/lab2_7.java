package lab2 ;

import java.util.Scanner ;

class BankAccountt {

    private String ownerName ;
    private double balance ;

    public BankAccountt(String ownerName, double initialBalance) {
        this.ownerName = ownerName ;
        this.balance = initialBalance ;
    }

    public void deposit(double amount) {
        this.balance += amount ;
    }

    public void displaySummary() {
        System.out.println("Owner: " + this.ownerName) ;
        System.out.println("Balance: " + this.balance) ;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount ;
            System.out.println("Withdraw successful.") ;
        } else {
            System.out.println("Insufficient funds.") ;
        }
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance) ;
    }
}

public class lab2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter Owner Name: ") ;
        String ownerName = input.nextLine() ;

        System.out.print("Enter initialBalance: ") ;
        double initialBalance = input.nextDouble() ;

        System.out.print("Enter Withdraw Amount: ") ;
        double withdraw1 = input.nextDouble() ;

        System.out.print("Enter Withdraw Amount: ") ;
        double withdraw2 = input.nextDouble() ;

        BankAccountt accountt = new BankAccountt(ownerName, initialBalance) ;

        accountt.withdraw(withdraw1) ;
        accountt.withdraw(withdraw2) ;

        accountt.displayBalance() ;

        input.close() ;
    }
}

