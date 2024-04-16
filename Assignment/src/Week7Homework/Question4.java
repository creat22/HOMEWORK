package Week7Homework;

public class Question4 {

    public static void main(String[] args) {

        String Code1 = "Janki,Rishi,Shubham";
        String Code2 = "Komal,Nirali,Minal";

        boolean iscontains = Code1.contains("Janki");

        if(Code1.contains("Janki")){     //condition 1 true

            System.out.println(Code1);


        }else

            System.out.println(Code2);

        if(Code1.contains("Komal")){           //condition2
            System.out.println(Code1);
        }else
            System.out.println(Code2);


    }
}
