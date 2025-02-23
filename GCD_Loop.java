import java.util.Scanner;
public class GCD_Loop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scanner.nextInt();
        System.out.println("Enter the second Line");
        int b = scanner.nextInt();
        int gcd = 1;
        int min = Math.min(a,b);
        for (int i = min; i >= 1 ; i--) {
            if (a%i == 0 && a%b == 0) {
                gcd = i;
                break;
            }
        }

        System.out.println("GCD of" +a+ " and " +b+ " is:"+gcd);
        scanner.close();
    }
}
