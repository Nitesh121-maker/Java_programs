import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Num 1");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the num 2");
        double num2 = scanner.nextDouble();
        
        double sum = num1+num2;
        System.out.println("Sum = " + sum);
        // Close the scanner
        scanner.close();
    }
}