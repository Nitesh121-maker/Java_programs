import java.util.Scanner;
public class FindtheSumofAllDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        int sum = 0;
        while (num>0) {
            int digit = num%10;
            sum = sum+digit;
            num = num/10;
        }
        System.out.println("Sum of digits:"+sum);
        scanner.close();
    }
}
