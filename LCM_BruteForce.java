// Logic
// Start from the maximum of the two numbers.
// Keep increasing it until you find a number that is divisible by both.
// That number is the LCM.

import java.util.Scanner;
public class LCM_BruteForce {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number a: ");
        int a = scanner.nextInt();
        System.out.println("Enter the number b: ");
        int b = scanner.nextInt();

        int max = Math.max(a,b);
        int lcm = max;

        while (true) {
            if (lcm % a == 0 && lcm % b ==0) {
                break;
            }
            lcm++;
        }

        System.out.println("LCM of " +a+ " and " +b+ "is:" + lcm);

        scanner.close();
    }
}
