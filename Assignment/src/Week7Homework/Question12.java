package Week7Homework;

import java.util.Scanner;

public class Question12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Alphabet A-F: ");

        char alphabet = sc.next().charAt(0);

        switch(alphabet){
            case 'A':
                System.out.println("Ahmedabad");
                break;
                case 'B':
                    System.out.println("Baroda");
                    break;
            case 'C':
                System.out.println("Calcutta");
                break;
            case 'D':
                System.out.println("Dunstable");
                break;
            case 'E':
                System.out.println("Elephant n Castle");
                break;
            case 'F':
                System.out.println("Finland");

            default:
                System.out.println("INVALID ENTRY");







        }
    }
}

