// Write a function named isPalindrome that gets an integer and returns true if the integer is a palindrome otherwise false.

class IsPalindrome {
    public static boolean isPalindrome(int num) {
        // Write code here
        String str = Integer.toString(num);
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);

    }
}

public class L_Palindrome{
    public static void main(String[] args) {
        System.out.println(IsPalindrome.isPalindrome(124565422));  // false
 
    }
}
