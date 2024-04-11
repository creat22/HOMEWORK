package Week6Homework;

/* 1. Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and run the programme. */
public class Question1 {

    String name = "Java"; // global instance variable
    String name1 = "Infosys";
    char grade =  'A';
    int emID = 12345;

    public static void main(String [] args) {   //main method

        Question1 demo = new Question1();

        System.out.println(demo.name + " is a language.");
        System.out.println("Employee ID is "+demo.emID);

        Question1 a = new Question1();
        a.m1();
    }

        public void m1() {  // instance method

            System.out.println("My Comapny name is "+name1+".");
            System.out.println( "It has " +grade+ " grade" +".");
        }




}
