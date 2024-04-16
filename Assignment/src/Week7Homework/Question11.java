package Week7Homework;

import java.util.Scanner;

public class Question11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter alphabet A-F: ");
        char Alphabet = sc.next().charAt(0);

        if (Alphabet == 'A') {
            System.out.println("Ahmedabad");
        }

        else if(Alphabet == 'B'){
            System.out.println("Baroda");
        }

        else if(Alphabet == 'C'){
            System.out.println("Calcutta");
        }

        else if(Alphabet == 'D'){
            System.out.println("Dunstable");
        }
        else if(Alphabet == 'E'){
            System.out.println("Enfield");
        }

        else if(Alphabet == 'F'){
            System.out.println("Fulham");
        }
        else System.out.println("INVALID ENTRY");
    }


}
