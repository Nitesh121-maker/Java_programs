/**
 * Logic
 * Sort the array before finding duplicate 
 * now if adjecent are equal consider it duplicate
 */

import java.util.Scanner;
public class RemoveDuplicate {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array content: ");
        for (int i = 0; i < n; i++) {
           arr[i] = scanner.nextInt();
        }

        bubblesort(arr);
        // find the duplicate
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i+1]) {
                System.out.println("Duplicate element: "+arr[i]);
            }
        }
        scanner.close();
    }

        // Bubble short function 
        public static void bubblesort (int[] arr){
            int n =  arr.length;
           
    
            for (int i = 0; i < n-1; i++) {
                boolean swapped = false;
                for (int j = 0; j < n-1; j++) {
                    if (arr[j]>arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        swapped = true;
                    }
                }
                        // If no swaps happened, the array is already sorted
                if (!swapped) {
                    break;
                }
            }
        }
}
