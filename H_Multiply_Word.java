// Write a function named mulWord that gets a string s and an integer n and returns the string n times with space between each.

class MulWord {
    public static String mulWord(String s, int n) {
        if (s == null || n <= 0) {
            throw new IllegalArgumentException("String cannot be null and n must be positive");
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(s);
            if (i < n - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String word = "hello";
        int times = 3;
        String result = mulWord(word, times);
        System.out.println(result); // prints "hello hello hello"
    }
}
