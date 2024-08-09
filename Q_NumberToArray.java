/* Write a function named convert that gets a number and returns an array of integers representing this number.

Examples :
convert(123)  -> [1, 2, 3]
convert(91)  ->  [9, 1]
*/

import java.util.ArrayList;
import java.util.List;

class Convert {
    public static int[] convert(int number) {
        
        // Convert number to string to access each digit
        String numberStr = Integer.toString(number);
        
        // Create a list to hold the digits
        List<Integer> digitsList = new ArrayList<>();
        
        // Iterate over each character in the string
        for (char c : numberStr.toCharArray()) {
            // Convert character to integer and add to the list
            digitsList.add(Character.getNumericValue(c));
        }
        
        // Convert the list to an array
        int[] digitsArray = new int[digitsList.size()];
        for (int i = 0; i < digitsList.size(); i++) {
            digitsArray[i] = digitsList.get(i);
        }
        
        return digitsArray;
    }
}

public class Q_NumberToArray {
    public static void main(String[] args) {
        // Test cases
        int[] result1 = Convert.convert(123);
        int[] result2 = Convert.convert(91);
        
        System.out.println(java.util.Arrays.toString(result1)); // Output: [1, 2, 3]
        System.out.println(java.util.Arrays.toString(result2)); // Output: [9, 1]
    }
}

