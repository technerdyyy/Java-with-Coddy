class SumCalculator {
    public static int sum(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }
}

public class D_Sum1toN {
    public static void main(String[] args) {
        int n = 10; // Example input
        System.out.println("The sum of numbers from 1 to " + n + " is: " + SumCalculator.sum(n));
    }

}


