package Week7Homework;

import java.util.Scanner;

public class Question13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);         //if else

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter operation symbol (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result;

        if (operation == '+') {
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (operation == '-') {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (operation == '*') {
            result = num1 * num2;
            System.out.println("Result: " + result);
        } else if (operation == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error: Division by zero");
            }
        } else {
            System.out.println("Invalid operation symbol");
        }

    }
}


