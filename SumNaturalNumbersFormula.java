import java.util.Scanner;
public class SumNaturalNumbersFormula{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the n:");
       int n = scanner.nextInt();

       int sum = (n*(n+1))/2;
       System.out.println("Sum of the naturan number n:"+sum);
       scanner.close();
    }
}