/**
 * Using two pointer method
 * Use two pointers, one at the beginning and one at the end.
 * Swap elements at these two positions.
 * Move the pointers towards each other.
 * Stop when the pointers meet or cross each other.
 */

import java.util.Scanner;
public class ArrayReverse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n");
        int n = scanner.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the array element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int left = 0 , right = n-1;
        // Reverse the array
        while (left<right) {
            int temp    =  arr[left];
            arr[left]   = arr[right];
            arr[right]  = temp;

            left  ++;
            right --;
        }

        System.out.println("Reverse array");
        for (int num : arr) {
            System.out.println(num+" ");
        }
       scanner.close();
    }
}
