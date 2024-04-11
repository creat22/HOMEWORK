package Week6Homework;

public class Question18 {

    static String council = "Harrow";
    int number = 9;

    public static void main(String [] args){ address();

        Question18 a = new Question18 ();
        a.borough();
    }

    public void borough() {
        System.out.println(council);     // instance method
    }
    public static void address(){

        Question18 k = new Question18 ();

        System.out.println(k.number);         // static method
    }
}
