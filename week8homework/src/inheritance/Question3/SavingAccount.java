package inheritance.Question3;

public class SavingAccount extends BankAccount {


    public void withdraw(){


        if (depositamount-withdrawcash >=100){
            System.out.println("able to withdraw money");
        }
        else{
            System.out.println("Withdraw failed: minimum balance required");
        }
    }

    public static void main(String []args){

  SavingAccount savings = new SavingAccount();
  savings.withdraw();

    }

    }

