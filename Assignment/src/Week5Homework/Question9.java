package Week5Homework;

/* Write a Java program to print the result of the following operations.
Test Data: a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
Expected Output : 43
1
19
13 */

public class Question9 {

    public static void main(String [] args) {

        int x = 5, y = 8, z = 6;
        int result = -x+y*z;
        System.out.println( " Expected Output:" +result);

        int a = 55, b =9;
        int result1 =  (a+b)%b;
        System.out.println( "                 " +result1);

        int i = 20, j = 3, k = 15, l = 2;
        int result2 = i+ -j*x / y;
        int result3 = x+k/j*l-y%j;
        System.out.println( "                 " +result2);
        System.out.println( "                 " +result3);

    }
}
