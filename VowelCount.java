import java.util.Scanner;
public class VowelCount {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        // Taking input and  conveting it to lower using function toLowerCase
        String str = scanner.nextLine().toLowerCase();

        int count = 0;

        // Loop throught the  string
        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                   count++;         
            }
        }
        System.out.println("The number of vowels present in the string :"+count);
        scanner.close();
    }
}