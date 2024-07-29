// Write a function named fact that gets num and returns the factorial of num.

class Fact {
    public static int fact(int num) {
        // Write code here
        if (num < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

}

public class K_Factorial {
    public static void main(String[] args) {
        int factorial = Fact.fact(6); // output : 720
        System.out.println(factorial);
    }
}