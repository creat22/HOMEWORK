package programmes;

import java.util.Scanner;

/*Write a Java program that takes the user to provide a single character from the alphabet.
Print Vowel of Consonant, depending on the user input. If the user input Is not a letter
        (between a and z or A and Z), or is a string of length > 1, print an error message.
For eg:
Input an alphabet: p Expected Output:
Input letter is Consonant*/
public class Question3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input an alphabet");
        String input = sc.nextLine().toLowerCase();

        if(input.length() == 1 ) {
            char ch = input.charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Expected output: " +"Input letter is vowel");
            } else {
                System.out.println("Expected output: " +"Input letter is Consonant");
            }
        }

            else{
                System.out.println("Error: Please enter single alphabet");
                sc.close();
        }
    }


}
