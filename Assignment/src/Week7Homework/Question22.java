package Week7Homework;

public class Question22 {

    public static void main(String []args){

        double [] a = {1,8,6,7};


        double sum = 0;



        for(int i = 0; i < a.length; i++) {
            sum = sum + a[i];

        }
        double average =  sum / a.length;
            System.out.println("average value of array: " + average);



    }

}
