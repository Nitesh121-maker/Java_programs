// Assume the first element of the array is both the minimum and maximum.
// Traverse the array from the second element onwards:
// If an element is greater than the current max, update max.
// If an element is smaller than the current min, update min.
// At the end, max will have the largest number, and min will have the smallest.

import java.util.Scanner;
public class MinandMaxArray {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        // Taking array input
        System.out.println("Enter the elemment:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Finding the max and min

        int min = arr[0], max = arr[0];

        for (int i = 0; i < n; i++) {
            // maximum
            if (arr[i]>max) {
                max = arr[i];
            }
            // minimum
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        // minimum annd maximum value
        System.out.println("Maximum: "+max);
        System.out.println("maximum: "+min);
        scanner.close();
   }
}
