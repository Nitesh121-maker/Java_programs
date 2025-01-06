
import java.util.Scanner;

public class Fibonacci {
   public static int isFibonacci(int n){
        if (n==0) {
            return 0;
        }else if (n==1) {
            return 1;
        }
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {         
            int temp = a+b;
            a = b;
            b = temp;            
        }
        return b;
   } 
   // Main function 
   public static void main(String[] args) {
        int n;
        System.out.println("Enter the num:"); 
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i<=n;i++){
            System.out.println(isFibonacci(i)+" ");
        }

        sc.close();
   }
}
