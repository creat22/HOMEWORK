package Week6Homework;

/* 4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme. */
public class Question4 {

    static String week = "Monday";
    static float time = 12.03f;
    String lname = "bus fare";
    int rent = 50;

    public static void main(String [] args) { // main method

        Question4 j = new Question4 ();
        Question4 t1 = new Question4 ();
        t1.in();

        System.out.println(week +" at "+time);
        System.out.println(j.lname+" £"+j.rent);

        stat();

    }
    public static void stat() { // static method
        Question4 l = new Question4 ();
        System.out.println( week+ " &"+" £ "+l.rent);

    }

    public void in() {
        System.out.println( week+" java class"+" at "+time);
        System.out.println( "£ "+lname+" paid "+" on "+week);
    }



}
