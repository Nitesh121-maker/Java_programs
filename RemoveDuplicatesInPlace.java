/**
 * Logic
 * find the duplicste after dorting array
 * if the element is duplicate skip it otherwise store it in another array
 */
import java.util.Arrays;
import java.util.Scanner;
public class RemoveDuplicatesInPlace {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = scanner.nextInt();

        // Enter the content of the array
        System.out.println("Enter the aray content: ");
        int[] arr =  new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        //Sort the array to find the duplicate
        Arrays.sort(arr);
        int j = 0;
        
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i+1]) {
                System.out.println("Duplicate array element: "+ arr[i]);
            } else {
                 arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[arr.length - 1]; 
        System.out.println("Array without duplicates: " + Arrays.toString(Arrays.copyOf(arr, j)));

        scanner.close();
    }
}
