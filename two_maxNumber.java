class Max {
    public static int max(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }
}

public class two_maxNumber {
    public static void main(String[] args) {

        int result = Max.max(132, 154);
        System.out.println("The maximum number is : " + result);
    }
}