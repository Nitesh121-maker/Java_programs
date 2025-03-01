/**
 * Chek palindrome using reverse the strint 
 * if the reversed string is equal to actual string 
 * it is palindrome else it is not palindrome
 */
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        System.out.println("Enter the string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        
        // Using StringBuilder reverse
        String revStr = new StringBuilder(str).reverse().toString();
       //  Matche original with reversed string using equals function  
        if (str.equals(revStr)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }
        scanner.close();
    }
}
