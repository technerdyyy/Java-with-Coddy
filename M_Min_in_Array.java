// Write a function named min that gets an array of integers and returns the minimum number.

class Min {
    public static int min(int[] arr) {
        // Write code here
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int minValue = Integer.MAX_VALUE;
        for (int number : arr) {
            if (number < minValue) {
                minValue = number;
            }
        }

        return minValue;
    }
}

public class M_Min_in_Array{
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8};
        System.out.println(Min.min(arr)); // Output: 2
    }
}