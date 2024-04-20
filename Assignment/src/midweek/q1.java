package midweek;

/*Take 10 integers from keyboard using loop and print their average value on the screen.*/

import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 integers: ");  // not sure how to do this????
        int numbers = sc.nextInt();
        int sum = 0;

        for(int i =0; i < 10; i++){

            sum = sum + i;
            double average = sum/10;
            System.out.println("Average of the integers: " +average);
        }
    }






}
