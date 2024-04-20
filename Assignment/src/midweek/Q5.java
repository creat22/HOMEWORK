package midweek;

import java.util.Scanner;

/* Take two int values from user and print greatest among them.*/
public class Q5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        int n1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println(" The greatest number is:" + n1);
        } else if (n2 > n1) {
            System.out.println("The greates number is:" + n2);
        } else {
            System.out.println("Both numbers are equal");


        }

    }
}
