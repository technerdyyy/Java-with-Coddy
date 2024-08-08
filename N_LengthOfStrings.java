// Write a function named lens that gets an array of strings and returns an array of integers, where each element is the length of the string corresponding to the same index in the input array.
public class N_LengthOfStrings {

    // Main method to test the lens function
    public static void main(String[] args) {
        
        String[] input = {"apple", "banana", "cherry"};

        int[] result = LensUtil.lens(input);

        for (int length : result) {
            System.out.println(length);
        }
    }

    // Inner static class containing the lens method
    static class LensUtil {      
        public static int[] lens(String[] strings) {
           
            int[] lengths = new int[strings.length];

            for (int i = 0; i < strings.length; i++) {
                lengths[i] = strings[i].length();
            }

            return lengths;
        }
    }
}

