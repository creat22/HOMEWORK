package Week7Homework;

public class Stringmethods {



    public static void main(String[] args) {

        //String length
        String s1 = "Grumpy";
        String s2 = "Grisabel";

        System.out.println("String length is " +s1.length() +".");

        //String charAt
        char ch = s1.charAt(4);

        System.out.println("4th index character is "+ch +".");

        //String concat

        String m1 = "Welcome to the Velly";
        String m2 = " in winter time.";
        String m3 = m1.concat(m2);

        System.out.println(m3);

        //String contains

       String name1 ="welcome to the Earth";
       String name2 = "Hello to the world";
       boolean iscontains = name2.contains("world");

        System.out.println(name1.contains("welcome"));
        System.out.println(name1.contains("Hello"));
        System.out.println(name2.contains("World"));

        //String startsWith/endsWith

        System.out.println(name1.startsWith("w"));
        System.out.println(name2.startsWith("ll"));
        System.out.println(name1.endsWith("th"));

        //compare two strings: String equals

        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));

        String f1 = "janki";
        String f2 = "janki";                      // if..else
        String f3 = "Janki";

        if (f1.equals(f3))
        {
            System.out.println("both strings are equals");

        }else System.out.println("both strings are unequals");

        //String indexOf: substring/character

        String S1 = "something happened ";

        int index1 = S1.indexOf("me");

        System.out.println("The position of index me" +" is " +index1);
        System.out.println(S1.substring(0,5));


        //String replace

        String s = "I have to practice Java over and over and over again.";
        System.out.println(s.replace('e','a'));
        System.out.println(s.replace("over", "more"));

        //Lowercase:Uppercase

        s1 = "My name is Janki";

        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());

        //isEmpty
        System.out.println("Is this string emppty? "+s1.isEmpty());









    }
}
