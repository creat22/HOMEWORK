package Week6Homework;
/* 19. Write a Java Program using below steps.
19.1 Declare one of your group member names as instance variable.
19.2 Declare one of your group member names as static variable.
19.3 Declare one instance method name with group name (e.g. selenium())and call both global variables.
19.4 Declare static method name agile() and call both variable
19.5 Call both user defined methods into main method. */
public class Question19 {

    String member = "Janki";
    static String member1 = "Drashti";

    public static void main(String [] args) {
        agile();

        Question19 a = new Question19();
        a.selenium();

    }


        public void selenium () {             // instance method
            String member3 = "Lucy";

            System.out.println(member3 + "\n" + member);
            System.out.println(member1);
        }
        public static void agile () {                // static method
            int number2 = 4152;
            Question19 d = new Question19();
            System.out.println(member1 + " , " + d.member + " = " + number2);
        }
}
