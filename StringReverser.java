
import java.util.Scanner;

class Reverse {
    public static String reverse(String s) {
        // checking if input is null
        if (s == null) {
            return null;
        }

        // creating a new StringBuilder instance with the input string
        StringBuilder reversedStringBuilder = new StringBuilder(s);

        // using reverse()method of StringBuilder to reverse the string
        reversedStringBuilder.reverse();

        // converting reversed StringBuilder back to string and return it
        return reversedStringBuilder.toString();
    }
}

public class StringReverser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Reverse.reverse(s));
        sc.close();
    }
}
