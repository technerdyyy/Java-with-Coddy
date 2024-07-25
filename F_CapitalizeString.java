import java.util.Scanner;

class Capitalize {
    public static String capitalize(String s) {
        // Write code here
        if (s == null || s.isEmpty()) {
            return s;
        }

        String[] words = s.split(" ");

        StringBuilder capitalizedSentence = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
                capitalizedSentence.append(capitalizedWord).append(" ");
            }
        }
        return capitalizedSentence.toString().trim();
    }
}

public class F_CapitalizeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String newString = Capitalize.capitalize(s);
        System.out.println(newString);
    }
}