import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n:");
        n= scanner.nextInt();
        if (n%2 == 0) {
            System.out.println("The Entered number is Even");
        }else{
            System.out.println("The Enteed number is Odd");
        }
        // close the scanner
        scanner.close();
    }
}
