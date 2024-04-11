package Week6Homework;
/* 20. Write a Java Program using below steps.
20.1 Declare your Spain as static variable.
20.2 Declare your United Kingdom as instance variable.
20.3 Declare instance method name homeCountry()and call static variable.
20.4 Declare static method name holidays() and call instance variable
20.5 Call both methods in main method. */
public class Question20 {

    static String country = "Spain";
    String country1 = "United Kingdom";

    public static void main(String [] args) { holidays();

        Question20 a = new Question20 ();
        a.homeCountry ();

    }
    public void homeCountry() {
        System.out.println(country);
    }
    public static void holidays() {
        Question20 x = new Question20 ();
        System.out.println(x.country1);
    }
}
