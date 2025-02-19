import java.util.Scanner;
public class VowelOrConsonent {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter characters separated by commas: ");
        String input = scanner.nextLine();
         
        String[] parts = input.split(",");

        char[] charArray = new char[parts.length];

        for(int i = 0 ; i<parts.length; i++){
            charArray[i] = parts[i].trim().charAt(0);

            if(isVowel(charArray[i])){
                System.out.println(charArray[i] + " - Vowel");
            }else if(Character.isLetter(charArray[i])){
                System.out.println(charArray[i] + " -- Consonant");
            }else{
                System.out.println(charArray[i] + " - not a letter");
            }
        }
        scanner.close();
        
    }

    // Functionn to check vowel
    public static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);  // Convert to lowercase for easy comparison
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    
}
