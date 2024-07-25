// Write a function named max that receives two numbers as input and returns the bigger number among the two.

class Max {
    public static int max(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }
}

public class B_maxNumber {
    public static void main(String[] args) {

        int result = Max.max(132, 154);
        System.out.println("The maximum number is : " + result);
    }
}