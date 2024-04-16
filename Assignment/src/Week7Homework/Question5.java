package Week7Homework;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        int  mathmark = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String studentname = sc.nextLine();

        System.out.println("Enter roll No: ");
        int rollno = sc.nextInt();

        System.out.println("Enter Maths Mark:0-100");

        mathmark = sc.nextInt();

        
        System.out.println("Enter Science Mark:0-100");
        int sciencemark = sc.nextInt();

        System.out.println("Enter English Mark:0-100");
        int englishmark = sc.nextInt();

        // calculate marks

        double totalmarks = mathmark + sciencemark + englishmark;
        double percentage = (totalmarks / 3);

        // calculate grades
        String result = (percentage >= 35) ? "Pass" : "Fail";
        String grade;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        // print out the marksheet

        System.out.println("_______________________________________");
        System.out.println("|                                     |");
        System.out.println("|             Mark Sheet              |");
        System.out.println("|                                     |");
        System.out.println("|___                               ___|");
        System.out.println("|     Name           :" + studentname + "|");
        System.out.println("|     Roll No        :" + rollno + "|");
        System.out.println("|                                     |");
        System.out.println("|_____________________________________|");
        System.out.println("|     Subjects       :        Marks   |");
        System.out.println("|_____________________________________|");
        System.out.println("|     Maths          :" + mathmark + "|");
        System.out.println("|     Science        :" + sciencemark + "|");
        System.out.println("|     English        :" + englishmark + "|");
        System.out.println("|_____________________________________|");
        System.out.println("|              Total                  |");
        System.out.println("|                                     |");
        System.out.println("|_____________________________________|");
        System.out.println("|     Percentage     :" + percentage + "|");
        System.out.println("|     Result         :" + result + "|");
        System.out.println("|     Grade          :" + grade + "|");
        System.out.println("|_____________________________________|");


    }
}
