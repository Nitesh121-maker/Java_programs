import java.util.Scanner;

public class GCD_Euclidean {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num a: ");
        int a = scanner.nextInt();
        System.out.println("Enter the num b: ");
        int b = scanner.nextInt();

        int gcd = findGCD(a, b);

        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        scanner.close();
    }
    
    public static int findGCD(int a , int b){
       while (b!=0) {
        int temp = b;
        b = a%b;
        a = temp;
       }
       return a;
    }
}
