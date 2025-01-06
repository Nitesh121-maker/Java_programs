
import java.util.Scanner;

public class GratestOfThree {
    public static void main(String[] args){
        System.out.println("Enter first the number:");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            System.out.println("Enter second the number:");
            int b = sc.nextInt();
            System.out.println("Enter second the number:");
            int c = sc.nextInt();
            
            if (a>= b && a>=c) {
                System.err.println("The Greatest element is "+ a);
            }else if (b>=a && b<=a) {
                System.err.println("The Greatest element is "+ b);
            }else{
                System.err.println("The Greatest element is "+ c);
            }
        }
    }
}
