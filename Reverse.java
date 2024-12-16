import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to be reveresed:");
        int num = scanner.nextInt();
        int reversednum = 0;

        while (num != 0) {
            int lastDigit = num%10;
            reversednum = reversednum*10 + lastDigit;
            num = num/10;
        }

        // Print the Output
        System.out.println("Reversed Number: " + reversednum);
        scanner.close();
    }
}
