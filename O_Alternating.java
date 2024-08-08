/* Write a function named alternate that gets two arrays of integers and returns an array that is a combination of the arrays alternating.

Example :
alternate([1, 2, 3], [4, 5, 6])  ->  [1, 4, 2, 5, 3, 6] */


    class ArrayUtils {

        // Static method to combine two arrays alternately
        public static int[] alternate(int[] array1, int[] array2) {
            int length1 = array1.length;
            int length2 = array2.length;
            int resultLength = length1 + length2;
            int[] result = new int[resultLength];

            int i = 0; 
            int index1 = 0; 
            int index2 = 0; 

            while (index1 < length1 && index2 < length2) {
                result[i++] = array1[index1++];
                result[i++] = array2[index2++];
            }

            while (index1 < length1) {
                result[i++] = array1[index1++];
            }

            while (index2 < length2) {
                result[i++] = array2[index2++];
            }

            return result;
        }

    }

    public class O_Alternating {

    public static void main(String[] args) {
        int[] array1 = {10, 30, 50, 70, 80};
        int[] array2 = {20, 40, 60};

        int[] result = ArrayUtils.alternate(array1, array2);

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
