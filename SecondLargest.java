/**
 * Logic
 * 
 */
import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Element of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
         int max = Integer.MIN_VALUE;
         int secondmax = Integer.MIN_VALUE;
        // Find the 2nd largest
        for (int num : arr) {
            if (num > max) {
                secondmax = max;
                max = num;
            } else if(num > secondmax &&  num != max){
                secondmax = num;
            }
        }
        System.out.println("Largest element: "+ max);
        if (secondmax == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("The second largest element is: " + secondmax);
        }
        scanner.close();
    }
}
