package midweek;

import java.util.Scanner;

/*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
 Take following input from user
 Number of classes held
 Number of classes attended.
 And print percentage of class attended Is student is allowed to sit in exam or not.
to allow student to sit if he/she has medical cause.
Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.*/
public class Q9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the NUmber of classes");
        int classes = sc.nextInt();

        System.out.println("Number of Classes attended");
        int attended = sc.nextInt();

        System.out.println("he/she has medical cause?: Y/N");
        char condition = sc.next().charAt(0);

        double percentage = (classes/attended)*100;

        if (percentage >75 || condition == 'Y'|| condition == 'y'){
            System.out.println("Student is allowed to sit in the exam");
        }
        else {
            System.out.println("Student is not allowed to sit in the exam");

        }

    }

}
