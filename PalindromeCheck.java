/**
 * Using two pointer method 
 * go through the each character of the string 
 * we will match the character at left index equal to character at the right 
 * if it is equal throught the string we will return true else false
 */
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");

        String str = scanner.nextLine();

        if (isPalindrome(str)) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
        scanner.close();
    }

    // isPalindrome function 
    public static  boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;

        while (left<right) {
            if (str.charAt(left)!= str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
