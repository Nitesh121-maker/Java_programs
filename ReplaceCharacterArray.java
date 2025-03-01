import java.util.Scanner;

public class ReplaceCharacterArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        
        String str = scanner.nextLine();
        char[] charArray = str.toCharArray(); 
        System.out.println("Enter the character to be replaced from string: ");
        char character = scanner.next().charAt(0);
        System.out.println("Enter the character which will replace the character in string: ");
        char charone = scanner.next().charAt(0);
        
        // Replace the character
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == character) {
                charArray[i] = charone;
                break;
            }
        }

        String newStr = new String(charArray);
        System.out.println("New string: "+newStr);
        scanner.close();
    }
}
