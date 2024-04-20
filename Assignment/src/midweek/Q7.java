package midweek;

/* Take input of age of 3 people by user and determine oldest and youngest among them.*/

import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter First person age");
        int age1 = sc.nextInt();
        System.out.println("Enter Second person age");
        int age2 = sc.nextInt();
        System.out.println("Enter Third person age");
        int age3 = sc.nextInt();

      int oldest = Math.max(Math.max(age1,age2),age3);
      int youngest = Math.min(Math.min(age1,age2),age3);

        System.out.println("Oldest Person is:" +oldest);
        System.out.println("Youngest Person is:" +youngest);
    }
}
