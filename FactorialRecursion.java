import java.util.Scanner;

public class FactorialRecursion {
      public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the num to find its factorial:");
         int num = scanner.nextInt();

         long factorial = CalculateFactorial(num);
         
         System.out.println("Factorial of number:"+factorial);

         scanner.close();
      }

      public static long CalculateFactorial(int n){
         if (n==0||n==1) {
            return 1;
         }

         return n*CalculateFactorial(n-1);
      }
}
