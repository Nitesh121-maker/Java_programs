
import java.util.Scanner;

public class Primenum {
    static  boolean isPrime(int n){
        if (n<=1) {
            return false;
        }
        
        // Check for prime
        for(int i = 2; i<n; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int n;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the num");
            n = scanner.nextInt();
            if(isPrime(n)){
                System.out.println("Prime");
            }else{
                System.out.println("Not Prime");
            }
        }
    }
}