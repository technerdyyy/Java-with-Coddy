// Write a function named isPrime that gets an integer num and returns true if num is a prime number otherwise false.

import java.util.Scanner;

public class J_IsPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        boolean result = IsPrime.isPrime(num);
        System.out.println(result);
    }

}

class IsPrime {
    public static boolean isPrime(int num) {
        // Write code here
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
