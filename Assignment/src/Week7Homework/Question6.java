package Week7Homework;

import java.util.Scanner;

public class Question6 {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Id: ");
        int employeeid = sc.nextInt();

        System.out.println("Enter Employee Name: ");
        String employeename = sc.next();

        System.out.println("Enter Basic Salary: ");
        double basicsalary = sc.nextDouble();

        //calculate the benefits

        double hra = basicsalary*0.10;
        double da = basicsalary*0.08;
        double ta = basicsalary*0.09;
        double pf = basicsalary*0.20;

        double grossSalary = basicsalary+hra+da+ta-pf;

        //printout the frame

        System.out.println("|              Salary Slip               |");
        System.out.println("|                                        |");
        System.out.println("__________________________________________");
        System.out.println("|                                        |");
        System.out.println(" Employee Id            :"+employeeid  +"|");
        System.out.println(" Employee Name          :"+employeename+"|");
        System.out.println("|                                        |");
        System.out.println("__________________________________________");
        System.out.println("|                                        |");
        System.out.println("|Basic Salary            :"+basicsalary+"|");
        System.out.println("|HRA 10%                 :"+hra        +"|");
        System.out.println("|TA 8%                   :"+ta         +"|");
        System.out.println("|DA 9%                   :"+da         +"|");
        System.out.println("|PF-20% &                :"+pf         +"|");
        System.out.println("|                                        |");
        System.out.println("__________________________________________");
        System.out.println("|                                        |");
        System.out.println(" Gross Salary            :"+grossSalary+"|");
        System.out.println("|========================================|");



    }
}
