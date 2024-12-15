import java.util.Scanner;
public class PositiveNegativeOrZero {
    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the No:");
        n = scanner.nextInt();
        if (n>0) {
            System.out.println("Number is Positive");
        } else if(n<0){
            System.out.println("Number is Negatve");
        } else{
            System.out.println("Number is Zero");
        }
        scanner.close();
    }
}
