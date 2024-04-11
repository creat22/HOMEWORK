package Week5Homework;
/* Write a Java program to display. Expected Output 25 != 39 25 < 39 25 <= 39 */
public class Question14 {
    public static void main(String [] args) {
        int a = 25, b = 39;
        boolean res = a!=b;
        boolean res1 = a < b;
        boolean res2 = a <=39;
        System.out.println( res );
        System.out.println( res1 );
        System.out.println( res2 );
        System.out.println((a)+"!="+(b));
        System.out.println((a)+"<"+(b));
        System.out.print((a)+"<="+(b));


    }
}
