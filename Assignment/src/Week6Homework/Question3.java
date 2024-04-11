package Week6Homework;

public class Question3 {

    static String name = "Java";
    static String name1 = "learn";
    int year = 1995;

   public static void main(String [] args) {

       Question3 main = new Question3 ();

       System.out.println(name+" is established in "+main.year+"."); //main method

       Question3 t = new Question3 ();
       t.m1 ();

demo2();
   }

   public void m1() {

       System.out.println(name1+" " +name); // instance method

   }
   public static void demo2() {

       Question3 l = new Question3 ();

       System.out.println(name +l.year); // static method
   }

}
