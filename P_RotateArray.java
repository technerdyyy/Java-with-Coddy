class Rotate {
    public static int[] rotate(int[] array) {
        // Check if the array is empty or has only one element
        if (array == null || array.length <= 1) {
            return array;
        }
        
        // Create a new array to store the rotated result
        int[] rotatedArray = new int[array.length];
        
        // Move each element to the next position
        for (int i = 0; i < array.length; i++) {
            // Place element in the new position
            rotatedArray[(i + 1) % array.length] = array[i];
        }
        
        return rotatedArray;
    }
}

public class P_RotateArray{
    public static void main(String[] args) {
         int[] arr = {1, 2, 3}; 
        
        int[] result = Rotate.rotate(arr);
        System.out.println(java.util.Arrays.toString(result)); // Output: [3, 1, 2]
    }
}