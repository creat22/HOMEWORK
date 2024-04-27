package inheritance.Question3;

/*
Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals
    if the account balance falls below one hundred.
*/

public class BankAccount {

    double balance = 0;
    double depositamount;
    double withdrawcash;

    void deposit(){
        depositamount += balance;
        System.out.println(depositamount);
    }
    void withdraw(){
        System.out.println(withdrawcash);
    }

    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.depositamount = 1200.05;
        bank.withdrawcash = 1300;
        bank.deposit();
        bank.withdraw();
    }
}

