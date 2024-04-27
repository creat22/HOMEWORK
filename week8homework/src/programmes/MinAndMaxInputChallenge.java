package programmes;

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int min = 0;
        int max = 0;
        while(true){
            System.out.println("Enter the numbers: ");
            if (sc.hasNextInt()) {
                int numbers = sc.nextInt();
                if (numbers < min) {
                    min = numbers;
                }
                if (numbers > max) {
                    max = numbers;
                }

            }
            else{
                System.out.println("Invalid Input. Terminate the programme");
                break;
            }
        }

        System.out.println("Min numner is: " +min);
        System.out.println("Max number is: " +max);
        sc.close();

    }
}
