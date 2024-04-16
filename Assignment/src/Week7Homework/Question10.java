package Week7Homework;

import java.util.Scanner;

public class Question10 {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sales ID: ");
        int salesId = sc.nextInt();

        System.out.print("Enter seller's name: ");
        String sellername = sc.nextLine();

        System.out.print( "\nEnter sales amount: ");
        double salesamount = sc.nextDouble();

        System.out.print("Enter salary basic: ");
        double salarybasic = sc.nextDouble();

        double commision = 0;

        if (salesamount >= 50000){
            commision = salesamount*0.5;
        }
        else if(salesamount >= 30000){
            commision = salesamount*0.2;
        }
        else if(salesamount >= 20000){
            commision = salesamount*0.1;
        }
        else if(salesamount >= 10000){
            commision = salesamount*0.05;
        }
        else if (salesamount <10000){
            commision = salesamount*0.02;
        }

        System.out.println("Sales ID       : "+salesId);
        System.out.println("Seller Name    : "+sellername);
        System.out.println("Sales Amount   : "+salesamount);
        System.out.println("Salary Basic   : "+salarybasic);
        System.out.println("Commision      : "+commision);

        double totalsalary = salarybasic+commision;
        System.out.println("Total salary   : "+totalsalary);


    }
}
