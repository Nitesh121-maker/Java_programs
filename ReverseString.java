import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class ReverseString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str ;

        System.out.println("Enter the String: ");
        str = scanner.nextLine();

        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            result.append(reversedWord).append(" ");
        }

        System.out.println("Reversed String: " + result.toString().trim());
        
        scanner.close();
    }
}
