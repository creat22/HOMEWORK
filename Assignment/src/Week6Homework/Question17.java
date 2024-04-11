package Week6Homework;

public class Question17 {

    String city = "London";
    static String Country = "England";

    public static void main(String [] args) { stat1(); // main method

        Question17 a = new Question17 ();
        a.m1();
    }
    public void m1(){                     // instance method
        System.out.println(Country);
    }

    public static void stat1(){             // static method

        Question17 j = new Question17 ();

        System.out.println(j.city);
    }
}
