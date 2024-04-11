package Week6Homework;

/* 2. Write a Java programme using the following steps.
2.1 Declare two static variables.
2.2 Declare one static method.
2.3 Call both static variables into the static method inside the print statement. 2.4 Declare the Main method.
2.5 Call the static method into the Main method and run the programme. */

public class Question2 {

    static String Engname = "Janki"; // static global variable
    static int yearexp = 5;    // static global variable

    public static void main(String [] args) { // main method

        System.out.println(Engname +" is a tester");
        System.out.println("she has a "+yearexp+ "years of experience.");
demo1();
    }

        public static void demo1(){
        System.out.println("name");            //static method
            System.out.println(Engname);       //static variable
            System.out.println(yearexp+" years of experience");


    }


}
