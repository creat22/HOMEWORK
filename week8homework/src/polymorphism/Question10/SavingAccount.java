package polymorphism.Question10;

public class SavingAccount {

    public static void main(String[] args) {
        BankAccount fees = new BankAccount();
        System.out.println("Deposited amount: " +fees.deposit(7000));
        System.out.println("Withdrawal amount: " +fees.withdraw(3000));
    }
}
