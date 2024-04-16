package Week7Homework;

import java.util.Scanner;

public class Question15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter character: ");
        char input = sc.next().charAt(0);

        if((input >= 'a' && input <= 'z') ) {
            System.out.println("Input is an alphabet");}

            else if(( input >= '0' && input <= '9')) {
            System.out.println("Input is a number");
        }
        else
        {
            System.out.println("Input is symbol");
        }

                
    }
}
