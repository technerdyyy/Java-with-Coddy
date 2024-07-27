import java.util.Scanner;

public class I_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.close();

        try {
            int result = Fibo.fibo(i);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Fibo {
    public static int fibo(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Index cannot be negative");
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }

        int a = 0, b = 1, c = 0;
        for (int j = 2; j <= i; j++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
