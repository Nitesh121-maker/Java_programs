/**
 * Split the string
 * the intilize a string longest word
 * Run loop through the words array 
 * check if the length of the word id greater 
 * then put the value of word in longestword
 */
import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String str = scanner.nextLine();

        String[] words = str.split(" ");
        String longestword = "";
        
        for (String word : words) {
            if (word.length()>longestword.length()) {
                longestword = word;
            }
        }

        System.out.println("Longest Word:"+longestword);

        scanner.close();
    }
}
