package polymorphism.Question10;

/*Write a Java program to create a base class BankAccount with methods deposit() and withdraw().
Create two subclasses SavingsAccount and CheckingAccount. Override the withdraw()
method in each subclass to impose different withdrawal limits and fees.*/

public class BankAccount {

    public double deposit(double deposit){
        return deposit;
        }

    public double withdraw(double withdraw){
    return withdraw;}

    public static void main(String[] args) {
        BankAccount fees = new BankAccount();
        double deposit = fees.deposit(2000);
        double withdraw = fees.withdraw(1000);
        System.out.println("Deposited amount: " +deposit);
        System.out.println("Withdrawal amount: " +withdraw);

    }

}


