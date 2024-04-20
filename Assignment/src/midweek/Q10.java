package midweek;

/*Write a program to print the sum of two numbers entered by user by defining your own method.*/

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = sc.nextInt();

        int total = (num1 + num2);

        System.out.println("sum of num1 & num2 = " +total);

    }



}
