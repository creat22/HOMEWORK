package polymorphism.Question10;

public class CheckingAccount {

    public static void main(String[] args) {
        BankAccount fees = new BankAccount();
        System.out.println("Deposited amount: " +fees.deposit(5000));
        System.out.println("Withdrawal amount: " +fees.withdraw(2000));
    }
}
