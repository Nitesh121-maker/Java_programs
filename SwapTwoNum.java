import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of A:");
        double a = scanner.nextDouble();
        System.out.println("Enter the value of B:");
        double b = scanner.nextDouble();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("value of A ="+a+"VAlue of B="+b);
        scanner.close();
    }
}
