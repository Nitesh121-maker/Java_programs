// The algorithm compares adjacent elements and swaps them if they are in the wrong order.
// This process repeats for each element until the largest element "bubbles" up to its correct position at the end of the array.
// After each iteration, the next largest element is placed in its correct position.
// This continues until the entire array is sorted.
import java.util.Scanner;
public class Bubbleshort {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Implement the bubble short 
        bubblesort(arr);

        // Sorted array
        System.out.println("Sorted array: ");
        for (int num : arr) {
           System.out.println(num+" ");
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
