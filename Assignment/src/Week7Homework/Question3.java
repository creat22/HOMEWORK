package Week7Homework;

public class Question3 {

    public static void main(String[] args) {

        String[][] CountriesCities = {{"India", "Delhi"},
                {"England", "London"},
                {"Spain", "Madrid"},
                {"Ireland", "Dublin"},
                {"China", "Beijing"},
        };

        {
            for (int i = 0; i < CountriesCities.length; i++) {
                for (int j = 0; j < CountriesCities[i].length; j++) {
                    System.out.print(CountriesCities[i][j]+" ");
                }
                System.out.println();
            }


        }
    }
}
