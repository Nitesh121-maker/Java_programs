import java.util.Scanner;

public class UppercaseConverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = scanner.nextLine();
        String result = input.toUpperCase();
        System.out.println("Result:"+result);
        scanner.close();
    }
}
