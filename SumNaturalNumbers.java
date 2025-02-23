import java.util.Scanner;;
public class SumNaturalNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Enter the N:");
        int N = scan.nextInt();
        int Sum = 0;
        for (int i = 1; i <= N; i++) {
            Sum = Sum+i;
        }

        System.out.print("Sum of first " + N + " natural numbers="+Sum);
        scan.close();
    }
}
