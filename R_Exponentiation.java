import java.util.Scanner;

class Exponentiation {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int exponent = scanner.nextInt();
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        System.out.println(result);
        scanner.close();
    }

}