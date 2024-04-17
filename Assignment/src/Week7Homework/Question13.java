package Week7Homework;

import java.util.Scanner;

public class Question13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);         //if else

        System.out.print("Enter first number: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int n2 = scanner.nextInt();

        System.out.print("Enter operation symbol (+, -, *, /): ");
        char symbol = scanner.next().charAt(0);

        double result;

        if (symbol == '+') {
            result = n1 + n2;
            System.out.println("Result: " + result);
        } else if (symbol == '-') {
            result = n1 - n2;
            System.out.println("Result: " + result);
        } else if (symbol == '*') {
            result = n1 * n2;
            System.out.println("Result: " + result);
        } else if (symbol == '/') {
            if (n2 != 0) {
                result = n1 / n2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error: Division by zero");
            }
        } else {
            System.out.println("Invalid operation symbol");
        }

    }


}


