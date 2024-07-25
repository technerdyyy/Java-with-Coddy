// Write a function named "Remove" that gets a string and an integer and returns the string without a letter in the index corresponding to the integer.

class Remove {
    public static String remove(String s, int i) {
        // Write code here
        if (s == null || i < 0 || i >= s.length()) {
            throw new IllegalArgumentException("Invalid index");
        } else {
            return s.substring(0, i) + s.substring(i + 1);
        }
    }
}

public class G_Remove_I_th {
    public static void main(String[] args) {
        String original = "hello";
        int indexToRemove = 1;
        String result = Remove.remove(original, indexToRemove);
        System.out.println(result);
    }
}