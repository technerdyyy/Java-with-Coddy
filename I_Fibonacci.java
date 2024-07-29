/* Create a function named fibo that gets an integer i and returns the ith fibonacci series number.

The fibonacci series starts from 0 and 1 and each time the ith element equals the sum of the i-1th and i-2th elements.

So,

0th - 0
1th - 1
2th - 1 = 0 + 1
3th - 2 = 1 + 1
4th - 3 = 1 + 2
5th - 5 = 2 + 3
6th - 8 = 3 + 5
7th - 13 = 5 + 8 */

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
