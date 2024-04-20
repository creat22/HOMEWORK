package midweek;

import java.util.Scanner;

/* A student will not be allowed to sit in exam if his/her attendence is less than 75%.
 Take following input from user Number of classes held
 Number of classes attended.
And print
 percentage of class attended
 Is student is allowed to sit in exam or not.*/
public class Q8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Number os classes held");
        int classes = sc.nextInt();

        System.out.println("Number of classes attended");
        int attended = sc.nextInt();

        double percentage = (attended/classes)*100;

        if (percentage >75){
            System.out.println("student is allowed to sit in exam");}

            else {
                System.out.println("student is not allowed to sit in exam");

        }


    }
}
