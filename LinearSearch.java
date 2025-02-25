/**
 * LinearSearch
 * Linear search is a simple searching algorithm that checks each 
 * element one by one until it finds the target value or reaches 
 * the end of the array.
 */
/**
 * Logic
 * Start from the first element of the array.
 * Compare it with the target element.
 * If found, return the index.
 * If not, continue searching until the end.
 * If the element is not found, return -1
 */
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array element: ");
        // Array input
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        // Element to search
        System.out.println("Enter the num to search: ");
        int num = scanner.nextInt();
        
        boolean found = false;

        // finnd the number in array 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            } 
        }
        if(!found) {
            System.out.println("Element not found ");
        }
        scanner.close();
    }
}