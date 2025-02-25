/**
 * To check if an array is sorted, we need to verify that each element is 
 * smaller than or equal to the next one (for ascending order).
 * Logic
 * Loop through the array from index 0 to n-2
 * Compare each element with the next one.
 * If any element is greater than the next one, the array is not sorted.
 * If the loop completes without finding an unsorted pair, the array is sorted.
 */
import java.util.Scanner;
public class Checksorted {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = scanner.nextInt();

        int arr[] = new int[n];
         
        // enter the element of the array
        System.out.println("Enter the array element");
        for (int i = 0; i < n; i++) {
           arr[i] = scanner.nextInt(); 
        }

        // check the array is sorted or not
        boolean sorted = true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                sorted = false;
            }
        }
        // Is array sorted
        if (sorted) {
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }scanner.close();
    }
}
