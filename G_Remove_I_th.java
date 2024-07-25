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