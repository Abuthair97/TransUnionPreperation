package Encapsulation.Bank;

public class BankMain {
    public static void main(String[] args) {
        {
            Bank bank = new Bank();
            bank.setBalance(2000);
            bank.deposit(2000);
            bank.withdraw(3000);
            System.out.println(bank.getBalance());


        }
    }
}