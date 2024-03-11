package Encapsulation.Bank;

/*
 * Encapsulation:Encapsulation is the concept of bundling the data (attributes) and the
 * methods (functions) that operate on the data into a single unit, known as a class. It hides the
 * internal details of an object and protects the data from unauthorized access
 *
 */

public class Bank {
    private double balance;

    public void deposit(double amount){
        if(amount > 0){
            balance+=amount;
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
