package Week7Homework;

public class Question26 {

    public static void main(String[] args) {

        String word = "dsaf";
        String reversedstr = "";

       for(int i = 0; i < word.length(); i++){
           reversedstr = word.charAt(i) + reversedstr;
       }
        System.out.println("Input a word: " +word);

        System.out.println("Reversed word: " +reversedstr);
    }

}
